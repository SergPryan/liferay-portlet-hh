package com.company.orm.servicebuilder.model.impl;

import com.company.orm.servicebuilder.model.Vacancy;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Vacancy in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Vacancy
 * @generated
 */
public class VacancyCacheModel implements CacheModel<Vacancy>, Externalizable {
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String dateOfPublication;
    public String organization;
    public String salary;
    public String url;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append(", dateOfPublication=");
        sb.append(dateOfPublication);
        sb.append(", organization=");
        sb.append(organization);
        sb.append(", salary=");
        sb.append(salary);
        sb.append(", url=");
        sb.append(url);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Vacancy toEntityModel() {
        VacancyImpl vacancyImpl = new VacancyImpl();

        vacancyImpl.setGroupId(groupId);
        vacancyImpl.setCompanyId(companyId);
        vacancyImpl.setUserId(userId);

        if (userName == null) {
            vacancyImpl.setUserName(StringPool.BLANK);
        } else {
            vacancyImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            vacancyImpl.setCreateDate(null);
        } else {
            vacancyImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            vacancyImpl.setModifiedDate(null);
        } else {
            vacancyImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            vacancyImpl.setName(StringPool.BLANK);
        } else {
            vacancyImpl.setName(name);
        }

        if (dateOfPublication == null) {
            vacancyImpl.setDateOfPublication(StringPool.BLANK);
        } else {
            vacancyImpl.setDateOfPublication(dateOfPublication);
        }

        if (organization == null) {
            vacancyImpl.setOrganization(StringPool.BLANK);
        } else {
            vacancyImpl.setOrganization(organization);
        }

        if (salary == null) {
            vacancyImpl.setSalary(StringPool.BLANK);
        } else {
            vacancyImpl.setSalary(salary);
        }

        if (url == null) {
            vacancyImpl.setUrl(StringPool.BLANK);
        } else {
            vacancyImpl.setUrl(url);
        }

        vacancyImpl.resetOriginalValues();

        return vacancyImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        dateOfPublication = objectInput.readUTF();
        organization = objectInput.readUTF();
        salary = objectInput.readUTF();
        url = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (dateOfPublication == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dateOfPublication);
        }

        if (organization == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(organization);
        }

        if (salary == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(salary);
        }

        if (url == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(url);
        }
    }
}
