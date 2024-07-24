/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.tables.records;


import java.time.LocalDateTime;

import me.afibarra.db.tables.Inventory;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InventoryRecord extends UpdatableRecordImpl<InventoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.inventory.inventory_id</code>.
     */
    public void setInventoryId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.inventory.inventory_id</code>.
     */
    public UInteger getInventoryId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>sakila.inventory.film_id</code>.
     */
    public void setFilmId(UShort value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.inventory.film_id</code>.
     */
    public UShort getFilmId() {
        return (UShort) get(1);
    }

    /**
     * Setter for <code>sakila.inventory.store_id</code>.
     */
    public void setStoreId(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.inventory.store_id</code>.
     */
    public UByte getStoreId() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>sakila.inventory.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.inventory.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InventoryRecord
     */
    public InventoryRecord() {
        super(Inventory.INVENTORY);
    }

    /**
     * Create a detached, initialised InventoryRecord
     */
    public InventoryRecord(UInteger inventoryId, UShort filmId, UByte storeId, LocalDateTime lastUpdate) {
        super(Inventory.INVENTORY);

        setInventoryId(inventoryId);
        setFilmId(filmId);
        setStoreId(storeId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}