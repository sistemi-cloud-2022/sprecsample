package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.SprecSample;
import sprec.sprecsample.repository.SprecSampleRepository;

@Service
public class SprecSampleService {
	@Autowired
	SprecSampleRepository sprecSampleRepository;
	
	public Iterable<SprecSample> getAllSprecSamples(){
		return sprecSampleRepository.findAll();
	}
	
	public Optional<SprecSample> getSprecSampleById(Integer id){
		return sprecSampleRepository.findById(id);
	}
	
	public SprecSample addSprecSample(SprecSample sprecSample) {
		return sprecSampleRepository.save(sprecSample);
	}
}
