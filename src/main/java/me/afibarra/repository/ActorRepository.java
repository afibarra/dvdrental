package me.afibarra.repository;

import static me.afibarra.db.Tables.ACTOR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.afibarra.dao.ActorDao;
import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository implements JooqRepository<ActorDao> {

    @Value("${database.rowsPerPage}")
    private Integer rowsPerPage;

    private final DefaultDSLContext dsl;

    public ActorRepository(final DefaultDSLContext dsl) {
        this.dsl = dsl;
    }

    @Override
    public List<ActorDao> findAll(Integer rowsPerPage) {

        if ((rowsPerPage == null) || (rowsPerPage <= 0)) {
            rowsPerPage = this.rowsPerPage;
        }

        List<ActorDao> actors = new ArrayList<>();
        dsl.selectFrom(ACTOR)
            .orderBy(ACTOR.FIRST_NAME.asc())
            .limit(rowsPerPage)
            .fetch()
            .forEach(r -> actors.add(new ActorDao(r.getFirstName(), r.getLastName())));

        return Collections.unmodifiableList(actors);
    }
}
