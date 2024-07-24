/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables.records;


import java.time.LocalDateTime;

import me.afibarra.db.tables.FilmActor;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmActorRecord extends UpdatableRecordImpl<FilmActorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.film_actor.actor_id</code>.
     */
    public void setActorId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.film_actor.actor_id</code>.
     */
    public UShort getActorId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.film_actor.film_id</code>.
     */
    public void setFilmId(UShort value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.film_actor.film_id</code>.
     */
    public UShort getFilmId() {
        return (UShort) get(1);
    }

    /**
     * Setter for <code>sakila.film_actor.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.film_actor.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UShort, UShort> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmActorRecord
     */
    public FilmActorRecord() {
        super(FilmActor.FILM_ACTOR);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(UShort actorId, UShort filmId, LocalDateTime lastUpdate) {
        super(FilmActor.FILM_ACTOR);

        setActorId(actorId);
        setFilmId(filmId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
