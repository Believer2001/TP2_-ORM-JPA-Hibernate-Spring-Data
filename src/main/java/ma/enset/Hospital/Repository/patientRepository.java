package ma.enset.Hospital.Repository;

import ma.enset.Hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientRepository  extends JpaRepository<Patient,Long> {


}
