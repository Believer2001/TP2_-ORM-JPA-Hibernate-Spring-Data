package ma.enset.Hospital.Repository;

import ma.enset.Hospital.entities.Medecin;
import ma.enset.Hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {

}
