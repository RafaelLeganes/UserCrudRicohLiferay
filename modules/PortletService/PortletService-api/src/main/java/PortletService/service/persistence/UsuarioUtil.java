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

package PortletService.service.persistence;

import PortletService.model.Usuario;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the usuario service. This utility wraps <code>PortletService.service.persistence.impl.UsuarioPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioPersistence
 * @generated
 */
public class UsuarioUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Usuario usuario) {
		getPersistence().clearCache(usuario);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Usuario> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Usuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Usuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Usuario> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Usuario update(Usuario usuario) {
		return getPersistence().update(usuario);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Usuario update(
		Usuario usuario, ServiceContext serviceContext) {

		return getPersistence().update(usuario, serviceContext);
	}

	/**
	 * Returns all the usuarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching usuarios
	 */
	public static List<Usuario> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the usuarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of matching usuarios
	 */
	public static List<Usuario> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the usuarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching usuarios
	 */
	public static List<Usuario> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the usuarios where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching usuarios
	 */
	public static List<Usuario> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Usuario> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public static Usuario findByUuid_First(
			String uuid, OrderByComparator<Usuario> orderByComparator)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public static Usuario fetchByUuid_First(
		String uuid, OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public static Usuario findByUuid_Last(
			String uuid, OrderByComparator<Usuario> orderByComparator)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last usuario in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public static Usuario fetchByUuid_Last(
		String uuid, OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the usuarios before and after the current usuario in the ordered set where uuid = &#63;.
	 *
	 * @param usuarioId the primary key of the current usuario
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public static Usuario[] findByUuid_PrevAndNext(
			long usuarioId, String uuid,
			OrderByComparator<Usuario> orderByComparator)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().findByUuid_PrevAndNext(
			usuarioId, uuid, orderByComparator);
	}

	/**
	 * Removes all the usuarios where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of usuarios where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching usuarios
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the usuarios where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the matching usuarios
	 */
	public static List<Usuario> findByNombre(String nombre) {
		return getPersistence().findByNombre(nombre);
	}

	/**
	 * Returns a range of all the usuarios where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of matching usuarios
	 */
	public static List<Usuario> findByNombre(
		String nombre, int start, int end) {

		return getPersistence().findByNombre(nombre, start, end);
	}

	/**
	 * Returns an ordered range of all the usuarios where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching usuarios
	 */
	public static List<Usuario> findByNombre(
		String nombre, int start, int end,
		OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().findByNombre(
			nombre, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the usuarios where nombre = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param nombre the nombre
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching usuarios
	 */
	public static List<Usuario> findByNombre(
		String nombre, int start, int end,
		OrderByComparator<Usuario> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByNombre(
			nombre, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first usuario in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public static Usuario findByNombre_First(
			String nombre, OrderByComparator<Usuario> orderByComparator)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().findByNombre_First(nombre, orderByComparator);
	}

	/**
	 * Returns the first usuario in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public static Usuario fetchByNombre_First(
		String nombre, OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().fetchByNombre_First(nombre, orderByComparator);
	}

	/**
	 * Returns the last usuario in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario
	 * @throws NoSuchUsuarioException if a matching usuario could not be found
	 */
	public static Usuario findByNombre_Last(
			String nombre, OrderByComparator<Usuario> orderByComparator)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().findByNombre_Last(nombre, orderByComparator);
	}

	/**
	 * Returns the last usuario in the ordered set where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching usuario, or <code>null</code> if a matching usuario could not be found
	 */
	public static Usuario fetchByNombre_Last(
		String nombre, OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().fetchByNombre_Last(nombre, orderByComparator);
	}

	/**
	 * Returns the usuarios before and after the current usuario in the ordered set where nombre = &#63;.
	 *
	 * @param usuarioId the primary key of the current usuario
	 * @param nombre the nombre
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public static Usuario[] findByNombre_PrevAndNext(
			long usuarioId, String nombre,
			OrderByComparator<Usuario> orderByComparator)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().findByNombre_PrevAndNext(
			usuarioId, nombre, orderByComparator);
	}

	/**
	 * Removes all the usuarios where nombre = &#63; from the database.
	 *
	 * @param nombre the nombre
	 */
	public static void removeByNombre(String nombre) {
		getPersistence().removeByNombre(nombre);
	}

	/**
	 * Returns the number of usuarios where nombre = &#63;.
	 *
	 * @param nombre the nombre
	 * @return the number of matching usuarios
	 */
	public static int countByNombre(String nombre) {
		return getPersistence().countByNombre(nombre);
	}

	/**
	 * Caches the usuario in the entity cache if it is enabled.
	 *
	 * @param usuario the usuario
	 */
	public static void cacheResult(Usuario usuario) {
		getPersistence().cacheResult(usuario);
	}

	/**
	 * Caches the usuarios in the entity cache if it is enabled.
	 *
	 * @param usuarios the usuarios
	 */
	public static void cacheResult(List<Usuario> usuarios) {
		getPersistence().cacheResult(usuarios);
	}

	/**
	 * Creates a new usuario with the primary key. Does not add the usuario to the database.
	 *
	 * @param usuarioId the primary key for the new usuario
	 * @return the new usuario
	 */
	public static Usuario create(long usuarioId) {
		return getPersistence().create(usuarioId);
	}

	/**
	 * Removes the usuario with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario that was removed
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public static Usuario remove(long usuarioId)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().remove(usuarioId);
	}

	public static Usuario updateImpl(Usuario usuario) {
		return getPersistence().updateImpl(usuario);
	}

	/**
	 * Returns the usuario with the primary key or throws a <code>NoSuchUsuarioException</code> if it could not be found.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario
	 * @throws NoSuchUsuarioException if a usuario with the primary key could not be found
	 */
	public static Usuario findByPrimaryKey(long usuarioId)
		throws PortletService.exception.NoSuchUsuarioException {

		return getPersistence().findByPrimaryKey(usuarioId);
	}

	/**
	 * Returns the usuario with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param usuarioId the primary key of the usuario
	 * @return the usuario, or <code>null</code> if a usuario with the primary key could not be found
	 */
	public static Usuario fetchByPrimaryKey(long usuarioId) {
		return getPersistence().fetchByPrimaryKey(usuarioId);
	}

	/**
	 * Returns all the usuarios.
	 *
	 * @return the usuarios
	 */
	public static List<Usuario> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @return the range of usuarios
	 */
	public static List<Usuario> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of usuarios
	 */
	public static List<Usuario> findAll(
		int start, int end, OrderByComparator<Usuario> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the usuarios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UsuarioModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of usuarios
	 * @param end the upper bound of the range of usuarios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of usuarios
	 */
	public static List<Usuario> findAll(
		int start, int end, OrderByComparator<Usuario> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the usuarios from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of usuarios.
	 *
	 * @return the number of usuarios
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UsuarioPersistence getPersistence() {
		return _persistence;
	}

	private static volatile UsuarioPersistence _persistence;

}