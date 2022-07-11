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

import sprec.sprecsample.domain.PostCentrifugation;
import sprec.sprecsample.service.PostCentrifugationService;

@Controller
@RequestMapping("/sprecsample/post-centrifugations")
public class PostCentrifugationController {
	
	@Autowired
	PostCentrifugationService postCentrifugationService;
	
	@GetMapping("/")
	public @ResponseBody Iterable<PostCentrifugation> getAllPostCentrifugations(){
		return postCentrifugationService.getAllPostCentrifugations();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Optional<PostCentrifugation> getPostCentrifugationById(@PathVariable Integer id){
		return postCentrifugationService.getPostCentrifugationById(id);
	}
	
	@PostMapping("/")
	public @ResponseBody PostCentrifugation addPostCentrifugation(@Valid @RequestBody PostCentrifugation postCentrifugation) {
		return postCentrifugationService.addPostCentrifugation(postCentrifugation);
	}

}
