/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.routines;


import me.afibarra.db.Sakila;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmInStock extends AbstractRoutine<Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>sakila.film_in_stock.p_film_id</code>.
     */
    public static final Parameter<Integer> P_FILM_ID = Internal.createParameter("p_film_id", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>sakila.film_in_stock.p_store_id</code>.
     */
    public static final Parameter<Integer> P_STORE_ID = Internal.createParameter("p_store_id", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>sakila.film_in_stock.p_film_count</code>.
     */
    public static final Parameter<Integer> P_FILM_COUNT = Internal.createParameter("p_film_count", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public FilmInStock() {
        super("film_in_stock", Sakila.SAKILA);

        addInParameter(P_FILM_ID);
        addInParameter(P_STORE_ID);
        addOutParameter(P_FILM_COUNT);
    }

    /**
     * Set the <code>p_film_id</code> parameter IN value to the routine
     */
    public void setPFilmId(Integer value) {
        setValue(P_FILM_ID, value);
    }

    /**
     * Set the <code>p_store_id</code> parameter IN value to the routine
     */
    public void setPStoreId(Integer value) {
        setValue(P_STORE_ID, value);
    }

    /**
     * Get the <code>p_film_count</code> parameter OUT value from the routine
     */
    public Integer getPFilmCount() {
        return get(P_FILM_COUNT);
    }
}
