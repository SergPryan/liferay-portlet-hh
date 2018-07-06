package com.company.orm.servicebuilder.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.company.orm.servicebuilder.service.http.VacancyServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.company.orm.servicebuilder.service.http.VacancyServiceSoap
 * @generated
 */
public class VacancySoap implements Serializable {
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _dateOfPublication;
    private String _organization;
    private String _salary;
    private String _url;

    public VacancySoap() {
    }

    public static VacancySoap toSoapModel(Vacancy model) {
        VacancySoap soapModel = new VacancySoap();

        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setDateOfPublication(model.getDateOfPublication());
        soapModel.setOrganization(model.getOrganization());
        soapModel.setSalary(model.getSalary());
        soapModel.setUrl(model.getUrl());

        return soapModel;
    }

    public static VacancySoap[] toSoapModels(Vacancy[] models) {
        VacancySoap[] soapModels = new VacancySoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static VacancySoap[][] toSoapModels(Vacancy[][] models) {
        VacancySoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new VacancySoap[models.length][models[0].length];
        } else {
            soapModels = new VacancySoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static VacancySoap[] toSoapModels(List<Vacancy> models) {
        List<VacancySoap> soapModels = new ArrayList<VacancySoap>(models.size());

        for (Vacancy model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new VacancySoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _url;
    }

    public void setPrimaryKey(String pk) {
        setUrl(pk);
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDateOfPublication() {
        return _dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        _dateOfPublication = dateOfPublication;
    }

    public String getOrganization() {
        return _organization;
    }

    public void setOrganization(String organization) {
        _organization = organization;
    }

    public String getSalary() {
        return _salary;
    }

    public void setSalary(String salary) {
        _salary = salary;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String url) {
        _url = url;
    }
}
