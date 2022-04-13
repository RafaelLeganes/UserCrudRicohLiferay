package PorletCrud.portlet;

import PorletCrud.constants.PortletCrudPortletKeys;
import PortletService.model.Usuario;
import PortletService.service.UsuarioLocalServiceUtil;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Rafael Perez
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.RafaUserCrud",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=PortletCrud",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletCrudPortletKeys.PORTLETCRUD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletCrudPortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@ProcessAction(name = "addUsuario")
	public void addEscritor(ActionRequest request, ActionResponse response) {
		String nombre = ParamUtil.getString(request,"nombre");
		String apellidos = ParamUtil.getString(request,"apellidos");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaNacimiento = ParamUtil.getDate(request, "fechaNacimiento",sdf);
		String correo = ParamUtil.getString(request, "correo");
	    Date fechaSistema = new Date();
		Usuario reg = UsuarioLocalServiceUtil.createUsuario(CounterLocalServiceUtil.increment(Usuario.class.getName()));
		reg.setNombre(nombre);
		reg.setApellidos(apellidos);
		reg.setFechaNacimiento(fechaNacimiento);
		reg.setCorreo(correo);
		reg.setCreateDate(fechaSistema);		
        try{
            CaptchaUtil.check(request);
            log.info("CAPTCHA verification successful.");	    
    		UsuarioLocalServiceUtil.addUsuario(reg);
    		sendEmail(correo);
    		response.getRenderParameters().setValue("jspPage","/RegistryForm.jsp");
        }catch(Exception exception) {
            if(exception instanceof CaptchaTextException) {
                SessionErrors.add(request, exception.getClass(), exception);
                log.error("CAPTCHA verification failed.");
            }
        }
    
	}
	
	@ProcessAction(name = "getUsuarios")
	public void getUsuarios(ActionRequest request, ActionResponse response) {
		List<Usuario> listaUsuarios = UsuarioLocalServiceUtil.getUsuarios(0,UsuarioLocalServiceUtil.getUsuariosCount());
		request.setAttribute("listaUsuarios", listaUsuarios);
		response.getRenderParameters().setValue("jspPage","/ShowUsers.jsp");
	}
	
	@ProcessAction(name = "modifyUsuario")
	public void modifyUsuario(ActionRequest request,
			ActionResponse response)  throws IOException, PortletException {
		String usuarioId = ParamUtil.getString(request,"usuarioId");
		String nombre = ParamUtil.getString(request,"nombre"+usuarioId);
		String apellidos = ParamUtil.getString(request,"apellidos"+usuarioId);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaNacimiento = ParamUtil.getDate(request, "fechaNacimiento"+usuarioId,sdf);
		String correo = ParamUtil.getString(request, "correo"+usuarioId);
		Usuario user = null;
		if(usuarioId.length()>0 && nombre.length()>0 && apellidos.length()>0 && correo.length()>0) {
			try {
				user = UsuarioLocalServiceUtil.getUsuario(Long.valueOf(ParamUtil.getString(request,"usuarioId")));
				user.setNombre(nombre);
				user.setApellidos(apellidos);
				user.setFechaNacimiento(fechaNacimiento);
				user.setCorreo(correo);
				UsuarioLocalServiceUtil.updateUsuario(user);
				log.info("User Modified Successfully.");	
			} catch (NumberFormatException | PortalException e) {
				e.printStackTrace();
				log.error("User Modify Failed.");
			}
		}
		List<Usuario> listaUsuarios = UsuarioLocalServiceUtil.getUsuarios(0,UsuarioLocalServiceUtil.getUsuariosCount());
		request.setAttribute("listaUsuarios", listaUsuarios);
		response.getRenderParameters().setValue("jspPage","/Modify.jsp");
	}
	
	@ProcessAction(name = "deleteUsuario")
	public void deleteUsuario(ActionRequest request,
			ActionResponse response)  throws IOException, PortletException {
		String usuarioId = ParamUtil.getString(request,"usuarioId");
		if(usuarioId.length()>0) {
		Long lusuarioId = Long.valueOf(ParamUtil.getString(request,"usuarioId"));
			try {
				UsuarioLocalServiceUtil.deleteUsuario(lusuarioId);
				log.info("User Deleted Successfully.");	
			} catch (PortalException e) {
				e.printStackTrace();
				log.error("User Delete Failed.");
			}
		}
		List<Usuario> listaUsuarios = UsuarioLocalServiceUtil.getUsuarios(0,UsuarioLocalServiceUtil.getUsuariosCount());
		request.setAttribute("listaUsuarios", listaUsuarios);
		response.getRenderParameters().setValue("jspPage","/Delete.jsp");
	}
		
    @Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
        throws  IOException, PortletException {
        try {
            CaptchaUtil.serveImage(resourceRequest, resourceResponse);
        }catch(Exception exception) {
            log.error(exception.getMessage(), exception);
        }
    }
 
    protected boolean isCheckMethodOnProcessAction() {
        return _CHECK_METHOD_ON_PROCESS_ACTION;
    }
 
    private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;
    
    private void sendEmail(String mail) {
        try {
            MailMessage mailMessage = new MailMessage();
            mailMessage.setBody("Usuario creado correctamente");
            mailMessage.setHTMLFormat(true);
            mailMessage.setFrom(new InternetAddress("rafael.pereztorrecilla@gmail.com","Rafael Pérez"));
            mailMessage.setTo(new InternetAddress(mail));
            mailMessage.setSubject("Alta Usuario");
            MailServiceUtil.sendEmail(mailMessage);
            log.info("Mail Send Successfully.");
        } catch (Exception e) {
        	log.error("Mail Send Failed.");
            throw new RuntimeException(e);
        }
    }
}