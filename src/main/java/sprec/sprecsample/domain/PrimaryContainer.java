package sprec.sprecsample.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "primary_containers")
public class PrimaryContainer {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer id;
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Size(max = 255)
	private String denomination;
	
	@Size(max = 255)
	private String acronym;

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public Integer getId() {
		return id;
	}
	
}
