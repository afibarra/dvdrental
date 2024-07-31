/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables.records;


import java.time.LocalDateTime;

import me.afibarra.db.tables.Customer;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements Record9<UShort, UByte, String, String, String, UShort, Byte, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.customer.customer_id</code>.
     */
    public void setCustomerId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.customer.customer_id</code>.
     */
    public UShort getCustomerId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.customer.store_id</code>.
     */
    public void setStoreId(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.customer.store_id</code>.
     */
    public UByte getStoreId() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>sakila.customer.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.customer.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.customer.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.customer.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.customer.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sakila.customer.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.customer.address_id</code>.
     */
    public void setAddressId(UShort value) {
        set(5, value);
    }

    /**
     * Getter for <code>sakila.customer.address_id</code>.
     */
    public UShort getAddressId() {
        return (UShort) get(5);
    }

    /**
     * Setter for <code>sakila.customer.active</code>.
     */
    public void setActive(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>sakila.customer.active</code>.
     */
    public Byte getActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>sakila.customer.create_date</code>.
     */
    public void setCreateDate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>sakila.customer.create_date</code>.
     */
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>sakila.customer.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>sakila.customer.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<UShort, UByte, String, String, String, UShort, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<UShort, UByte, String, String, String, UShort, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<UShort> field1() {
        return Customer.CUSTOMER.CUSTOMER_ID;
    }

    @Override
    public Field<UByte> field2() {
        return Customer.CUSTOMER.STORE_ID;
    }

    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.FIRST_NAME;
    }

    @Override
    public Field<String> field4() {
        return Customer.CUSTOMER.LAST_NAME;
    }

    @Override
    public Field<String> field5() {
        return Customer.CUSTOMER.EMAIL;
    }

    @Override
    public Field<UShort> field6() {
        return Customer.CUSTOMER.ADDRESS_ID;
    }

    @Override
    public Field<Byte> field7() {
        return Customer.CUSTOMER.ACTIVE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Customer.CUSTOMER.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Customer.CUSTOMER.LAST_UPDATE;
    }

    @Override
    public UShort component1() {
        return getCustomerId();
    }

    @Override
    public UByte component2() {
        return getStoreId();
    }

    @Override
    public String component3() {
        return getFirstName();
    }

    @Override
    public String component4() {
        return getLastName();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public UShort component6() {
        return getAddressId();
    }

    @Override
    public Byte component7() {
        return getActive();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime component9() {
        return getLastUpdate();
    }

    @Override
    public UShort value1() {
        return getCustomerId();
    }

    @Override
    public UByte value2() {
        return getStoreId();
    }

    @Override
    public String value3() {
        return getFirstName();
    }

    @Override
    public String value4() {
        return getLastName();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public UShort value6() {
        return getAddressId();
    }

    @Override
    public Byte value7() {
        return getActive();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime value9() {
        return getLastUpdate();
    }

    @Override
    public CustomerRecord value1(UShort value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public CustomerRecord value2(UByte value) {
        setStoreId(value);
        return this;
    }

    @Override
    public CustomerRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public CustomerRecord value4(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public CustomerRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public CustomerRecord value6(UShort value) {
        setAddressId(value);
        return this;
    }

    @Override
    public CustomerRecord value7(Byte value) {
        setActive(value);
        return this;
    }

    @Override
    public CustomerRecord value8(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public CustomerRecord value9(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public CustomerRecord values(UShort value1, UByte value2, String value3, String value4, String value5, UShort value6, Byte value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(UShort customerId, UByte storeId, String firstName, String lastName, String email, UShort addressId, Byte active, LocalDateTime createDate, LocalDateTime lastUpdate) {
        super(Customer.CUSTOMER);

        setCustomerId(customerId);
        setStoreId(storeId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAddressId(addressId);
        setActive(active);
        setCreateDate(createDate);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
