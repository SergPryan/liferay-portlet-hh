package com.company.orm.servicebuilder.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Vacancy service. Represents a row in the &quot;namespacebuild_Vacancy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.company.orm.servicebuilder.model.impl.VacancyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.company.orm.servicebuilder.model.impl.VacancyImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vacancy
 * @see com.company.orm.servicebuilder.model.impl.VacancyImpl
 * @see com.company.orm.servicebuilder.model.impl.VacancyModelImpl
 * @generated
 */
public interface VacancyModel extends BaseModel<Vacancy>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a vacancy model instance should use the {@link Vacancy} interface instead.
     */

    /**
     * Returns the primary key of this vacancy.
     *
     * @return the primary key of this vacancy
     */
    public String getPrimaryKey();

    /**
     * Sets the primary key of this vacancy.
     *
     * @param primaryKey the primary key of this vacancy
     */
    public void setPrimaryKey(String primaryKey);

    /**
     * Returns the group ID of this vacancy.
     *
     * @return the group ID of this vacancy
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this vacancy.
     *
     * @param groupId the group ID of this vacancy
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this vacancy.
     *
     * @return the company ID of this vacancy
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this vacancy.
     *
     * @param companyId the company ID of this vacancy
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this vacancy.
     *
     * @return the user ID of this vacancy
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this vacancy.
     *
     * @param userId the user ID of this vacancy
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this vacancy.
     *
     * @return the user uuid of this vacancy
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this vacancy.
     *
     * @param userUuid the user uuid of this vacancy
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this vacancy.
     *
     * @return the user name of this vacancy
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this vacancy.
     *
     * @param userName the user name of this vacancy
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this vacancy.
     *
     * @return the create date of this vacancy
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this vacancy.
     *
     * @param createDate the create date of this vacancy
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this vacancy.
     *
     * @return the modified date of this vacancy
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this vacancy.
     *
     * @param modifiedDate the modified date of this vacancy
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the name of this vacancy.
     *
     * @return the name of this vacancy
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this vacancy.
     *
     * @param name the name of this vacancy
     */
    public void setName(String name);

    /**
     * Returns the date of publication of this vacancy.
     *
     * @return the date of publication of this vacancy
     */
    @AutoEscape
    public String getDateOfPublication();

    /**
     * Sets the date of publication of this vacancy.
     *
     * @param dateOfPublication the date of publication of this vacancy
     */
    public void setDateOfPublication(String dateOfPublication);

    /**
     * Returns the organization of this vacancy.
     *
     * @return the organization of this vacancy
     */
    @AutoEscape
    public String getOrganization();

    /**
     * Sets the organization of this vacancy.
     *
     * @param organization the organization of this vacancy
     */
    public void setOrganization(String organization);

    /**
     * Returns the salary of this vacancy.
     *
     * @return the salary of this vacancy
     */
    @AutoEscape
    public String getSalary();

    /**
     * Sets the salary of this vacancy.
     *
     * @param salary the salary of this vacancy
     */
    public void setSalary(String salary);

    /**
     * Returns the url of this vacancy.
     *
     * @return the url of this vacancy
     */
    @AutoEscape
    public String getUrl();

    /**
     * Sets the url of this vacancy.
     *
     * @param url the url of this vacancy
     */
    public void setUrl(String url);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.company.orm.servicebuilder.model.Vacancy vacancy);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.company.orm.servicebuilder.model.Vacancy> toCacheModel();

    @Override
    public com.company.orm.servicebuilder.model.Vacancy toEscapedModel();

    @Override
    public com.company.orm.servicebuilder.model.Vacancy toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
