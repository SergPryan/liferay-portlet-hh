package com.company.orm.servicebuilder.service.messaging;

import com.company.orm.servicebuilder.service.ClpSerializer;
import com.company.orm.servicebuilder.service.VacancyLocalServiceUtil;
import com.company.orm.servicebuilder.service.VacancyServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            VacancyLocalServiceUtil.clearService();

            VacancyServiceUtil.clearService();
        }
    }
}
