/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db;


import java.util.Arrays;
import java.util.List;

import me.afibarra.db.tables.Actor;
import me.afibarra.db.tables.ActorInfo;
import me.afibarra.db.tables.Address;
import me.afibarra.db.tables.Category;
import me.afibarra.db.tables.City;
import me.afibarra.db.tables.Country;
import me.afibarra.db.tables.Customer;
import me.afibarra.db.tables.CustomerList;
import me.afibarra.db.tables.Film;
import me.afibarra.db.tables.FilmActor;
import me.afibarra.db.tables.FilmCategory;
import me.afibarra.db.tables.FilmList;
import me.afibarra.db.tables.FilmText;
import me.afibarra.db.tables.Inventory;
import me.afibarra.db.tables.Language;
import me.afibarra.db.tables.NicerButSlowerFilmList;
import me.afibarra.db.tables.Payment;
import me.afibarra.db.tables.Rental;
import me.afibarra.db.tables.SalesByFilmCategory;
import me.afibarra.db.tables.SalesByStore;
import me.afibarra.db.tables.Staff;
import me.afibarra.db.tables.StaffList;
import me.afibarra.db.tables.Store;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sakila extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila</code>
     */
    public static final Sakila SAKILA = new Sakila();

    /**
     * The table <code>sakila.actor</code>.
     */
    public final Actor ACTOR = Actor.ACTOR;

    /**
     * VIEW
     */
    public final ActorInfo ACTOR_INFO = ActorInfo.ACTOR_INFO;

    /**
     * The table <code>sakila.address</code>.
     */
    public final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>sakila.category</code>.
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>sakila.city</code>.
     */
    public final City CITY = City.CITY;

    /**
     * The table <code>sakila.country</code>.
     */
    public final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>sakila.customer</code>.
     */
    public final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * VIEW
     */
    public final CustomerList CUSTOMER_LIST = CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>sakila.film</code>.
     */
    public final Film FILM = Film.FILM;

    /**
     * The table <code>sakila.film_actor</code>.
     */
    public final FilmActor FILM_ACTOR = FilmActor.FILM_ACTOR;

    /**
     * The table <code>sakila.film_category</code>.
     */
    public final FilmCategory FILM_CATEGORY = FilmCategory.FILM_CATEGORY;

    /**
     * VIEW
     */
    public final FilmList FILM_LIST = FilmList.FILM_LIST;

    /**
     * The table <code>sakila.film_text</code>.
     */
    public final FilmText FILM_TEXT = FilmText.FILM_TEXT;

    /**
     * The table <code>sakila.inventory</code>.
     */
    public final Inventory INVENTORY = Inventory.INVENTORY;

    /**
     * The table <code>sakila.language</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * VIEW
     */
    public final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>sakila.payment</code>.
     */
    public final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>sakila.rental</code>.
     */
    public final Rental RENTAL = Rental.RENTAL;

    /**
     * VIEW
     */
    public final SalesByFilmCategory SALES_BY_FILM_CATEGORY = SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * VIEW
     */
    public final SalesByStore SALES_BY_STORE = SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>sakila.staff</code>.
     */
    public final Staff STAFF = Staff.STAFF;

    /**
     * VIEW
     */
    public final StaffList STAFF_LIST = StaffList.STAFF_LIST;

    /**
     * The table <code>sakila.store</code>.
     */
    public final Store STORE = Store.STORE;

    /**
     * No further instances allowed
     */
    private Sakila() {
        super("sakila", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Actor.ACTOR,
            ActorInfo.ACTOR_INFO,
            Address.ADDRESS,
            Category.CATEGORY,
            City.CITY,
            Country.COUNTRY,
            Customer.CUSTOMER,
            CustomerList.CUSTOMER_LIST,
            Film.FILM,
            FilmActor.FILM_ACTOR,
            FilmCategory.FILM_CATEGORY,
            FilmList.FILM_LIST,
            FilmText.FILM_TEXT,
            Inventory.INVENTORY,
            Language.LANGUAGE,
            NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST,
            Payment.PAYMENT,
            Rental.RENTAL,
            SalesByFilmCategory.SALES_BY_FILM_CATEGORY,
            SalesByStore.SALES_BY_STORE,
            Staff.STAFF,
            StaffList.STAFF_LIST,
            Store.STORE
        );
    }
}