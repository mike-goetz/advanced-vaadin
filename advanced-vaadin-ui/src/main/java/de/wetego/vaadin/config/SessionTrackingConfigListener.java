/*
 * Copyright 2001-2016 iPoint-systems. All Rights Reserved.
 *
 * This software is proprietary information of iPoint-systems.
 * Use is subject to license terms.
 */
package de.wetego.vaadin.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;

import org.springframework.boot.web.servlet.ServletContextInitializer;


/**
 * Different Session Cookie Name for Vaadin.
 */
public class SessionTrackingConfigListener implements ServletContextInitializer {

    @Override
    public void onStartup ( ServletContext servletContext ) throws ServletException {
        SessionCookieConfig sessionCookieConfig = servletContext.getSessionCookieConfig ();
        sessionCookieConfig.setName ( "advanced-vaadin-ui-session-id_" + System.currentTimeMillis () );
    }
}