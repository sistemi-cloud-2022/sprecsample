package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.CollectionType;
import sprec.sprecsample.repository.CollectionTypeRepository;

@Service
public class CollectionTypeService {
	@Autowired
	CollectionTypeRepository collectionTypeRepository;
	
	public Iterable<CollectionType> getAllCollectionTypes(){
		return collectionTypeRepository.findAll();
	}
	
	public Optional<CollectionType> getCollectionTypeById(Integer id){
		return collectionTypeRepository.findById(id);
	}
	
	public CollectionType addCollectionType(CollectionType collectionType) {
		return collectionTypeRepository.save(collectionType);
	}
}

