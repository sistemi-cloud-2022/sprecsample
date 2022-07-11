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

import sprec.sprecsample.domain.FixationTime;
import sprec.sprecsample.service.FixationTimeService;

@Controller
@RequestMapping("/sprecsample/fixation-times")
public class FixationTimeController {
	
	@Autowired
	FixationTimeService fixationTimeService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<FixationTime> getAllFixationTimes(){
		return fixationTimeService.getAllFixationTimes();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<FixationTime> getFixationTimeById(@PathVariable Integer id){
		return fixationTimeService.getFixationTimeById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody FixationTime addFixationTime(@Valid @RequestBody FixationTime fixationTime) {
		return fixationTimeService.addFixationTime(fixationTime);
	}

}
