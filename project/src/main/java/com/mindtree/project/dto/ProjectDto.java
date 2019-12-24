package com.mindtree.project.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ProjectDto {
	private int projectId;
	private String projectName;
	private double projectCost;
	private AccountDto accountDto;
	public ProjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjectDto(int projectId, String projectName, double projectCost, AccountDto accountDto) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
		this.accountDto = accountDto;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public double getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}
	public AccountDto getAccountDto() {
		return accountDto;
	}
	public void setAccountDto(AccountDto accountDto) {
		this.accountDto = accountDto;
	}
	@Override
	public String toString() {
		return "ProjectDto [projectId=" + projectId + ", projectName=" + projectName + ", projectCost=" + projectCost
				+ ", accountDto=" + accountDto + "]";
	}
	
}
