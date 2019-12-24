package com.mindtree.project.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL)
public class IgDto {
	private int igId;
	private String igName;
	private List<AccountDto>accountDtos;
	public IgDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IgDto(int igId, String igName, List<AccountDto> accountDtos) {
		super();
		this.igId = igId;
		this.igName = igName;
		this.accountDtos = accountDtos;
	}
	public int getIgId() {
		return igId;
	}
	public void setIgId(int igId) {
		this.igId = igId;
	}
	public String getIgName() {
		return igName;
	}
	public void setIgName(String igName) {
		this.igName = igName;
	}
	public List<AccountDto> getAccountDtos() {
		return accountDtos;
	}
	public void setAccountDtos(List<AccountDto> accountDtos) {
		this.accountDtos = accountDtos;
	}
	@Override
	public String toString() {
		return "IgDto [igId=" + igId + ", igName=" + igName + ", accountDtos=" + accountDtos + "]";
	}
	
}
