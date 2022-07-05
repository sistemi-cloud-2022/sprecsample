package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.PrimaryContainer;
import sprec.sprecsample.repository.PrimaryContainerRepository;

@Service
public class PrimaryContainerService {
	@Autowired
	PrimaryContainerRepository primaryContainerRepository;
	
	public Iterable<PrimaryContainer> getAllPrimaryContainers(){
		return primaryContainerRepository.findAll();
	}
	
	public Optional<PrimaryContainer> getPrimaryContainerById(Integer id){
		return primaryContainerRepository.findById(id);
	}
	
	public PrimaryContainer addPrimaryContainer(PrimaryContainer primaryContainer) {
		return primaryContainerRepository.save(primaryContainer);
	}
}