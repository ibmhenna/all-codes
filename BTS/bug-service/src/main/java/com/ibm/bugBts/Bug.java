package com.ibm.bugBts;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Bug {

	@Id
	private String id;

	@NotNull
	@NotBlank
	private String name;
	@NotNull
	@NotBlank
	private String projectId;
	@NotNull
	@NotBlank
	private String module;
	@NotNull
	@NotBlank
	private String buildVersion;
	@NotNull
	@NotBlank
	private String synopsis;
	@NotNull
	@NotBlank
	private String product;
	private Date submittedOn;
	private PRIORITY priority;
	private STATUS status;
	private SEVERITY severity;
	private TYPE type;
	@NotNull
	@NotBlank
//	@Size(min = 5, max = 1000)
	private String description;
	@NotNull
	private Date eta;

	
	

	public Date getEta() {
		return eta;
	}

	public void setEta(Date eta) {
		
		if(eta.compareTo(new Date())<0) {
			throw new IllegalArgumentException("ETA date should be a future date");
		}
		this.eta = eta;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public PRIORITY getPriority() {
		return priority;
	}

	public void setPriority(PRIORITY priority) {
		this.priority = priority;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getDescription() {
		return description.trim();
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Date getSubmittedOn() {
		return submittedOn;
	}

	public void setSubmittedOn(Date submittedOn) {
		this.submittedOn = submittedOn;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

}
