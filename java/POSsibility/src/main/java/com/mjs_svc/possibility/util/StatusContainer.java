package com.mjs_svc.possibility.util;

import com.mjs_svc.possibility.views.StatusBar;

/**
 *
 * @author Matthew Scott
 * @version $Id: StatusContainer.java 22 2010-04-10 04:00:49Z matthew.joseph.scott $
 */
public class StatusContainer {
    private static StatusBar statusBar;

    public static void setStatusBar(StatusBar _statusBar) {
        statusBar = _statusBar;
    }

    public static StatusBar getStatusBar() {
        return statusBar;
    }
}
