/*
 * This file is generated by jOOQ.
 */
package me.afibarra.db.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum FilmListRating implements EnumType {

    G("G"),

    PG("PG"),

    PG_13("PG-13"),

    R("R"),

    NC_17("NC-17");

    private final String literal;

    private FilmListRating(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal. Returns
     * <code>null</code>, if no such value could be found, see {@link
     * EnumType#lookupLiteral(Class, String)}.
     */
    public static FilmListRating lookupLiteral(String literal) {
        return EnumType.lookupLiteral(FilmListRating.class, literal);
    }
}
