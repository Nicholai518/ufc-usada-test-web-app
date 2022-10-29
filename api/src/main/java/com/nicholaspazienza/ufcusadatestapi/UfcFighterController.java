package com.nicholaspazienza.ufcusadatestapi;

import com.nicholaspazienza.ufcusadatestapi.entities.Fighter;
import com.nicholaspazienza.ufcusadatestapi.repository.FighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fighter")
public class UfcFighterController {

    @Autowired
    FighterRepository fighterRepository;

    @GetMapping("/")
    public List<Fighter> index() {
        return fighterRepository.findAll();
    }

    @GetMapping("/{id}")
    public Fighter show(@PathVariable String id) {
        int fighterId = Integer.parseInt(id);
        return fighterRepository.findById(fighterId).get();
    }

    @PostMapping("/")
    public Fighter create(@RequestBody Map<String, String> body) {
        String firstname = body.get("firstname");
        String lastname = body.get("lastname");
        return fighterRepository.save(new Fighter(firstname, lastname));
    }

    @PutMapping("/{id}")
    public Fighter update(@PathVariable String id, @RequestBody Map<String, String> body) {
        int fighterId = Integer.parseInt(id);
        // getting fighter
        Fighter fighter = fighterRepository.findById(fighterId).get();
        fighter.setFirstname(body.get("firstname"));
        fighter.setLastname(body.get("lastname"));
        return fighterRepository.save(fighter);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        int fighterId = Integer.parseInt(id);
        fighterRepository.delete(fighterRepository.findById(fighterId).get());
        return true;
    }
}
