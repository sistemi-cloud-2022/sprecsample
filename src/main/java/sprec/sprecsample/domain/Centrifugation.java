package sprec.sprecsample.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "centrifugations")
public class Centrifugation {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer id;
	
	@Size(max = 255)
	private String temp;
	
	@Size(max = 255)
	private String acronym;
	
	@Size(max = 255)
	private String delay;
	
	@Size(max = 255)
	private String speed;
	
	@Size(max = 255)
	private String braking;

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

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getBraking() {
		return braking;
	}

	public void setBraking(String braking) {
		this.braking = braking;
	}

	public Integer getId() {
		return id;
	}
	
}
