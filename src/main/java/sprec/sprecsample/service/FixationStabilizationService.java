package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.FixationStabilization;
import sprec.sprecsample.repository.FixationStabilizationRepository;

@Service
public class FixationStabilizationService {
	@Autowired
	FixationStabilizationRepository fixationStabilizationRepository;
	
	public Iterable<FixationStabilization> getAllFixationStabilizations(){
		return fixationStabilizationRepository.findAll();
	}
	
	public Optional<FixationStabilization> getFixationStabilizationById(Integer id){
		return fixationStabilizationRepository.findById(id);
	}
	
	public FixationStabilization addFixationStabilization(FixationStabilization fixationStabilization) {
		return fixationStabilizationRepository.save(fixationStabilization);
	}
}
