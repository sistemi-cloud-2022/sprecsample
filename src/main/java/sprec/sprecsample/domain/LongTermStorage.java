package sprec.sprecsample.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "long_term_storages")
public class LongTermStorage {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer id;
	
	@Size(max = 255)
	private String container;
	
	@Size(max = 255)
	private String acronym;
	
	@Size(max = 255)
	private String temp;

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public Integer getId() {
		return id;
	}
}
