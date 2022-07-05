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

import sprec.sprecsample.domain.FixationStabilization;
import sprec.sprecsample.service.FixationStabilizationService;

@Controller
@RequestMapping("/sprecsample/fixationStabilizations")
public class FixationStabilizationController {
	
	@Autowired
	FixationStabilizationService fixationStabilizationService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<FixationStabilization> getAllFixationStabilizations(){
		return fixationStabilizationService.getAllFixationStabilizations();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<FixationStabilization> getFixationStabilizationById(@PathVariable Integer id){
		return fixationStabilizationService.getFixationStabilizationById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody FixationStabilization addFixationStabilization(@Valid @RequestBody FixationStabilization fixationStabilization) {
		return fixationStabilizationService.addFixationStabilization(fixationStabilization);
	}

}