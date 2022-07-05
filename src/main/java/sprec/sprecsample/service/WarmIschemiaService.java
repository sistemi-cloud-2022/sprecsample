package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.WarmIschemia;
import sprec.sprecsample.repository.WarmIschemiaRepository;

@Service
public class WarmIschemiaService {
	@Autowired
	WarmIschemiaRepository warmIschemiaRepository;
	
	public Iterable<WarmIschemia> getAllWarmIschemias(){
		return warmIschemiaRepository.findAll();
	}
	
	public Optional<WarmIschemia> getWarmIschemiaById(Integer id){
		return warmIschemiaRepository.findById(id);
	}
	
	public WarmIschemia addWarmIschemia(WarmIschemia warmIschemia) {
		return warmIschemiaRepository.save(warmIschemia);
	}
}
