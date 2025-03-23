package ma.enset.Hospital.Repository;

import ma.enset.Hospital.entities.Consultation;
import ma.enset.Hospital.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {

}
