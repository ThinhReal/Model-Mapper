package com.thinhreal.model_mapper.service;

import com.thinhreal.model_mapper.model.dto.UserDTO;
import com.thinhreal.model_mapper.model.entity.UserEntity;
import com.thinhreal.model_mapper.model.value.Address;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final ModelMapper modelMapper;
    //Constructure Injection
    public UserService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public UserDTO getMockUser() {
        Address address = new Address("14 Suong Nguyet Anh", "Buon Ma Thuot", "VietNam");
        UserEntity entity = new UserEntity(1L, "thinhne", "s4130401@rmit.edu.vn", "securePassword123", address);

        return modelMapper.map(entity, UserDTO.class);
    }
}