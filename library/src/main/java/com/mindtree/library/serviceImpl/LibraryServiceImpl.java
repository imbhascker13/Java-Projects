package com.mindtree.library.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.library.dto.LibraryDto;
import com.mindtree.library.entity.Library;
import com.mindtree.library.entity.User;
import com.mindtree.library.repository.LibraryRepository;
import com.mindtree.library.service.LibraryService;
import com.mindtree.library.serviceexception.ErrorConstants;
import com.mindtree.library.serviceexception.ServiceException;

@Service
public class LibraryServiceImpl implements LibraryService {
	@Autowired
	LibraryRepository libraryRepository;
	@Autowired
	LibraryServiceImpl libraryServiceImpl;
	ModelMapper modelMapper = new ModelMapper();

	@Override
	public LibraryDto addLibrary(LibraryDto library) {
		Library library1 = convertDtoToEntity(library);
		List<User> users = library1.getUsers();

		users.forEach(user -> {
			List<Library> libraries = user.getLibraries();
			if (libraries == null) {
				libraries = new ArrayList<>();
			}
			libraries.add(library1);
			user.setLibraries(libraries);
		});
		Library library2 = libraryRepository.save(library1);
		LibraryDto libraryDto = convertEntityToDto(library2);
		return libraryDto;
	}

	private LibraryDto convertEntityToDto(Library library2) {
		return modelMapper.map(library2, LibraryDto.class);

	}

	private Library convertDtoToEntity(LibraryDto library) {

		return modelMapper.map(library, Library.class);
	}

	@Override
	public List<LibraryDto> getAllDetails() throws ServiceException {
		List<Library> library = null;
		try {
			library = libraryRepository.findAll();
		} catch (Exception e) {
			throw new ServiceException(ErrorConstants.NOSUCHLIBRARY);
		}
		return library.stream().map(e -> convertEntityToDto(e)).collect(Collectors.toList());
	}

	@Override
	public List<LibraryDto> getLibraryByUserCount() {
		List<Library> libraries = libraryRepository.findAll();
		List<Library> newLibraries = new ArrayList<Library>();
		newLibraries = libraries.stream().filter(e -> e.getUsers().size() > 0).collect(Collectors.toList());
		return newLibraries.stream().map(e -> convertEntityToDto(e)).collect(Collectors.toList());
	}

}
