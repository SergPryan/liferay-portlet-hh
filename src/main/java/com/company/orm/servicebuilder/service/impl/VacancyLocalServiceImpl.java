package com.company.orm.servicebuilder.service.impl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.company.grabber.VacancyDto;
import com.company.orm.servicebuilder.NoSuchVacancyException;
import com.company.orm.servicebuilder.model.Vacancy;
import com.company.orm.servicebuilder.service.base.VacancyLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.portlet.HhGrabberProdPortlet;

/**
 * The implementation of the vacancy local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.company.orm.servicebuilder.service.VacancyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.company.orm.servicebuilder.service.base.VacancyLocalServiceBaseImpl
 * @see com.company.orm.servicebuilder.service.VacancyLocalServiceUtil
 */
public class VacancyLocalServiceImpl extends VacancyLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link
	 * com.company.orm.servicebuilder.service.VacancyLocalServiceUtil} to access
	 * the vacancy local service.
	 */
	private static Logger log = Logger.getLogger(HhGrabberProdPortlet.class.getName());

	public Vacancy addVacancy(VacancyDto vacancyDto) {
		Vacancy vacancy = null;
		try {
			vacancy = vacancyPersistence.findByPrimaryKey(vacancyDto.getUrl());
			if (vacancy != null) {
				updateVacancy(vacancy, vacancyDto);
				return vacancy;
			}
		} catch (NoSuchVacancyException e1) {
			log.log(Level.SEVERE, "vacancy exist: ", e1);
			vacancy = vacancyPersistence.create(vacancyDto.getUrl());
			updateVacancy(vacancy, vacancyDto);
		} catch (SystemException e1) {
			log.log(Level.SEVERE, "Exception: ", e1);
		}
		return vacancy;
	}

	private void updateVacancy(Vacancy vacancy, VacancyDto vacancyDto) {
		vacancy.setSalary(vacancyDto.getSalary());
		vacancy.setName(vacancyDto.getName());
		vacancy.setDateOfPublication(vacancyDto.getDateOfPublication());
		vacancy.setOrganization(vacancyDto.getOrganization());
		try {
			vacancyPersistence.update(vacancy);
		} catch (SystemException e) {
			log.log(Level.SEVERE, "Exception: ", e);
		}
	}
	
	public List<Vacancy> getAll(){
		try {
			return vacancyPersistence.findAll();
		} catch (SystemException e) {
			log.log(Level.SEVERE, "Exception: ", e);
		}
		return null;
	}
}
