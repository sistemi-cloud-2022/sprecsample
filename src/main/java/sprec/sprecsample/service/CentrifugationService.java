package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.Centrifugation;
import sprec.sprecsample.repository.CentrifugationRepository;

@Service
public class CentrifugationService {
	@Autowired
	CentrifugationRepository centrifugationRepository;
	
	public Iterable<Centrifugation> getAllCentrifugations(){
		return centrifugationRepository.findAll();
	}
	
	public Optional<Centrifugation> getCentrifugationById(Integer id){
		return centrifugationRepository.findById(id);
	}
	
	public Centrifugation addCentrifugation(Centrifugation centrifugation) {
		return centrifugationRepository.save(centrifugation);
	}
}
