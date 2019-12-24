package com.mindtree.project.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.project.dto.AccountDto;
import com.mindtree.project.dto.IgDto;
import com.mindtree.project.entity.Account;
import com.mindtree.project.entity.IG;
import com.mindtree.project.repository.IgRepository;
import com.mindtree.project.service.IgService;

@Service
public class IgServiceImpl implements IgService{
	@Autowired
	IgRepository igRepository;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public IgDto addIg(IgDto igDto) {
		IG ig=modelMapper.map(igDto, IG.class);
		IG ig1=igRepository.save(ig);
		IgDto igDto2=modelMapper.map(ig1, IgDto.class);
		return igDto2;
	}
	@Override
	public IgDto getAllAccountsByIgId(int igId) {
		IG ig=igRepository.findById(igId).get();
		List<AccountDto>accountDtos=new ArrayList<AccountDto>();
		IgDto igDto=new IgDto();
		
		for(Account account:ig.getAccounts()) {
			AccountDto accountDto=modelMapper.map(account, AccountDto.class);
			accountDtos.add(accountDto);
			Collections.sort(accountDtos);
			igDto.setAccountDtos(accountDtos);
		}
		igDto.setIgId(igId);
		return igDto;
	}

}
