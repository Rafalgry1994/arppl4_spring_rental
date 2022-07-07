package pl.sda.arppl4_spring_rental.repository;

import pl.sda.arppl4_spring_rental.model.Samochod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamochodRepository extends JpaRepository<Samochod, Long> {
}
