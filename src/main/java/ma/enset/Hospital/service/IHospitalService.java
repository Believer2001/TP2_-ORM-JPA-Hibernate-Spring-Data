package ma.enset.Hospital.service;

import ma.enset.Hospital.entities.Consultation;
import ma.enset.Hospital.entities.Medecin;
import ma.enset.Hospital.entities.Patient;
import ma.enset.Hospital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezvous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
