package com.nicholaspazienza.ufcusadatestapi.repository;

import com.nicholaspazienza.ufcusadatestapi.entities.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Integer> {
    /*
     * The parent class JpaRepository provides some helpful methods by default:
     * - findAllById(Iterable<ID> ids)
     * - getById(ID id)
     * etc.
     */
}
