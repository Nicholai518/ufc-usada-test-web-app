package com.nicholaspazienza.ufcusadatestapi;

import com.nicholaspazienza.ufcusadatestapi.entities.UsadaTestCount;
import com.nicholaspazienza.ufcusadatestapi.repository.UsadaTestCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usadaTestCount")
public class UsadaTestCountController {

    @Autowired
    UsadaTestCountRepository usadaTestCountRepository;

    @GetMapping("/")
    public List<UsadaTestCount> index() {
        return usadaTestCountRepository.findAll();
    }

    @GetMapping("/{id}")
    public UsadaTestCount show(@PathVariable String id) {
        int usadaTestCountId = Integer.parseInt(id);
        return usadaTestCountRepository.findById(usadaTestCountId).get();
    }

    @PostMapping("/")
    public UsadaTestCount create(@RequestBody Map<String, String> body) {
        int year = Integer.parseInt(body.get("year"));
        int total = Integer.parseInt(body.get("total"));
        int fighterId = Integer.parseInt(body.get("fighterId"));
        return usadaTestCountRepository.save(new UsadaTestCount(year, total, fighterId));
    }

    @PutMapping("/{id}")
    public UsadaTestCount update(@PathVariable String id, @RequestBody Map<String, String> body) {
        int usadaTestCountId = Integer.parseInt(id);
        // getting fighter
        UsadaTestCount usadaTestCount = usadaTestCountRepository.findById(usadaTestCountId).get();
        usadaTestCount.setYear(Integer.parseInt(body.get("year")));
        usadaTestCount.setTotal(Integer.parseInt(body.get("total")));
        usadaTestCount.setFighterId(Integer.parseInt(body.get("fighterId")));
        return usadaTestCountRepository.save(usadaTestCount);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String id) {
        int usadaTestCountId = Integer.parseInt(id);
        usadaTestCountRepository.delete(usadaTestCountRepository.findById(usadaTestCountId).get());
        return true;
    }
}
