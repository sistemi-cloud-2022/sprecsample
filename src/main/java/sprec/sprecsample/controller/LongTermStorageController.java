package sprec.sprecsample.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sprec.sprecsample.domain.LongTermStorage;
import sprec.sprecsample.service.LongTermStorageService;

@Controller
@RequestMapping("/sprecsample/long-term-storages")
public class LongTermStorageController {
	
	@Autowired
	LongTermStorageService longTermStorageService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<LongTermStorage> getAllLongTermStorages(){
		return longTermStorageService.getAllLongTermStorages();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<LongTermStorage> getLongTermStorageById(@PathVariable Integer id){
		return longTermStorageService.getLongTermStorageById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody LongTermStorage addLongTermStorage(@Valid @RequestBody LongTermStorage longTermStorage) {
		return longTermStorageService.addLongTermStorage(longTermStorage);
	}

}
