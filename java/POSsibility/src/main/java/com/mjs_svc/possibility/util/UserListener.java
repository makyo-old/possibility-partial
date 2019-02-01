package com.mjs_svc.possibility.util;

import com.mjs_svc.possibility.models.User;

/**
 *
 * @author Matthew Scott
 * @version $Id: UserListener.java 18 2010-04-06 05:14:07Z matthew.joseph.scott $
 */
public interface UserListener {

    /**
     * Listen for a user object
     * @param user
     */
    public void setUser(User user);
}
