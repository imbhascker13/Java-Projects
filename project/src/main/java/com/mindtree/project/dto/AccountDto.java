package com.mindtree.project.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class AccountDto implements Comparable<AccountDto>{
	private int accountId;
	private String accountName;
	private double accountRevenue;
	private List<ProjectDto>projectDtos;
	private IgDto igDto;
	public AccountDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountDto(int accountId, String accountName, double accountRevenue, List<ProjectDto> projectDtos,
			IgDto igDto) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountRevenue = accountRevenue;
		this.projectDtos = projectDtos;
		this.igDto = igDto;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getAccountRevenue() {
		return accountRevenue;
	}
	public void setAccountRevenue(double accountRevenue) {
		this.accountRevenue = accountRevenue;
	}
	public List<ProjectDto> getProjectDtos() {
		return projectDtos;
	}
	public void setProjectDtos(List<ProjectDto> projectDtos) {
		this.projectDtos = projectDtos;
	}
	public IgDto getIgDto() {
		return igDto;
	}
	public void setIgDto(IgDto igDto) {
		this.igDto = igDto;
	}
	@Override
	public String toString() {
		return "AccountDto [accountId=" + accountId + ", accountName=" + accountName + ", accountRevenue="
				+ accountRevenue + ", projectDtos=" + projectDtos + ", igDto=" + igDto + "]";
	}
	@Override
	public int compareTo(AccountDto ac) {
		
		int flag=(int) (ac.getAccountRevenue()-this.getAccountRevenue());
		if(flag==0) {
			return this.getAccountName().compareToIgnoreCase(ac.getAccountName());
		}
		return flag;
	}
	
}
