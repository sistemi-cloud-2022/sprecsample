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

import sprec.sprecsample.domain.PrimaryContainer;
import sprec.sprecsample.service.PrimaryContainerService;

@Controller
@RequestMapping("/sprecsample/primary-containers")
public class PrimaryContainerController {
	
	@Autowired
	PrimaryContainerService primaryContainerService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<PrimaryContainer> getAllPrimaryContainers(){
		return primaryContainerService.getAllPrimaryContainers();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<PrimaryContainer> getPrimaryContainerById(@PathVariable Integer id){
		return primaryContainerService.getPrimaryContainerById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody PrimaryContainer addPrimaryContainer(@Valid @RequestBody PrimaryContainer primaryContainer) {
		return primaryContainerService.addPrimaryContainer(primaryContainer);
	}

}
