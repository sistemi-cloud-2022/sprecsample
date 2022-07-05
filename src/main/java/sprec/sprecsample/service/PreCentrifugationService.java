package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.PreCentrifugation;
import sprec.sprecsample.repository.PreCentrifugationRepository;

@Service
public class PreCentrifugationService {
	@Autowired
	PreCentrifugationRepository preCentrifugationRepository;
	
	public Iterable<PreCentrifugation> getAllPreCentrifugations(){
		return preCentrifugationRepository.findAll();
	}
	
	public Optional<PreCentrifugation> getPreCentrifugationById(Integer id){
		return preCentrifugationRepository.findById(id);
	}
	
	public PreCentrifugation addPreCentrifugation(PreCentrifugation preCentrifugation) {
		return preCentrifugationRepository.save(preCentrifugation);
	}
}
