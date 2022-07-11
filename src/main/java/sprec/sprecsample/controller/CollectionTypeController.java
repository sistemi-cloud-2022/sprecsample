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

import sprec.sprecsample.domain.CollectionType;
import sprec.sprecsample.service.CollectionTypeService;

@Controller
@RequestMapping("/sprecsample/collection-types")
public class CollectionTypeController {
	
	@Autowired
	CollectionTypeService collectionTypeService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<CollectionType> getAllCollectionTypes(){
		return collectionTypeService.getAllCollectionTypes();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<CollectionType> getCollectionTypeById(@PathVariable Integer id){
		return collectionTypeService.getCollectionTypeById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody CollectionType addCollectionType(@Valid @RequestBody CollectionType collectionType) {
		return collectionTypeService.addCollectionType(collectionType);
	}

}
