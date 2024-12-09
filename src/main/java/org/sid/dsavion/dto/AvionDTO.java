package org.sid.dsavion.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class AvionDTO {
    private String model;
    private String color;
    private String matricule;
    private Long price;
}
