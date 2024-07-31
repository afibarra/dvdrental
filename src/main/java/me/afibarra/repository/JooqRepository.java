package me.afibarra.repository;

import java.util.List;
import me.afibarra.dao.TableDao;
import org.jooq.Record;
import org.jooq.impl.TableImpl;

public interface JooqRepository<T extends TableDao> {

    List<T> findAll(Integer rowsPerPage);
}
