package com.portlet;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.company.grabber.HHgrabber;
import com.company.grabber.VacancyDto;
import com.company.orm.servicebuilder.model.Vacancy;
import com.company.orm.servicebuilder.service.VacancyLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class HhGrabberProdPortlet
 */
public class HhGrabberProdPortlet extends MVCPortlet {
	
	private static Logger log = Logger.getLogger(HhGrabberProdPortlet.class.getName());
 
//	@ProcessAction(name="addVacanciesInDatabase")
	public void addVacanciesInDatabase(ActionRequest request, ActionResponse response){
		    List<VacancyDto> list=HHgrabber.getVacancies();
	        list.forEach(e->{
	            log.log(Level.INFO, "save vacancy "+e.getUrl());
					VacancyLocalServiceUtil.addVacancy(e);
				
	        });
		System.out.println("perform request");
	}

//	@Override
//	public void render (RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
//
//	    PortletPreferences prefs = renderRequest.getPreferences();
//	    String[] guestbookEntries = prefs.getValues("guestbook-entries",
//	            new String[1]);
//
//	    if (guestbookEntries != null) {
//
//	        List<Vacancy> entries = parseEntries(guestbookEntries);
//
//	        renderRequest.setAttribute("entries", entries);
//	    }
//
//	    super.render(renderRequest, renderResponse);
//
//	}
//	
//	private List<Vacancy> parseEntries (String[] guestbookEntries) {
//
//	    ArrayList<Vacancy> entries = new ArrayList();
//
//	    for (String entry : guestbookEntries) {
//	        String[] parts = entry.split("\\^", 2);
//	        Vacancy gbEntry = new Vacancy(parts[0], parts[1]);
//	        entries.add(gbEntry);
//	    }
//
//	    return entries;
//	}
}
