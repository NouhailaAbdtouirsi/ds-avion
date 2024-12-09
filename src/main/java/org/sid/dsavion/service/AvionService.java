package org.sid.dsavion.service;

import org.sid.dsavion.dto.AvionDTO;

import java.util.List;

public interface AvionService {
    public List<AvionDTO> getAllAvions();
    public AvionDTO saveAvion(AvionDTO avion);
    public AvionDTO getAvionById(Long id);
    public AvionDTO updateAvion(AvionDTO avion);
    public AvionDTO getAvionByModel(String model);
    public AvionDTO getAvionByModelAndPrice(String model,Long price);
    public AvionDTO deleteAvionById(Long id);
}
