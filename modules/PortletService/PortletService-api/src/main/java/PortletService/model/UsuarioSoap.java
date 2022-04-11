/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package PortletService.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link PortletService.service.http.UsuarioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class UsuarioSoap implements Serializable {

	public static UsuarioSoap toSoapModel(Usuario model) {
		UsuarioSoap soapModel = new UsuarioSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setUsuarioId(model.getUsuarioId());
		soapModel.setNombre(model.getNombre());
		soapModel.setApellidos(model.getApellidos());
		soapModel.setFechaNacimiento(model.getFechaNacimiento());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setCorreo(model.getCorreo());

		return soapModel;
	}

	public static UsuarioSoap[] toSoapModels(Usuario[] models) {
		UsuarioSoap[] soapModels = new UsuarioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsuarioSoap[][] toSoapModels(Usuario[][] models) {
		UsuarioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsuarioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsuarioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsuarioSoap[] toSoapModels(List<Usuario> models) {
		List<UsuarioSoap> soapModels = new ArrayList<UsuarioSoap>(
			models.size());

		for (Usuario model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsuarioSoap[soapModels.size()]);
	}

	public UsuarioSoap() {
	}

	public long getPrimaryKey() {
		return _usuarioId;
	}

	public void setPrimaryKey(long pk) {
		setUsuarioId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getUsuarioId() {
		return _usuarioId;
	}

	public void setUsuarioId(long usuarioId) {
		_usuarioId = usuarioId;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getApellidos() {
		return _apellidos;
	}

	public void setApellidos(String apellidos) {
		_apellidos = apellidos;
	}

	public Date getFechaNacimiento() {
		return _fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		_fechaNacimiento = fechaNacimiento;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getCorreo() {
		return _correo;
	}

	public void setCorreo(String correo) {
		_correo = correo;
	}

	private String _uuid;
	private long _usuarioId;
	private String _nombre;
	private String _apellidos;
	private Date _fechaNacimiento;
	private Date _createDate;
	private String _correo;

}