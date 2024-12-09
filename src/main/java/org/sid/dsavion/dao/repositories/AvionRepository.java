package org.sid.dsavion.dao.repositories;

import org.sid.dsavion.dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avion, Long> {
    Avion findByModel(String model);

    Avion findByModelAndPrice(String model, Long price);

    Avion findByMatricule(String matricule);
}
