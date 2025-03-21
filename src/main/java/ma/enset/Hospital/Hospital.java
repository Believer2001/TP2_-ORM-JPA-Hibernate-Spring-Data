package ma.enset.Hospital;

import ma.enset.Hospital.Repository.patientRepository;
import ma.enset.Hospital.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.text.SimpleDateFormat;


@SpringBootApplication
public class Hospital implements CommandLineRunner {

    @Autowired
    private patientRepository PatientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Hospital.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        PatientRepository.save(new Patient(null,"Tseh",dateFormat.parse("11/07/2001"),true,75));
        PatientRepository.save(new Patient(null,"ako",dateFormat.parse("21/09/2008"),true,75));
        PatientRepository.save(new Patient(null,"Dzah",dateFormat.parse("11/12/2005"),true,75));
        PatientRepository.save(new Patient(null,"Tseh",dateFormat.parse("17/07/2008"),true,75));

    }
}