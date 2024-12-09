package org.sid.dsavion;

import org.sid.dsavion.dao.entities.Avion;
import org.sid.dsavion.dao.repositories.AvionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DsAvionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsAvionApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AvionRepository avionRepository){
        return args -> {
            avionRepository.save(Avion.builder().model("Boeing 737").price(10000000L).matricule("B737").build());
            avionRepository.save(Avion.builder().model("Boeing 747").price(20000000L).matricule("B747").build());
            avionRepository.save(Avion.builder().model("Boeing 777").price(30000000L).matricule("B777").build());


        };
    }
}
