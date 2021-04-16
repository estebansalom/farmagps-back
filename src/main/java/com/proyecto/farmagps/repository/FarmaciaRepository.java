package com.proyecto.farmagps.repository;

import com.proyecto.farmagps.model.Farmacia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Integer> {
    Farmacia findOneByName(String name);
}
