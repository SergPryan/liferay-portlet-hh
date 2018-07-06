package com.company.orm.servicebuilder.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Vacancy}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vacancy
 * @generated
 */
public class VacancyWrapper implements Vacancy, ModelWrapper<Vacancy> {
    private Vacancy _vacancy;

    public VacancyWrapper(Vacancy vacancy) {
        _vacancy = vacancy;
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

    /**
    * Returns the primary key of this vacancy.
    *
    * @return the primary key of this vacancy
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _vacancy.getPrimaryKey();
    }

    /**
    * Sets the primary key of this vacancy.
    *
    * @param primaryKey the primary key of this vacancy
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _vacancy.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the group ID of this vacancy.
    *
    * @return the group ID of this vacancy
    */
    @Override
    public long getGroupId() {
        return _vacancy.getGroupId();
    }

    /**
    * Sets the group ID of this vacancy.
    *
    * @param groupId the group ID of this vacancy
    */
    @Override
    public void setGroupId(long groupId) {
        _vacancy.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this vacancy.
    *
    * @return the company ID of this vacancy
    */
    @Override
    public long getCompanyId() {
        return _vacancy.getCompanyId();
    }

    /**
    * Sets the company ID of this vacancy.
    *
    * @param companyId the company ID of this vacancy
    */
    @Override
    public void setCompanyId(long companyId) {
        _vacancy.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this vacancy.
    *
    * @return the user ID of this vacancy
    */
    @Override
    public long getUserId() {
        return _vacancy.getUserId();
    }

    /**
    * Sets the user ID of this vacancy.
    *
    * @param userId the user ID of this vacancy
    */
    @Override
    public void setUserId(long userId) {
        _vacancy.setUserId(userId);
    }

    /**
    * Returns the user uuid of this vacancy.
    *
    * @return the user uuid of this vacancy
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _vacancy.getUserUuid();
    }

    /**
    * Sets the user uuid of this vacancy.
    *
    * @param userUuid the user uuid of this vacancy
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _vacancy.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this vacancy.
    *
    * @return the user name of this vacancy
    */
    @Override
    public java.lang.String getUserName() {
        return _vacancy.getUserName();
    }

    /**
    * Sets the user name of this vacancy.
    *
    * @param userName the user name of this vacancy
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _vacancy.setUserName(userName);
    }

    /**
    * Returns the create date of this vacancy.
    *
    * @return the create date of this vacancy
    */
    @Override
    public java.util.Date getCreateDate() {
        return _vacancy.getCreateDate();
    }

    /**
    * Sets the create date of this vacancy.
    *
    * @param createDate the create date of this vacancy
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _vacancy.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this vacancy.
    *
    * @return the modified date of this vacancy
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _vacancy.getModifiedDate();
    }

    /**
    * Sets the modified date of this vacancy.
    *
    * @param modifiedDate the modified date of this vacancy
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _vacancy.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this vacancy.
    *
    * @return the name of this vacancy
    */
    @Override
    public java.lang.String getName() {
        return _vacancy.getName();
    }

    /**
    * Sets the name of this vacancy.
    *
    * @param name the name of this vacancy
    */
    @Override
    public void setName(java.lang.String name) {
        _vacancy.setName(name);
    }

    /**
    * Returns the date of publication of this vacancy.
    *
    * @return the date of publication of this vacancy
    */
    @Override
    public java.lang.String getDateOfPublication() {
        return _vacancy.getDateOfPublication();
    }

    /**
    * Sets the date of publication of this vacancy.
    *
    * @param dateOfPublication the date of publication of this vacancy
    */
    @Override
    public void setDateOfPublication(java.lang.String dateOfPublication) {
        _vacancy.setDateOfPublication(dateOfPublication);
    }

    /**
    * Returns the organization of this vacancy.
    *
    * @return the organization of this vacancy
    */
    @Override
    public java.lang.String getOrganization() {
        return _vacancy.getOrganization();
    }

    /**
    * Sets the organization of this vacancy.
    *
    * @param organization the organization of this vacancy
    */
    @Override
    public void setOrganization(java.lang.String organization) {
        _vacancy.setOrganization(organization);
    }

    /**
    * Returns the salary of this vacancy.
    *
    * @return the salary of this vacancy
    */
    @Override
    public java.lang.String getSalary() {
        return _vacancy.getSalary();
    }

    /**
    * Sets the salary of this vacancy.
    *
    * @param salary the salary of this vacancy
    */
    @Override
    public void setSalary(java.lang.String salary) {
        _vacancy.setSalary(salary);
    }

    /**
    * Returns the url of this vacancy.
    *
    * @return the url of this vacancy
    */
    @Override
    public java.lang.String getUrl() {
        return _vacancy.getUrl();
    }

    /**
    * Sets the url of this vacancy.
    *
    * @param url the url of this vacancy
    */
    @Override
    public void setUrl(java.lang.String url) {
        _vacancy.setUrl(url);
    }

    @Override
    public boolean isNew() {
        return _vacancy.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _vacancy.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _vacancy.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _vacancy.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _vacancy.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _vacancy.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _vacancy.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _vacancy.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _vacancy.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _vacancy.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _vacancy.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new VacancyWrapper((Vacancy) _vacancy.clone());
    }

    @Override
    public int compareTo(com.company.orm.servicebuilder.model.Vacancy vacancy) {
        return _vacancy.compareTo(vacancy);
    }

    @Override
    public int hashCode() {
        return _vacancy.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.company.orm.servicebuilder.model.Vacancy> toCacheModel() {
        return _vacancy.toCacheModel();
    }

    @Override
    public com.company.orm.servicebuilder.model.Vacancy toEscapedModel() {
        return new VacancyWrapper(_vacancy.toEscapedModel());
    }

    @Override
    public com.company.orm.servicebuilder.model.Vacancy toUnescapedModel() {
        return new VacancyWrapper(_vacancy.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _vacancy.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _vacancy.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _vacancy.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VacancyWrapper)) {
            return false;
        }

        VacancyWrapper vacancyWrapper = (VacancyWrapper) obj;

        if (Validator.equals(_vacancy, vacancyWrapper._vacancy)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Vacancy getWrappedVacancy() {
        return _vacancy;
    }

    @Override
    public Vacancy getWrappedModel() {
        return _vacancy;
    }

    @Override
    public void resetOriginalValues() {
        _vacancy.resetOriginalValues();
    }
}
