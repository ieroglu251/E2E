package com.vytrack.utilities;

import com.vytrack.pages.activities.CalanderEventsPage;
import com.vytrack.pages.dashboards.DashboardPage;
import com.vytrack.pages.dashboards.ManageDashboards;
import com.vytrack.pages.login_navigation.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private CalanderEventsPage calendarEventsPage;
    private DashboardPage dashboardPage;
    private ManageDashboards manageDashboards;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CalanderEventsPage calendarEventsPage() {
        if (calendarEventsPage == null) {
            calendarEventsPage = new CalanderEventsPage();
        }
        return calendarEventsPage;
    }

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

    public ManageDashboards manageDashboards() {
        if (manageDashboards == null) {
            manageDashboards = new ManageDashboards();
        }
        return manageDashboards;
    }
}
