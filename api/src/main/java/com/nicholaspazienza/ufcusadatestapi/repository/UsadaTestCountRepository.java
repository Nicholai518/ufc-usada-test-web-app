package com.nicholaspazienza.ufcusadatestapi.repository;

import com.nicholaspazienza.ufcusadatestapi.entities.UsadaTestCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsadaTestCountRepository extends JpaRepository<UsadaTestCount, Integer> {
    /*
     * The parent class JpaRepository provides some helpful methods by default:
     * - findAllById(Iterable<ID> ids)
     * - getById(ID id)
     * etc.
     */
}
