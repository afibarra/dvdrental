package me.afibarra.controller;

import java.util.List;
import me.afibarra.dao.ActorDao;
import me.afibarra.repository.JooqRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorController {

    private final JooqRepository<ActorDao> repository;

    public ActorController(@Qualifier("actorRepository") JooqRepository<ActorDao> repository) {
        this.repository = repository;
    }

    @GetMapping("/list")
    public ResponseEntity<List<ActorDao>> findAll() {
        List<ActorDao> actors = repository.findAll(null);

        return ResponseEntity.ok(actors);
    }
}
