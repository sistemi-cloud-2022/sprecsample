package sprec.sprecsample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sprec.sprecsample.domain.PostCentrifugation;
import sprec.sprecsample.repository.PostCentrifugationRepository;

@Service
public class PostCentrifugationService {
	@Autowired
	PostCentrifugationRepository postCentrifugationRepository;
	
	public Iterable<PostCentrifugation> getAllPostCentrifugations(){
		return postCentrifugationRepository.findAll();
	}
	
	public Optional<PostCentrifugation> getPostCentrifugationById(Integer id){
		return postCentrifugationRepository.findById(id);
	}
	
	public PostCentrifugation addPostCentrifugation(PostCentrifugation postCentrifugation) {
		return postCentrifugationRepository.save(postCentrifugation);
	}
}
