package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.FixationTime;
import sprec.sprecsample.repository.FixationTimeRepository;

@Service
public class FixationTimeService {
	@Autowired
	FixationTimeRepository fixationTimeRepository;
	
	public Iterable<FixationTime> getAllFixationTimes(){
		return fixationTimeRepository.findAll();
	}
	
	public Optional<FixationTime> getFixationTimeById(Integer id){
		return fixationTimeRepository.findById(id);
	}
	
	public FixationTime addFixationTime(FixationTime fixationTime) {
		return fixationTimeRepository.save(fixationTime);
	}
}
