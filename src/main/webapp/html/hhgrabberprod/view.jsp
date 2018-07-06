<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page import="com.company.orm.servicebuilder.service.VacancyLocalServiceUtil" %>


<portlet:defineObjects />

<portlet:actionURL name="addVacanciesInDatabase" var="addVacanciesInDatabaseURL"></portlet:actionURL>

<p><aui:form action="<%=addVacanciesInDatabaseURL %>">
<button type="submit">submit</button>
</aui:form>


<liferay-ui:search-container total="<%=VacancyLocalServiceUtil.getVacanciesCount()%>">
  
    
    <liferay-ui:search-container-results results="<%=VacancyLocalServiceUtil.getAll()%>"/>
    
     <liferay-ui:search-container-row
        className="com.company.orm.servicebuilder.model.Vacancy" modelVar="entry">

        <liferay-ui:search-container-column-text property="url" />

        <liferay-ui:search-container-column-text property="name" />
        
        <liferay-ui:search-container-column-text property="salary" />

    </liferay-ui:search-container-row>
    
    <liferay-ui:search-iterator />
    
   
</liferay-ui:search-container>


