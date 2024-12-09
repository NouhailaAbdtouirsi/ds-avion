
package org.sid.dsavion.service;

import org.sid.dsavion.dao.entities.Avion;
import org.sid.dsavion.dao.repositories.AvionRepository;
import org.sid.dsavion.dto.AvionDTO;
import org.sid.dsavion.mapper.AvionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvionServiceImp implements AvionService{
    @Autowired
    private AvionRepository avionRepository;
    @Autowired
    private AvionMapper avionMapper;
    public List<AvionDTO> getAllAvions(){
        List<Avion> avions = avionRepository.findAll();
        return avionMapper.fromAvionListToAvionDTOList(avions);
    }

    public AvionDTO saveAvion(AvionDTO avionDto){
        //verifier si le matricule existe deja
//        if(avionRepository.findByMatricule(avionDto.getMatricule()) != null){
//            throw new RuntimeException("Cet avion existe deja");
//        }
        return avionMapper.fromAvionToAvionDto(avionRepository.save(avionMapper.fromAvionDtoToAvion(avionDto)));
    }

    public AvionDTO getAvionById(Long id){
        return avionMapper.fromAvionToAvionDto(avionRepository.findById(id).get());
    }

    public AvionDTO deleteAvionById(Long id) {
        Avion avion = avionRepository.findById(id).get();
        avionRepository.deleteById(id);
        return avionMapper.fromAvionToAvionDto(avion);
    }

    public AvionDTO updateAvion(AvionDTO avionDTO){
        return avionMapper.fromAvionToAvionDto(avionRepository.save(avionMapper.fromAvionDtoToAvion(avionDTO)));
    }


    //get avion by model
    public AvionDTO getAvionByModel(String model){
        return avionMapper.fromAvionToAvionDto(avionRepository.findByModel(model));
    }

    public AvionDTO getAvionByModelAndPrice(String model,Long price){
        return avionMapper.fromAvionToAvionDto(avionRepository.findByModelAndPrice(model,price));
    }
}
