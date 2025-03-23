package ma.enset.Hospital.Repository;

import ma.enset.Hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
Medecin findMedecinByNom(String name);
}
