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

import sprec.sprecsample.domain.SprecSample;
import sprec.sprecsample.service.SprecSampleService;

@Controller
@RequestMapping("/sprecsample/sprecSamples")
public class SprecSampleController {
	
	@Autowired
	SprecSampleService sprecSampleService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<SprecSample> getAllSprecSamples(){
		return sprecSampleService.getAllSprecSamples();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<SprecSample> getSprecSampleById(@PathVariable Integer id){
		return sprecSampleService.getSprecSampleById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody SprecSample addSprecSample(@Valid @RequestBody SprecSample sprecSample) {
		return sprecSampleService.addSprecSample(sprecSample);
	}

}
