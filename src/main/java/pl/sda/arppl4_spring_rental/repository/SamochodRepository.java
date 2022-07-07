package repository;

import model.Samochod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamochodRepository extends JpaRepository<Samochod, Long> {
}
