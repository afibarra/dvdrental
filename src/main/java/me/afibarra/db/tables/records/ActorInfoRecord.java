/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables.records;


import me.afibarra.db.tables.ActorInfo;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorInfoRecord extends TableRecordImpl<ActorInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.actor_info.actor_id</code>.
     */
    public void setActorId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.actor_info.actor_id</code>.
     */
    public UShort getActorId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.actor_info.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.actor_info.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.actor_info.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.actor_info.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.actor_info.film_info</code>.
     */
    public void setFilmInfo(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.actor_info.film_info</code>.
     */
    public String getFilmInfo() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActorInfoRecord
     */
    public ActorInfoRecord() {
        super(ActorInfo.ACTOR_INFO);
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    public ActorInfoRecord(UShort actorId, String firstName, String lastName, String filmInfo) {
        super(ActorInfo.ACTOR_INFO);

        setActorId(actorId);
        setFirstName(firstName);
        setLastName(lastName);
        setFilmInfo(filmInfo);
        resetChangedOnNotNull();
    }
}