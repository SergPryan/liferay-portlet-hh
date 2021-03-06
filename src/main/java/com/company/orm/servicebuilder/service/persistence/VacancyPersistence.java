package com.company.orm.servicebuilder.service.persistence;

import com.company.orm.servicebuilder.model.Vacancy;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the vacancy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacancyPersistenceImpl
 * @see VacancyUtil
 * @generated
 */
public interface VacancyPersistence extends BasePersistence<Vacancy> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link VacancyUtil} to access the vacancy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the vacancy in the entity cache if it is enabled.
    *
    * @param vacancy the vacancy
    */
    public void cacheResult(
        com.company.orm.servicebuilder.model.Vacancy vacancy);

    /**
    * Caches the vacancies in the entity cache if it is enabled.
    *
    * @param vacancies the vacancies
    */
    public void cacheResult(
        java.util.List<com.company.orm.servicebuilder.model.Vacancy> vacancies);

    /**
    * Creates a new vacancy with the primary key. Does not add the vacancy to the database.
    *
    * @param url the primary key for the new vacancy
    * @return the new vacancy
    */
    public com.company.orm.servicebuilder.model.Vacancy create(
        java.lang.String url);

    /**
    * Removes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param url the primary key of the vacancy
    * @return the vacancy that was removed
    * @throws com.company.orm.servicebuilder.NoSuchVacancyException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.company.orm.servicebuilder.model.Vacancy remove(
        java.lang.String url)
        throws com.company.orm.servicebuilder.NoSuchVacancyException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.company.orm.servicebuilder.model.Vacancy updateImpl(
        com.company.orm.servicebuilder.model.Vacancy vacancy)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the vacancy with the primary key or throws a {@link com.company.orm.servicebuilder.NoSuchVacancyException} if it could not be found.
    *
    * @param url the primary key of the vacancy
    * @return the vacancy
    * @throws com.company.orm.servicebuilder.NoSuchVacancyException if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.company.orm.servicebuilder.model.Vacancy findByPrimaryKey(
        java.lang.String url)
        throws com.company.orm.servicebuilder.NoSuchVacancyException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the vacancy with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param url the primary key of the vacancy
    * @return the vacancy, or <code>null</code> if a vacancy with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.company.orm.servicebuilder.model.Vacancy fetchByPrimaryKey(
        java.lang.String url)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the vacancies.
    *
    * @return the vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.company.orm.servicebuilder.model.Vacancy> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.company.orm.servicebuilder.model.Vacancy> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the vacancies.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.company.orm.servicebuilder.model.impl.VacancyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of vacancies
    * @param end the upper bound of the range of vacancies (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of vacancies
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.company.orm.servicebuilder.model.Vacancy> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the vacancies from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of vacancies.
    *
    * @return the number of vacancies
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
