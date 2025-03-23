package ma.enset.Hospital;

import ma.enset.Hospital.Repository.patientRepository;
import ma.enset.Hospital.entities.Patient;
import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class Hospital implements CommandLineRunner {

    @Autowired
    private patientRepository PatientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Hospital.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        /*
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        PatientRepository.save(new Patient(null,"Tseh",dateFormat.parse("11/07/2001"),true,75));
        PatientRepository.save(new Patient(null,"ako",dateFormat.parse("21/09/2008"),true,75));
        PatientRepository.save(new Patient(null,"Dzah",dateFormat.parse("11/12/2005"),true,75));
        PatientRepository.save(new Patient(null,"Tseh",dateFormat.parse("17/07/2008"),true,75));


        // la methode findon  pour consulter tous les client
        List<Patient> patients =PatientRepository.findAll();
        patients.forEach(p->{System.out.println(p.toString());
        });

        // la methode find by id

        Patient patient =PatientRepository.findById(Long.valueOf(1)).get();
        System.out.println("**************************************");
        System.out.println(patient.getId());
        System.out.println(patient.getNom());
        System.out.println(patient.getDateNaissance());
        System.out.println(patient.isMalade()


        );
        System.out.println(patient.getScore());
        System.out.println("**************************************");

   //       la methode pour charger   pour chercher un patientt

        // on va juste chercher deux patient a  la fois
        List<String> personne  = Arrays.asList("Tseh","ako");
        List<Patient>  patients1 =PatientRepository.findBynomIn(personne);
         System.out.println("************************");
        patients1.forEach(p->{System.out.println(p.toString());
        });
        System.out.println("************************");

        // la mise a jour des  patiennt

        // poiur celal nous allons faire la recheche par id , modifions l'id et faisons la mise a jour
        Patient patientMSJ =PatientRepository.findById(Long.valueOf(1)).get();

        patientMSJ.setNom("Kokou mise a jour");

        PatientRepository.save(patientMSJ);

      // la suppresion de patient
        Patient Asupprimer =PatientRepository.findById(Long.valueOf(1)).get();
        PatientRepository.delete(Asupprimer);


         */
    }


/*

4. Configurer l'unité de persistance dans le ficher application.properties
5. Créer l'interface JPA Repository basée sur Spring data
6. Tester quelques opérations de gestion de patients :
    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient
    - supprimer un patient
7. Migrer de H2 Database vers MySQL
8. Reprendre les exemples  du Patient, Médecin, rendez-vous, consultation, users et roles de la vidéo : */



}