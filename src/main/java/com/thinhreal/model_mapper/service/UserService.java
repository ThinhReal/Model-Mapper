package com.thinhreal.model_mapper.service;

import com.thinhreal.model_mapper.model.dto.UserDTO;
import com.thinhreal.model_mapper.model.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ModelMapper modelMapper;
    //Constructure Injection
    public UserService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    // BUSINESS logic: lấy ra thông tin của user mà ko lấy mật khẩu
    // Lấy qua DTO - config những data đã mình muốn nó hiện ra.
    public UserDTO getMockUser() {

        UserEntity entity = new UserEntity(1L, "Nguyen Van Thinh", "s4130401@rmit.edu.vn", "securePassword123");

        return modelMapper.map(entity, UserDTO.class);
    }
}