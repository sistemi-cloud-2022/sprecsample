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

import sprec.sprecsample.domain.PreCentrifugation;
import sprec.sprecsample.service.PreCentrifugationService;

@Controller
@RequestMapping("/sprecsample/preCentrifugations")
public class PreCentrifugationController {
	
	@Autowired
	PreCentrifugationService preCentrifugationService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<PreCentrifugation> getAllPreCentrifugations(){
		return preCentrifugationService.getAllPreCentrifugations();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<PreCentrifugation> getPreCentrifugationById(@PathVariable Integer id){
		return preCentrifugationService.getPreCentrifugationById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody PreCentrifugation addPreCentrifugation(@Valid @RequestBody PreCentrifugation preCentrifugation) {
		return preCentrifugationService.addPreCentrifugation(preCentrifugation);
	}

}
