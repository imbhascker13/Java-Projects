package com.mindtree.library.service;

import java.util.List;

import com.mindtree.library.dto.LibraryDto;
import com.mindtree.library.dto.UserDto;
import com.mindtree.library.serviceexception.ServiceException;

public interface LibraryService {

	public LibraryDto addLibrary(LibraryDto library);

	public List<LibraryDto> getAllDetails() throws ServiceException;

	public List<LibraryDto> getLibraryByUserCount();

}
