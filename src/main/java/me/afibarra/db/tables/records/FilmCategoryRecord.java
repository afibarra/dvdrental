/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables.records;


import java.time.LocalDateTime;

import me.afibarra.db.tables.FilmCategory;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.film_category.film_id</code>.
     */
    public void setFilmId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.film_category.film_id</code>.
     */
    public UShort getFilmId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.film_category.category_id</code>.
     */
    public void setCategoryId(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.film_category.category_id</code>.
     */
    public UByte getCategoryId() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>sakila.film_category.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.film_category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UShort, UByte> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmCategoryRecord
     */
    public FilmCategoryRecord() {
        super(FilmCategory.FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(UShort filmId, UByte categoryId, LocalDateTime lastUpdate) {
        super(FilmCategory.FILM_CATEGORY);

        setFilmId(filmId);
        setCategoryId(categoryId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
