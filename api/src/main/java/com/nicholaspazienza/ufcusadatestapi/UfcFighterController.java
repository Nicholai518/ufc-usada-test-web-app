package com.nicholaspazienza.ufcusadatestapi;

import com.nicholaspazienza.ufcusadatestapi.model.Fighter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("fighters")
public class UfcFighterController {
    // fields
    Map<Integer, Fighter> database = new HashMap<>() {{
        put(1, new Fighter(1, "Joe", "Fighterguy"));
        put(2, new Fighter(2, "Kevin", "Kickerguy"));
        put(3, new Fighter(3, "Nick", "Boxerguy"));
    }};

    @GetMapping("/by-year/{year}")
    public Collection<Fighter> getFighters() {
        return database.values();
    }

    @GetMapping("/{id}")
    public Fighter getFighter(@PathVariable("id") Integer id) {
        return database.get(id);
    }
}
