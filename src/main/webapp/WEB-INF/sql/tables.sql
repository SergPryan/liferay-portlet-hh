create table namespacebuild_Vacancy (
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	dateOfPublication VARCHAR(75) null,
	organization VARCHAR(75) null,
	salary VARCHAR(75) null,
	url VARCHAR(75) not null primary key
);