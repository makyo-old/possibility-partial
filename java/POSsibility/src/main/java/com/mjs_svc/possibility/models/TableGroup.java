package com.mjs_svc.possibility.models;

import java.util.*;

/**
 *
 * @author Matthew Scott
 * @version $Id: TableGroup.java 19 2010-04-07 08:50:47Z matthew.joseph.scott $
 */
public class TableGroup {
    private int id, seats;
    private Ticket ticket;
    private Set tables = new HashSet();

    public Set getTables() {
        return tables;
    }

    public void setTables(Set tables) {
        this.tables = tables;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    //------------------------------------------------------------------------//
}
