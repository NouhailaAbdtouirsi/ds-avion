package org.sid.dsavion.mapper;

import org.modelmapper.ModelMapper;
import org.sid.dsavion.dao.entities.Avion;
import org.sid.dsavion.dto.AvionDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AvionMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public AvionDTO fromAvionToAvionDto(Avion avion){
        return modelMapper.map(avion,AvionDTO.class);
    }

    public Avion fromAvionDtoToAvion(AvionDTO avionDTO){
        return modelMapper.map(avionDTO,Avion.class);
    }

    public List<AvionDTO> fromAvionListToAvionDTOList(List<Avion> avions) {
        return avions.stream().map(this::fromAvionToAvionDto).toList();
    }
}
