package com.company.orm.servicebuilder.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VacancyLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VacancyLocalService
 * @generated
 */
public class VacancyLocalServiceWrapper implements VacancyLocalService,
    ServiceWrapper<VacancyLocalService> {
    private VacancyLocalService _vacancyLocalService;

    public VacancyLocalServiceWrapper(VacancyLocalService vacancyLocalService) {
        _vacancyLocalService = vacancyLocalService;
    }

    /**
    * Adds the vacancy to the database. Also notifies the appropriate model listeners.
    *
    * @param vacancy the vacancy
    * @return the vacancy that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.company.orm.servicebuilder.model.Vacancy addVacancy(
        com.company.orm.servicebuilder.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.addVacancy(vacancy);
    }

    /**
    * Creates a new vacancy with the primary key. Does not add the vacancy to the database.
    *
    * @param url the primary key for the new vacancy
    * @return the new vacancy
    */
    @Override
    public com.company.orm.servicebuilder.model.Vacancy createVacancy(
        java.lang.String url) {
        return _vacancyLocalService.createVacancy(url);
    }

    /**
    * Deletes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param url the primary key of the vacancy
    * @return the vacancy that was removed
    * @throws PortalException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.company.orm.servicebuilder.model.Vacancy deleteVacancy(
        java.lang.String url)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.deleteVacancy(url);
    }

    /**
    * Deletes the vacancy from the database. Also notifies the appropriate model listeners.
    *
    * @param vacancy the vacancy
    * @return the vacancy that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.company.orm.servicebuilder.model.Vacancy deleteVacancy(
        com.company.orm.servicebuilder.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.deleteVacancy(vacancy);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _vacancyLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.company.orm.servicebuilder.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.company.orm.servicebuilder.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.company.orm.servicebuilder.model.Vacancy fetchVacancy(
        java.lang.String url)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.fetchVacancy(url);
    }

    /**
    * Returns the vacancy with the primary key.
    *
    * @param url the primary key of the vacancy
    * @return the vacancy
    * @throws PortalException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.company.orm.servicebuilder.model.Vacancy getVacancy(
        java.lang.String url)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.getVacancy(url);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the vacancies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.company.orm.servicebuilder.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancies
    * @param end the upper bound of the range of vacancies (not inclusive)
    * @return the range of vacancies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.company.orm.servicebuilder.model.Vacancy> getVacancies(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.getVacancies(start, end);
    }

    /**
    * Returns the number of vacancies.
    *
    * @return the number of vacancies
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getVacanciesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.getVacanciesCount();
    }

    /**
    * Updates the vacancy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param vacancy the vacancy
    * @return the vacancy that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.company.orm.servicebuilder.model.Vacancy updateVacancy(
        com.company.orm.servicebuilder.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancyLocalService.updateVacancy(vacancy);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _vacancyLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _vacancyLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _vacancyLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.company.orm.servicebuilder.model.Vacancy addVacancy(
        com.company.grabber.VacancyDto vacancyDto) {
        return _vacancyLocalService.addVacancy(vacancyDto);
    }

    @Override
    public java.util.List<com.company.orm.servicebuilder.model.Vacancy> getAll() {
        return _vacancyLocalService.getAll();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public VacancyLocalService getWrappedVacancyLocalService() {
        return _vacancyLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedVacancyLocalService(
        VacancyLocalService vacancyLocalService) {
        _vacancyLocalService = vacancyLocalService;
    }

    @Override
    public VacancyLocalService getWrappedService() {
        return _vacancyLocalService;
    }

    @Override
    public void setWrappedService(VacancyLocalService vacancyLocalService) {
        _vacancyLocalService = vacancyLocalService;
    }
}
