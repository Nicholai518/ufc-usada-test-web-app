package com.nicholaspazienza.ufcusadatestapi.repository;

import com.nicholaspazienza.ufcusadatestapi.entities.UsadaTestCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsadaTestCountRepository extends JpaRepository<UsadaTestCount, Integer> {
    /*
     * The parent class JpaRepository provides some helpful methods by default:
     * - findAllById(Iterable<ID> ids)
     * - getById(ID id)
     * etc.
     */

    /**
     * Finds all the tests count rows for a given year.
     *
     * @param year The year to find results for.
     * @return The list of results for the given year.
     */
    List<UsadaTestCount> findByYear(int year);
}
