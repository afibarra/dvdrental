/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;

import me.afibarra.db.enums.FilmRating;
import me.afibarra.db.tables.Film;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> implements Record13<UShort, String, String, Year, UByte, UByte, UByte, BigDecimal, UShort, BigDecimal, FilmRating, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.film.film_id</code>.
     */
    public void setFilmId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.film.film_id</code>.
     */
    public UShort getFilmId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.film.title</code>.
     */
    public void setTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.film.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.film.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.film.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.film.release_year</code>.
     */
    public void setReleaseYear(Year value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.film.release_year</code>.
     */
    public Year getReleaseYear() {
        return (Year) get(3);
    }

    /**
     * Setter for <code>sakila.film.language_id</code>.
     */
    public void setLanguageId(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>sakila.film.language_id</code>.
     */
    public UByte getLanguageId() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>sakila.film.original_language_id</code>.
     */
    public void setOriginalLanguageId(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>sakila.film.original_language_id</code>.
     */
    public UByte getOriginalLanguageId() {
        return (UByte) get(5);
    }

    /**
     * Setter for <code>sakila.film.rental_duration</code>.
     */
    public void setRentalDuration(UByte value) {
        set(6, value);
    }

    /**
     * Getter for <code>sakila.film.rental_duration</code>.
     */
    public UByte getRentalDuration() {
        return (UByte) get(6);
    }

    /**
     * Setter for <code>sakila.film.rental_rate</code>.
     */
    public void setRentalRate(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>sakila.film.rental_rate</code>.
     */
    public BigDecimal getRentalRate() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>sakila.film.length</code>.
     */
    public void setLength(UShort value) {
        set(8, value);
    }

    /**
     * Getter for <code>sakila.film.length</code>.
     */
    public UShort getLength() {
        return (UShort) get(8);
    }

    /**
     * Setter for <code>sakila.film.replacement_cost</code>.
     */
    public void setReplacementCost(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>sakila.film.replacement_cost</code>.
     */
    public BigDecimal getReplacementCost() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>sakila.film.rating</code>.
     */
    public void setRating(FilmRating value) {
        set(10, value);
    }

    /**
     * Getter for <code>sakila.film.rating</code>.
     */
    public FilmRating getRating() {
        return (FilmRating) get(10);
    }

    /**
     * Setter for <code>sakila.film.special_features</code>.
     */
    public void setSpecialFeatures(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>sakila.film.special_features</code>.
     */
    public String getSpecialFeatures() {
        return (String) get(11);
    }

    /**
     * Setter for <code>sakila.film.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>sakila.film.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<UShort, String, String, Year, UByte, UByte, UByte, BigDecimal, UShort, BigDecimal, FilmRating, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<UShort, String, String, Year, UByte, UByte, UByte, BigDecimal, UShort, BigDecimal, FilmRating, String, LocalDateTime> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<UShort> field1() {
        return Film.FILM.FILM_ID;
    }

    @Override
    public Field<String> field2() {
        return Film.FILM.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Film.FILM.DESCRIPTION;
    }

    @Override
    public Field<Year> field4() {
        return Film.FILM.RELEASE_YEAR;
    }

    @Override
    public Field<UByte> field5() {
        return Film.FILM.LANGUAGE_ID;
    }

    @Override
    public Field<UByte> field6() {
        return Film.FILM.ORIGINAL_LANGUAGE_ID;
    }

    @Override
    public Field<UByte> field7() {
        return Film.FILM.RENTAL_DURATION;
    }

    @Override
    public Field<BigDecimal> field8() {
        return Film.FILM.RENTAL_RATE;
    }

    @Override
    public Field<UShort> field9() {
        return Film.FILM.LENGTH;
    }

    @Override
    public Field<BigDecimal> field10() {
        return Film.FILM.REPLACEMENT_COST;
    }

    @Override
    public Field<FilmRating> field11() {
        return Film.FILM.RATING;
    }

    @Override
    public Field<String> field12() {
        return Film.FILM.SPECIAL_FEATURES;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return Film.FILM.LAST_UPDATE;
    }

    @Override
    public UShort component1() {
        return getFilmId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Year component4() {
        return getReleaseYear();
    }

    @Override
    public UByte component5() {
        return getLanguageId();
    }

    @Override
    public UByte component6() {
        return getOriginalLanguageId();
    }

    @Override
    public UByte component7() {
        return getRentalDuration();
    }

    @Override
    public BigDecimal component8() {
        return getRentalRate();
    }

    @Override
    public UShort component9() {
        return getLength();
    }

    @Override
    public BigDecimal component10() {
        return getReplacementCost();
    }

    @Override
    public FilmRating component11() {
        return getRating();
    }

    @Override
    public String component12() {
        return getSpecialFeatures();
    }

    @Override
    public LocalDateTime component13() {
        return getLastUpdate();
    }

    @Override
    public UShort value1() {
        return getFilmId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Year value4() {
        return getReleaseYear();
    }

    @Override
    public UByte value5() {
        return getLanguageId();
    }

    @Override
    public UByte value6() {
        return getOriginalLanguageId();
    }

    @Override
    public UByte value7() {
        return getRentalDuration();
    }

    @Override
    public BigDecimal value8() {
        return getRentalRate();
    }

    @Override
    public UShort value9() {
        return getLength();
    }

    @Override
    public BigDecimal value10() {
        return getReplacementCost();
    }

    @Override
    public FilmRating value11() {
        return getRating();
    }

    @Override
    public String value12() {
        return getSpecialFeatures();
    }

    @Override
    public LocalDateTime value13() {
        return getLastUpdate();
    }

    @Override
    public FilmRecord value1(UShort value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public FilmRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FilmRecord value4(Year value) {
        setReleaseYear(value);
        return this;
    }

    @Override
    public FilmRecord value5(UByte value) {
        setLanguageId(value);
        return this;
    }

    @Override
    public FilmRecord value6(UByte value) {
        setOriginalLanguageId(value);
        return this;
    }

    @Override
    public FilmRecord value7(UByte value) {
        setRentalDuration(value);
        return this;
    }

    @Override
    public FilmRecord value8(BigDecimal value) {
        setRentalRate(value);
        return this;
    }

    @Override
    public FilmRecord value9(UShort value) {
        setLength(value);
        return this;
    }

    @Override
    public FilmRecord value10(BigDecimal value) {
        setReplacementCost(value);
        return this;
    }

    @Override
    public FilmRecord value11(FilmRating value) {
        setRating(value);
        return this;
    }

    @Override
    public FilmRecord value12(String value) {
        setSpecialFeatures(value);
        return this;
    }

    @Override
    public FilmRecord value13(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public FilmRecord values(UShort value1, String value2, String value3, Year value4, UByte value5, UByte value6, UByte value7, BigDecimal value8, UShort value9, BigDecimal value10, FilmRating value11, String value12, LocalDateTime value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmRecord
     */
    public FilmRecord() {
        super(Film.FILM);
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(UShort filmId, String title, String description, Year releaseYear, UByte languageId, UByte originalLanguageId, UByte rentalDuration, BigDecimal rentalRate, UShort length, BigDecimal replacementCost, FilmRating rating, String specialFeatures, LocalDateTime lastUpdate) {
        super(Film.FILM);

        setFilmId(filmId);
        setTitle(title);
        setDescription(description);
        setReleaseYear(releaseYear);
        setLanguageId(languageId);
        setOriginalLanguageId(originalLanguageId);
        setRentalDuration(rentalDuration);
        setRentalRate(rentalRate);
        setLength(length);
        setReplacementCost(replacementCost);
        setRating(rating);
        setSpecialFeatures(specialFeatures);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
