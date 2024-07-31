/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables;


import java.math.BigDecimal;
import java.util.function.Function;

import me.afibarra.db.Sakila;
import me.afibarra.db.enums.FilmListRating;
import me.afibarra.db.tables.records.FilmListRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UShort;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmList extends TableImpl<FilmListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.film_list</code>
     */
    public static final FilmList FILM_LIST = new FilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmListRecord> getRecordType() {
        return FilmListRecord.class;
    }

    /**
     * The column <code>sakila.film_list.FID</code>.
     */
    public final TableField<FilmListRecord, UShort> FID = createField(DSL.name("FID"), SQLDataType.SMALLINTUNSIGNED.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>sakila.film_list.title</code>.
     */
    public final TableField<FilmListRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sakila.film_list.description</code>.
     */
    public final TableField<FilmListRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.CLOB)), this, "");

    /**
     * The column <code>sakila.film_list.category</code>.
     */
    public final TableField<FilmListRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>sakila.film_list.price</code>.
     */
    public final TableField<FilmListRecord, BigDecimal> PRICE = createField(DSL.name("price"), SQLDataType.DECIMAL(4, 2).nullable(false).defaultValue(DSL.field(DSL.raw("4.99"), SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.film_list.length</code>.
     */
    public final TableField<FilmListRecord, UShort> LENGTH = createField(DSL.name("length"), SQLDataType.SMALLINTUNSIGNED.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.SMALLINTUNSIGNED)), this, "");

    /**
     * The column <code>sakila.film_list.rating</code>.
     */
    public final TableField<FilmListRecord, FilmListRating> RATING = createField(DSL.name("rating"), SQLDataType.VARCHAR(5).defaultValue(DSL.field(DSL.raw("'G'"), SQLDataType.VARCHAR)).asEnumDataType(
        FilmListRating.class), this, "");

    /**
     * The column <code>sakila.film_list.actors</code>.
     */
    public final TableField<FilmListRecord, String> ACTORS = createField(DSL.name("actors"), SQLDataType.CLOB.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.CLOB)), this, "");

    private FilmList(Name alias, Table<FilmListRecord> aliased) {
        this(alias, aliased, null);
    }

    private FilmList(Name alias, Table<FilmListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `film_list` as select `sakila`.`film`.`film_id` AS `FID`,`sakila`.`film`.`title` AS `title`,`sakila`.`film`.`description` AS `description`,`sakila`.`category`.`name` AS `category`,`sakila`.`film`.`rental_rate` AS `price`,`sakila`.`film`.`length` AS `length`,`sakila`.`film`.`rating` AS `rating`,group_concat(concat(`sakila`.`actor`.`first_name`,' ',`sakila`.`actor`.`last_name`) separator ', ') AS `actors` from ((((`sakila`.`film` left join `sakila`.`film_category` on(`sakila`.`film_category`.`film_id` = `sakila`.`film`.`film_id`)) left join `sakila`.`category` on(`sakila`.`category`.`category_id` = `sakila`.`film_category`.`category_id`)) left join `sakila`.`film_actor` on(`sakila`.`film`.`film_id` = `sakila`.`film_actor`.`film_id`)) left join `sakila`.`actor` on(`sakila`.`film_actor`.`actor_id` = `sakila`.`actor`.`actor_id`)) group by `sakila`.`film`.`film_id`,`sakila`.`category`.`name`"));
    }

    /**
     * Create an aliased <code>sakila.film_list</code> table reference
     */
    public FilmList(String alias) {
        this(DSL.name(alias), FILM_LIST);
    }

    /**
     * Create an aliased <code>sakila.film_list</code> table reference
     */
    public FilmList(Name alias) {
        this(alias, FILM_LIST);
    }

    /**
     * Create a <code>sakila.film_list</code> table reference
     */
    public FilmList() {
        this(DSL.name("film_list"), null);
    }

    public <O extends Record> FilmList(Table<O> child, ForeignKey<O, FilmListRecord> key) {
        super(child, key, FILM_LIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public FilmList as(String alias) {
        return new FilmList(DSL.name(alias), this);
    }

    @Override
    public FilmList as(Name alias) {
        return new FilmList(alias, this);
    }

    @Override
    public FilmList as(Table<?> alias) {
        return new FilmList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(String name) {
        return new FilmList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(Name name) {
        return new FilmList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(Table<?> name) {
        return new FilmList(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<UShort, String, String, String, BigDecimal, UShort, FilmListRating, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super UShort, ? super String, ? super String, ? super String, ? super BigDecimal, ? super UShort, ? super FilmListRating, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super UShort, ? super String, ? super String, ? super String, ? super BigDecimal, ? super UShort, ? super FilmListRating, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
