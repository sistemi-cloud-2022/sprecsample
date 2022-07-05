package sprec.sprecsample.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "post_centrifugations")
public class PostCentrifugation {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer id;
	
	@Size(max = 255)
	private String temp;
	
	@Size(max = 255)
	private String acronym;
	
	@Size(max = 255)
	private String delay;

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;	
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getDelay() {
		return delay;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public Integer getId() {
		return id;
	}
	
	
}
