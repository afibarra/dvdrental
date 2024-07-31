/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables;


import java.math.BigDecimal;
import java.util.function.Function;

import me.afibarra.db.Sakila;
import me.afibarra.db.tables.records.SalesByStoreRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesByStore extends TableImpl<SalesByStoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.sales_by_store</code>
     */
    public static final SalesByStore SALES_BY_STORE = new SalesByStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesByStoreRecord> getRecordType() {
        return SalesByStoreRecord.class;
    }

    /**
     * The column <code>sakila.sales_by_store.store</code>.
     */
    public final TableField<SalesByStoreRecord, String> STORE = createField(DSL.name("store"), SQLDataType.VARCHAR(101).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sakila.sales_by_store.manager</code>.
     */
    public final TableField<SalesByStoreRecord, String> MANAGER = createField(DSL.name("manager"), SQLDataType.VARCHAR(91).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sakila.sales_by_store.total_sales</code>.
     */
    public final TableField<SalesByStoreRecord, BigDecimal> TOTAL_SALES = createField(DSL.name("total_sales"), SQLDataType.DECIMAL(27, 2).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.DECIMAL)), this, "");

    private SalesByStore(Name alias, Table<SalesByStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesByStore(Name alias, Table<SalesByStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `sales_by_store` as select concat(`c`.`city`,',',`cy`.`country`) AS `store`,concat(`m`.`first_name`,' ',`m`.`last_name`) AS `manager`,sum(`p`.`amount`) AS `total_sales` from (((((((`sakila`.`payment` `p` join `sakila`.`rental` `r` on(`p`.`rental_id` = `r`.`rental_id`)) join `sakila`.`inventory` `i` on(`r`.`inventory_id` = `i`.`inventory_id`)) join `sakila`.`store` `s` on(`i`.`store_id` = `s`.`store_id`)) join `sakila`.`address` `a` on(`s`.`address_id` = `a`.`address_id`)) join `sakila`.`city` `c` on(`a`.`city_id` = `c`.`city_id`)) join `sakila`.`country` `cy` on(`c`.`country_id` = `cy`.`country_id`)) join `sakila`.`staff` `m` on(`s`.`manager_staff_id` = `m`.`staff_id`)) group by `s`.`store_id` order by `cy`.`country`,`c`.`city`"));
    }

    /**
     * Create an aliased <code>sakila.sales_by_store</code> table reference
     */
    public SalesByStore(String alias) {
        this(DSL.name(alias), SALES_BY_STORE);
    }

    /**
     * Create an aliased <code>sakila.sales_by_store</code> table reference
     */
    public SalesByStore(Name alias) {
        this(alias, SALES_BY_STORE);
    }

    /**
     * Create a <code>sakila.sales_by_store</code> table reference
     */
    public SalesByStore() {
        this(DSL.name("sales_by_store"), null);
    }

    public <O extends Record> SalesByStore(Table<O> child, ForeignKey<O, SalesByStoreRecord> key) {
        super(child, key, SALES_BY_STORE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public SalesByStore as(String alias) {
        return new SalesByStore(DSL.name(alias), this);
    }

    @Override
    public SalesByStore as(Name alias) {
        return new SalesByStore(alias, this);
    }

    @Override
    public SalesByStore as(Table<?> alias) {
        return new SalesByStore(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(String name) {
        return new SalesByStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(Name name) {
        return new SalesByStore(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(Table<?> name) {
        return new SalesByStore(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super BigDecimal, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super BigDecimal, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
