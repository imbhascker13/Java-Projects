package com.mindtree.library.service;

import java.util.List;

import com.mindtree.library.dto.LibraryDto;
import com.mindtree.library.dto.UserDto;
import com.mindtree.library.serviceexception.ServiceException;

public interface UserService {

	UserDto addUser(UserDto user);

	UserDto getDetailsByUid(int userId) throws ServiceException;

}
