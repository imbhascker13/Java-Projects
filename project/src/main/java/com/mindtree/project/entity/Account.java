package com.mindtree.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private String accountName;
	private double accountRevenue;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "account")
	private List<Project>projects;
	@ManyToOne
	private IG ig;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountId, String accountName, double accountRevenue, List<Project> projects, IG ig) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountRevenue = accountRevenue;
		this.projects = projects;
		this.ig = ig;
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
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public IG getIg() {
		return ig;
	}
	public void setIg(IG ig) {
		this.ig = ig;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", accountRevenue=" + accountRevenue
				+ ", projects=" + projects + ", ig=" + ig + "]";
	}
	
	
}
