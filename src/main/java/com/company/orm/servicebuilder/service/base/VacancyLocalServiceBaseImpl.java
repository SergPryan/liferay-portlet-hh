package com.company.orm.servicebuilder.service.base;

import com.company.orm.servicebuilder.model.Vacancy;
import com.company.orm.servicebuilder.service.VacancyLocalService;
import com.company.orm.servicebuilder.service.persistence.VacancyPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the vacancy local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.company.orm.servicebuilder.service.impl.VacancyLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.company.orm.servicebuilder.service.impl.VacancyLocalServiceImpl
 * @see com.company.orm.servicebuilder.service.VacancyLocalServiceUtil
 * @generated
 */
public abstract class VacancyLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements VacancyLocalService, IdentifiableBean {
    @BeanReference(type = com.company.orm.servicebuilder.service.VacancyLocalService.class)
    protected com.company.orm.servicebuilder.service.VacancyLocalService vacancyLocalService;
    @BeanReference(type = com.company.orm.servicebuilder.service.VacancyService.class)
    protected com.company.orm.servicebuilder.service.VacancyService vacancyService;
    @BeanReference(type = VacancyPersistence.class)
    protected VacancyPersistence vacancyPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private VacancyLocalServiceClpInvoker _clpInvoker = new VacancyLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.company.orm.servicebuilder.service.VacancyLocalServiceUtil} to access the vacancy local service.
     */

    /**
     * Adds the vacancy to the database. Also notifies the appropriate model listeners.
     *
     * @param vacancy the vacancy
     * @return the vacancy that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Vacancy addVacancy(Vacancy vacancy) throws SystemException {
        vacancy.setNew(true);

        return vacancyPersistence.update(vacancy);
    }

    /**
     * Creates a new vacancy with the primary key. Does not add the vacancy to the database.
     *
     * @param url the primary key for the new vacancy
     * @return the new vacancy
     */
    @Override
    public Vacancy createVacancy(String url) {
        return vacancyPersistence.create(url);
    }

    /**
     * Deletes the vacancy with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param url the primary key of the vacancy
     * @return the vacancy that was removed
     * @throws PortalException if a vacancy with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Vacancy deleteVacancy(String url)
        throws PortalException, SystemException {
        return vacancyPersistence.remove(url);
    }

    /**
     * Deletes the vacancy from the database. Also notifies the appropriate model listeners.
     *
     * @param vacancy the vacancy
     * @return the vacancy that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Vacancy deleteVacancy(Vacancy vacancy) throws SystemException {
        return vacancyPersistence.remove(vacancy);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Vacancy.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return vacancyPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return vacancyPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return vacancyPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return vacancyPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return vacancyPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Vacancy fetchVacancy(String url) throws SystemException {
        return vacancyPersistence.fetchByPrimaryKey(url);
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
    public Vacancy getVacancy(String url)
        throws PortalException, SystemException {
        return vacancyPersistence.findByPrimaryKey(url);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return vacancyPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Vacancy> getVacancies(int start, int end)
        throws SystemException {
        return vacancyPersistence.findAll(start, end);
    }

    /**
     * Returns the number of vacancies.
     *
     * @return the number of vacancies
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getVacanciesCount() throws SystemException {
        return vacancyPersistence.countAll();
    }

    /**
     * Updates the vacancy in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param vacancy the vacancy
     * @return the vacancy that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Vacancy updateVacancy(Vacancy vacancy) throws SystemException {
        return vacancyPersistence.update(vacancy);
    }

    /**
     * Returns the vacancy local service.
     *
     * @return the vacancy local service
     */
    public com.company.orm.servicebuilder.service.VacancyLocalService getVacancyLocalService() {
        return vacancyLocalService;
    }

    /**
     * Sets the vacancy local service.
     *
     * @param vacancyLocalService the vacancy local service
     */
    public void setVacancyLocalService(
        com.company.orm.servicebuilder.service.VacancyLocalService vacancyLocalService) {
        this.vacancyLocalService = vacancyLocalService;
    }

    /**
     * Returns the vacancy remote service.
     *
     * @return the vacancy remote service
     */
    public com.company.orm.servicebuilder.service.VacancyService getVacancyService() {
        return vacancyService;
    }

    /**
     * Sets the vacancy remote service.
     *
     * @param vacancyService the vacancy remote service
     */
    public void setVacancyService(
        com.company.orm.servicebuilder.service.VacancyService vacancyService) {
        this.vacancyService = vacancyService;
    }

    /**
     * Returns the vacancy persistence.
     *
     * @return the vacancy persistence
     */
    public VacancyPersistence getVacancyPersistence() {
        return vacancyPersistence;
    }

    /**
     * Sets the vacancy persistence.
     *
     * @param vacancyPersistence the vacancy persistence
     */
    public void setVacancyPersistence(VacancyPersistence vacancyPersistence) {
        this.vacancyPersistence = vacancyPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.company.orm.servicebuilder.model.Vacancy",
            vacancyLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.company.orm.servicebuilder.model.Vacancy");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Vacancy.class;
    }

    protected String getModelClassName() {
        return Vacancy.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = vacancyPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
