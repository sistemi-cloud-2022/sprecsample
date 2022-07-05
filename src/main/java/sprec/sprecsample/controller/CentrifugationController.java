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

import sprec.sprecsample.domain.Centrifugation;
import sprec.sprecsample.service.CentrifugationService;

@Controller
@RequestMapping("/sprecsample/centrifugations")
public class CentrifugationController {
	
	@Autowired
	CentrifugationService centrifugationService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<Centrifugation> getAllCentrifugations(){
		return centrifugationService.getAllCentrifugations();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<Centrifugation> getCentrifugationById(@PathVariable Integer id){
		return centrifugationService.getCentrifugationById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody Centrifugation addCentrifugation(@Valid @RequestBody Centrifugation centrifugation) {
		return centrifugationService.addCentrifugation(centrifugation);
	}

}

