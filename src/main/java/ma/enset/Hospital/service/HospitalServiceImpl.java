package ma.enset.Hospital.service;

import jakarta.transaction.Transactional;
import ma.enset.Hospital.Repository.ConsultationRepository;
import ma.enset.Hospital.Repository.MedecinRepository;
import ma.enset.Hospital.Repository.PatientRepository;
import ma.enset.Hospital.Repository.RendezVousRepository;
import ma.enset.Hospital.entities.Consultation;
import ma.enset.Hospital.entities.Medecin;
import ma.enset.Hospital.entities.Patient;
import ma.enset.Hospital.entities.RendezVous;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class HospitalServiceImpl implements IHospitalService {
    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, ConsultationRepository consultationRepository, RendezVousRepository rendezVousRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezVousRepository = rendezVousRepository;
    }

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private ConsultationRepository consultationRepository;
    private RendezVousRepository rendezVousRepository;


    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezvous(RendezVous rendezVous) {

        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}
