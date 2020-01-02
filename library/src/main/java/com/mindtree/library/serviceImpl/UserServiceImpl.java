package com.mindtree.library.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.library.dto.LibraryDto;
import com.mindtree.library.dto.UserDto;
import com.mindtree.library.entity.Library;
import com.mindtree.library.entity.User;
import com.mindtree.library.repository.UserRepository;
import com.mindtree.library.service.UserService;
import com.mindtree.library.serviceexception.ErrorConstants;
import com.mindtree.library.serviceexception.ServiceException;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserServiceImpl userServiceImpl;
	ModelMapper modelMapper=new ModelMapper();
	@Override
	public UserDto addUser(UserDto user) {
		User user1=convertDtoToEntity(user);
		User user2=userRepository.save(user1);
		UserDto userDto=convertEntityToDto(user2);
		return userDto;
	}
	private UserDto convertEntityToDto(User user2) {
		return modelMapper.map(user2, UserDto.class);
	}
	private User convertDtoToEntity(UserDto user) {
	
		return modelMapper.map(user,User.class);
	}
	@Override
	public UserDto getDetailsByUid(int userId) throws ServiceException {
			
		Optional<User> user=userRepository.findById(userId);
		user.orElseThrow(()-> new ServiceException(ErrorConstants.NOSUCHLIBRARY));
		return convertEntityToDto(user.get());
		
	}
	private LibraryDto convertEntityToDto(Library e) {
		return modelMapper.map(e, LibraryDto.class);
	}


}
