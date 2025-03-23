package ma.enset.Hospital;

import ma.enset.Hospital.Repository.ConsultationRepository;
import ma.enset.Hospital.Repository.MedecinRepository;
import ma.enset.Hospital.Repository.PatientRepository;
import ma.enset.Hospital.Repository.RendezVousRepository;
import ma.enset.Hospital.entities.*;
import ma.enset.Hospital.service.HospitalServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.stream.Stream;


@SpringBootApplication
public class Hospital{

   // @Autowired
   // private patientRepository PatientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Hospital.class, args);
    }


     /*
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





    }
         */



// on va faire le text des  nouvelle entite que nous venons de definir:

// on va utiliser l'onbejt commandeLinerunner pour eviter d'implementer commande ling runner
// on va creer une methode qui retoure un objet de type commande ligne Runner

@Bean
CommandLineRunner start(HospitalServiceImpl hospitalService,
                        PatientRepository patientRepository,
                        MedecinRepository medecinRepository,
                        RendezVousRepository rendezVousRepository) {
    return args -> {
        // insertion de patient
        Stream.of("Hasan","Mohammed","Idriss")
                .forEach(name -> {

                    Patient patient =new Patient();
                    patient.setNom(name);
                    patient.setDateNaissance(new Date());
                    patient.setMalade(false);
                    hospitalService.savePatient(patient);
                });

  // insertion de medecin
        Stream.of("Alfa","yasmine","Benoit","Donald")
                .forEach(name -> {

                    Medecin medecin =new Medecin();
                   medecin.setNom(name);
                   medecin.setEmail(name+"@gmail.com");
                   medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                   hospitalService.saveMedecin(medecin);

                });

        // recherche de patient
        Patient patient = patientRepository.findById(1L).orElse(null);
        Patient patient1 =patientRepository.findByNom("Mohammed");

        //recherche de medecin

        Medecin medecin =medecinRepository.findMedecinByNom("yasmine");


        // creation de rendezVous

        RendezVous rendezVous =new RendezVous();
        rendezVous.setDate(new Date());
        rendezVous.setStatus(StatusRDV.PENDING);
        rendezVous.setMedecin(medecin);
        rendezVous.setPatient(patient);

        rendezVousRepository.save(rendezVous);


        // creationde consultation

         RendezVous rendezVous1=rendezVousRepository.findById(1L).orElse(null);

        Consultation consultation =new Consultation();
        consultation.setDateConsultation(new Date());
        consultation.setRendezVous(rendezVous1);
        consultation.setRapport("Rapport de la consultaiton ......");
        hospitalService.saveConsultation(consultation);

    };
}




}