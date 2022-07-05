package sprec.sprecsample.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sprec_samples")
public class SprecSample {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	Integer id;
	
	@NotNull
	private Integer sampleId;
	
	@NotNull
	@Size(max = 255)
	private String sprec;
	
	private Integer sampleType;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	private Date deletedAt;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="collection_type", referencedColumnName="id")
	private CollectionType collectionType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="primary_container", referencedColumnName="id")
	private PrimaryContainer primaryContainer;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="pre_centrifugation", referencedColumnName="id")
	private PreCentrifugation preCentrifugation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="post_centrifugation", referencedColumnName="id")
	private PostCentrifugation postCentrifugation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="centrifugation", referencedColumnName="id")
	private Centrifugation centrifugation;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="second_centrifugation", referencedColumnName="id")
	private Centrifugation secondCentrifugation;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="long_term_storage", referencedColumnName="id")
	private LongTermStorage LongTermStorage;
	
	//warmIschemia e coldIschemia dovrebbero essere ridondanti, entrambe si riferiscono a warmIschemia
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="warm_ischemia", referencedColumnName="id")
	private WarmIschemia warmIschemia;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cold_ischemia", referencedColumnName="id")
	private WarmIschemia coldIschemia;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fixation_type", referencedColumnName="id")
	private FixationStabilization fixationType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fixation_time", referencedColumnName="id")
	private FixationTime fixationTime;

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	//sistemare
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public String getSprec() {
		return sprec;
	}

	public void setSprec(String sprec) {
		this.sprec = sprec;
	}

	public Integer getSampleId() {
		return sampleId;
	}

	public void setSampleId(Integer sampleId) {
		this.sampleId = sampleId;
	}

	public Integer getSampleType() {
		return sampleType;
	}

	public void setSampleType(Integer sampleType) {
		this.sampleType = sampleType;
	}

	public CollectionType getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(CollectionType collectionType) {
		this.collectionType = collectionType;
	}

	public PrimaryContainer getPrimaryContainer() {
		return primaryContainer;
	}

	public void setPrimaryContainer(PrimaryContainer primaryContainer) {
		this.primaryContainer = primaryContainer;
	}

	public PreCentrifugation getPreCentrifugation() {
		return preCentrifugation;
	}

	public void setPreCentrifugation(PreCentrifugation preCentrifugation) {
		this.preCentrifugation = preCentrifugation;
	}

	public PostCentrifugation getPostCentrifugation() {
		return postCentrifugation;
	}

	public void setPostCentrifugation(PostCentrifugation postCentrifugation) {
		this.postCentrifugation = postCentrifugation;
	}

	public Centrifugation getCentrifugation() {
		return centrifugation;
	}

	public void setCentrifugation(Centrifugation centrifugation) {
		this.centrifugation = centrifugation;
	}

	public Centrifugation getSecondCentrifugation() {
		return secondCentrifugation;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setSecondCentrifugation(Centrifugation secondCentrifugation) {
		this.secondCentrifugation = secondCentrifugation;
	}

	public LongTermStorage getLongTermStorage() {
		return LongTermStorage;
	}

	public void setLongTermStorage(LongTermStorage longTermStorage) {
		LongTermStorage = longTermStorage;
	}

	public WarmIschemia getWarmIschemia() {
		return warmIschemia;
	}

	public void setWarmIschemia(WarmIschemia warmIschemia) {
		this.warmIschemia = warmIschemia;
	}

	public WarmIschemia getColdIschemia() {
		return coldIschemia;
	}

	public void setColdIschemia(WarmIschemia coldIschemia) {
		this.coldIschemia = coldIschemia;
	}

	public FixationStabilization getFixationType() {
		return fixationType;
	}

	public void setFixationType(FixationStabilization fixationType) {
		this.fixationType = fixationType;
	}

	public FixationTime getFixationTime() {
		return fixationTime;
	}

	public void setFixationTime(FixationTime fixationTime) {
		this.fixationTime = fixationTime;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
}
