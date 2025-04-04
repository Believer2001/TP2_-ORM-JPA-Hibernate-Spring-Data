package ma.enset.Hospital.Web;


import ma.enset.Hospital.Repository.PatientRepository;
import ma.enset.Hospital.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/patients")
    public  List<Patient> patientList(){
        return patientRepository.findAll();
    }

}
