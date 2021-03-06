package com.company.orm.servicebuilder.model.impl;

import com.company.orm.servicebuilder.model.Vacancy;
import com.company.orm.servicebuilder.model.VacancyModel;
import com.company.orm.servicebuilder.model.VacancySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Vacancy service. Represents a row in the &quot;namespacebuild_Vacancy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.company.orm.servicebuilder.model.VacancyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VacancyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacancyImpl
 * @see com.company.orm.servicebuilder.model.Vacancy
 * @see com.company.orm.servicebuilder.model.VacancyModel
 * @generated
 */
@JSON(strict = true)
public class VacancyModelImpl extends BaseModelImpl<Vacancy>
    implements VacancyModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a vacancy model instance should use the {@link com.company.orm.servicebuilder.model.Vacancy} interface instead.
     */
    public static final String TABLE_NAME = "namespacebuild_Vacancy";
    public static final Object[][] TABLE_COLUMNS = {
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "name", Types.VARCHAR },
            { "dateOfPublication", Types.VARCHAR },
            { "organization", Types.VARCHAR },
            { "salary", Types.VARCHAR },
            { "url", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table namespacebuild_Vacancy (groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,dateOfPublication VARCHAR(75) null,organization VARCHAR(75) null,salary VARCHAR(75) null,url VARCHAR(75) not null primary key)";
    public static final String TABLE_SQL_DROP = "drop table namespacebuild_Vacancy";
    public static final String ORDER_BY_JPQL = " ORDER BY vacancy.url ASC";
    public static final String ORDER_BY_SQL = " ORDER BY namespacebuild_Vacancy.url ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.company.orm.servicebuilder.model.Vacancy"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.company.orm.servicebuilder.model.Vacancy"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.company.orm.servicebuilder.model.Vacancy"));
    private static ClassLoader _classLoader = Vacancy.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Vacancy.class
        };
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _dateOfPublication;
    private String _organization;
    private String _salary;
    private String _url;
    private Vacancy _escapedModel;

    public VacancyModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Vacancy toModel(VacancySoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Vacancy model = new VacancyImpl();

        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setName(soapModel.getName());
        model.setDateOfPublication(soapModel.getDateOfPublication());
        model.setOrganization(soapModel.getOrganization());
        model.setSalary(soapModel.getSalary());
        model.setUrl(soapModel.getUrl());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Vacancy> toModels(VacancySoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Vacancy> models = new ArrayList<Vacancy>(soapModels.length);

        for (VacancySoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _url;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setUrl(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _url;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return Vacancy.class;
    }

    @Override
    public String getModelClassName() {
        return Vacancy.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("dateOfPublication", getDateOfPublication());
        attributes.put("organization", getOrganization());
        attributes.put("salary", getSalary());
        attributes.put("url", getUrl());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String dateOfPublication = (String) attributes.get("dateOfPublication");

        if (dateOfPublication != null) {
            setDateOfPublication(dateOfPublication);
        }

        String organization = (String) attributes.get("organization");

        if (organization != null) {
            setOrganization(organization);
        }

        String salary = (String) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }

        String url = (String) attributes.get("url");

        if (url != null) {
            setUrl(url);
        }
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public String getDateOfPublication() {
        if (_dateOfPublication == null) {
            return StringPool.BLANK;
        } else {
            return _dateOfPublication;
        }
    }

    @Override
    public void setDateOfPublication(String dateOfPublication) {
        _dateOfPublication = dateOfPublication;
    }

    @JSON
    @Override
    public String getOrganization() {
        if (_organization == null) {
            return StringPool.BLANK;
        } else {
            return _organization;
        }
    }

    @Override
    public void setOrganization(String organization) {
        _organization = organization;
    }

    @JSON
    @Override
    public String getSalary() {
        if (_salary == null) {
            return StringPool.BLANK;
        } else {
            return _salary;
        }
    }

    @Override
    public void setSalary(String salary) {
        _salary = salary;
    }

    @JSON
    @Override
    public String getUrl() {
        if (_url == null) {
            return StringPool.BLANK;
        } else {
            return _url;
        }
    }

    @Override
    public void setUrl(String url) {
        _url = url;
    }

    @Override
    public Vacancy toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Vacancy) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        VacancyImpl vacancyImpl = new VacancyImpl();

        vacancyImpl.setGroupId(getGroupId());
        vacancyImpl.setCompanyId(getCompanyId());
        vacancyImpl.setUserId(getUserId());
        vacancyImpl.setUserName(getUserName());
        vacancyImpl.setCreateDate(getCreateDate());
        vacancyImpl.setModifiedDate(getModifiedDate());
        vacancyImpl.setName(getName());
        vacancyImpl.setDateOfPublication(getDateOfPublication());
        vacancyImpl.setOrganization(getOrganization());
        vacancyImpl.setSalary(getSalary());
        vacancyImpl.setUrl(getUrl());

        vacancyImpl.resetOriginalValues();

        return vacancyImpl;
    }

    @Override
    public int compareTo(Vacancy vacancy) {
        String primaryKey = vacancy.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Vacancy)) {
            return false;
        }

        Vacancy vacancy = (Vacancy) obj;

        String primaryKey = vacancy.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Vacancy> toCacheModel() {
        VacancyCacheModel vacancyCacheModel = new VacancyCacheModel();

        vacancyCacheModel.groupId = getGroupId();

        vacancyCacheModel.companyId = getCompanyId();

        vacancyCacheModel.userId = getUserId();

        vacancyCacheModel.userName = getUserName();

        String userName = vacancyCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            vacancyCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            vacancyCacheModel.createDate = createDate.getTime();
        } else {
            vacancyCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            vacancyCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            vacancyCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        vacancyCacheModel.name = getName();

        String name = vacancyCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            vacancyCacheModel.name = null;
        }

        vacancyCacheModel.dateOfPublication = getDateOfPublication();

        String dateOfPublication = vacancyCacheModel.dateOfPublication;

        if ((dateOfPublication != null) && (dateOfPublication.length() == 0)) {
            vacancyCacheModel.dateOfPublication = null;
        }

        vacancyCacheModel.organization = getOrganization();

        String organization = vacancyCacheModel.organization;

        if ((organization != null) && (organization.length() == 0)) {
            vacancyCacheModel.organization = null;
        }

        vacancyCacheModel.salary = getSalary();

        String salary = vacancyCacheModel.salary;

        if ((salary != null) && (salary.length() == 0)) {
            vacancyCacheModel.salary = null;
        }

        vacancyCacheModel.url = getUrl();

        String url = vacancyCacheModel.url;

        if ((url != null) && (url.length() == 0)) {
            vacancyCacheModel.url = null;
        }

        return vacancyCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", dateOfPublication=");
        sb.append(getDateOfPublication());
        sb.append(", organization=");
        sb.append(getOrganization());
        sb.append(", salary=");
        sb.append(getSalary());
        sb.append(", url=");
        sb.append(getUrl());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("com.company.orm.servicebuilder.model.Vacancy");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dateOfPublication</column-name><column-value><![CDATA[");
        sb.append(getDateOfPublication());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>organization</column-name><column-value><![CDATA[");
        sb.append(getOrganization());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary</column-name><column-value><![CDATA[");
        sb.append(getSalary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>url</column-name><column-value><![CDATA[");
        sb.append(getUrl());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
