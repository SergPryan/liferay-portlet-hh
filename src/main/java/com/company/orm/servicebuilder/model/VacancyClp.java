package com.company.orm.servicebuilder.model;

import com.company.orm.servicebuilder.service.ClpSerializer;
import com.company.orm.servicebuilder.service.VacancyLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class VacancyClp extends BaseModelImpl<Vacancy> implements Vacancy {
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
    private BaseModel<?> _vacancyRemoteModel;
    private Class<?> _clpSerializerClass = com.company.orm.servicebuilder.service.ClpSerializer.class;

    public VacancyClp() {
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

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_vacancyRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_vacancyRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_vacancyRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_vacancyRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_vacancyRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_vacancyRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_vacancyRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDateOfPublication() {
        return _dateOfPublication;
    }

    @Override
    public void setDateOfPublication(String dateOfPublication) {
        _dateOfPublication = dateOfPublication;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setDateOfPublication",
                        String.class);

                method.invoke(_vacancyRemoteModel, dateOfPublication);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getOrganization() {
        return _organization;
    }

    @Override
    public void setOrganization(String organization) {
        _organization = organization;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setOrganization", String.class);

                method.invoke(_vacancyRemoteModel, organization);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(String salary) {
        _salary = salary;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary", String.class);

                method.invoke(_vacancyRemoteModel, salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUrl() {
        return _url;
    }

    @Override
    public void setUrl(String url) {
        _url = url;

        if (_vacancyRemoteModel != null) {
            try {
                Class<?> clazz = _vacancyRemoteModel.getClass();

                Method method = clazz.getMethod("setUrl", String.class);

                method.invoke(_vacancyRemoteModel, url);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getVacancyRemoteModel() {
        return _vacancyRemoteModel;
    }

    public void setVacancyRemoteModel(BaseModel<?> vacancyRemoteModel) {
        _vacancyRemoteModel = vacancyRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _vacancyRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_vacancyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            VacancyLocalServiceUtil.addVacancy(this);
        } else {
            VacancyLocalServiceUtil.updateVacancy(this);
        }
    }

    @Override
    public Vacancy toEscapedModel() {
        return (Vacancy) ProxyUtil.newProxyInstance(Vacancy.class.getClassLoader(),
            new Class[] { Vacancy.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        VacancyClp clone = new VacancyClp();

        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setName(getName());
        clone.setDateOfPublication(getDateOfPublication());
        clone.setOrganization(getOrganization());
        clone.setSalary(getSalary());
        clone.setUrl(getUrl());

        return clone;
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

        if (!(obj instanceof VacancyClp)) {
            return false;
        }

        VacancyClp vacancy = (VacancyClp) obj;

        String primaryKey = vacancy.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
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
