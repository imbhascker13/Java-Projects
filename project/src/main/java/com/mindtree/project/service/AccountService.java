package com.mindtree.project.service;

import com.mindtree.project.dto.AccountDto;
import com.mindtree.project.exception.ControllerException;
import com.mindtree.project.exception.ServiceException;

public interface AccountService {

	public AccountDto addAccount(AccountDto accountDto) throws ServiceException;

	public AccountDto addAccountToIg(int accountId, int igId) throws ControllerException;

}
