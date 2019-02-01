package com.mjs_svc.possibility.models;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: Restaurant.java 19 2010-04-07 08:50:47Z matthew.joseph.scott $
 */
public class Restaurant {
    private int id;
    private String geometry;
    private Set areas = new HashSet();

    public Set getAreas() {
        return areas;
    }

    public void setAreas(Set areas) {
        this.areas = areas;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
