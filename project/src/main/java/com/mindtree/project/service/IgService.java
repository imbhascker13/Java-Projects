package com.mindtree.project.service;

import com.mindtree.project.dto.IgDto;

public interface IgService {

	public IgDto addIg(IgDto igDto);

	public IgDto getAllAccountsByIgId(int igId);

}
