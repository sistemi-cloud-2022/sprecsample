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

import sprec.sprecsample.domain.WarmIschemia;
import sprec.sprecsample.service.WarmIschemiaService;

@Controller
@RequestMapping("/sprecsample/warm-ischemias")
public class WarmIschemiaController {
	
	@Autowired
	WarmIschemiaService warmIschemiaService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<WarmIschemia> getAllWarmIschemias(){
		return warmIschemiaService.getAllWarmIschemias();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<WarmIschemia> getWarmIschemiaById(@PathVariable Integer id){
		return warmIschemiaService.getWarmIschemiaById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody WarmIschemia addWarmIschemia(@Valid @RequestBody WarmIschemia warmIschemia) {
		return warmIschemiaService.addWarmIschemia(warmIschemia);
	}

}
