package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.LongTermStorage;
import sprec.sprecsample.repository.LongTermStorageRepository;

@Service
public class LongTermStorageService {
	@Autowired
	LongTermStorageRepository longTermStorageRepository;
	
	public Iterable<LongTermStorage> getAllLongTermStorages(){
		return longTermStorageRepository.findAll();
	}
	
	public Optional<LongTermStorage> getLongTermStorageById(Integer id){
		return longTermStorageRepository.findById(id);
	}
	
	public LongTermStorage addLongTermStorage(LongTermStorage longTermStorage) {
		return longTermStorageRepository.save(longTermStorage);
	}
}
