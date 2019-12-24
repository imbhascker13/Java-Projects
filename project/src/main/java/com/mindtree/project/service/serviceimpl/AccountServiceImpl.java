package com.mindtree.project.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.project.dto.AccountDto;
import com.mindtree.project.dto.IgDto;
import com.mindtree.project.dto.ProjectDto;
import com.mindtree.project.entity.Account;
import com.mindtree.project.entity.IG;
import com.mindtree.project.entity.Project;
import com.mindtree.project.exception.ControllerException;
import com.mindtree.project.exception.ErrorConstants;
import com.mindtree.project.exception.ServiceException;
import com.mindtree.project.repository.AccountRepository;
import com.mindtree.project.repository.IgRepository;
import com.mindtree.project.repository.ProjectRepository;
import com.mindtree.project.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	IgRepository igRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public AccountDto addAccount(AccountDto accountDto) throws ServiceException {
		Account account=modelMapper.map(accountDto, Account.class);
		Account account2=accountRepository.save(account);
		List<Project>projects=new ArrayList<Project>();
		AccountDto accountDto1=new AccountDto();
		double cp=0;
		List<ProjectDto>projectDtos=new ArrayList<ProjectDto>();
		for(ProjectDto projectDto:accountDto.getProjectDtos()) {
			 cp=cp+projectDto.getProjectCost();
			Project project=new Project();
			if(accountDto.getAccountRevenue()>cp) {
			 project=modelMapper.map(projectDto, Project.class);
			 project.setAccount(account);
			
			}
			else {
				throw new ServiceException("price exceeds");
			}
			Project newProject=projectRepository.save(project);
			projects.add(newProject);
			account.setProjects(projects);
			Account newAccount=accountRepository.save(account);
			accountDto1=modelMapper.map(newAccount, AccountDto.class);
			ProjectDto projectDto2=modelMapper.map(newProject, ProjectDto.class);
			projectDtos.add(projectDto2);
			accountDto1.setProjectDtos(projectDtos);
	}
		return accountDto1;

}
	@Override
	public AccountDto addAccountToIg(int accountId, int igId) throws ControllerException {
		Account account=accountRepository.findById(accountId).get();
		Optional<IG> ig=igRepository.findById(igId);
		try {
			ig.orElseThrow(()->new ServiceException(ErrorConstants.NOSUCHIG));
		} catch (ServiceException e) {
			throw new ControllerException(e.getMessage());
		}
		IG ig2=igRepository.save(ig.get());
		account.setIg(ig2);
		Account account2=accountRepository.save(account);
		AccountDto accountDto=modelMapper.map(account2, AccountDto.class);
		IgDto igDto=modelMapper.map(ig2, IgDto.class);
		accountDto.setIgDto(igDto);
		return accountDto;
	}}
