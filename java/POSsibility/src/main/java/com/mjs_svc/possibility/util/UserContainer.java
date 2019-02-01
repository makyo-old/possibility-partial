package com.mjs_svc.possibility.util;

import com.mjs_svc.possibility.models.User;

/**
 *
 * @author Matthew Scott
 * @version $Id: UserContainer.java 22 2010-04-10 04:00:49Z matthew.joseph.scott $
 */
public class UserContainer {
    private static User user;

    public static void setUser(User _user) {
        user = _user;
    }

    public static User getUser() {
        return user;
    }
}
