package org.sid.dsavion.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Avion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_avion;
    private String model;
    private String color;
    private String matricule;
    private Long price;
}
