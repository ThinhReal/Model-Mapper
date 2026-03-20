package com.thinhreal.model_mapper.config;

import com.thinhreal.model_mapper.model.dto.UserDTO;
import com.thinhreal.model_mapper.model.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        // Custom modelMapper:
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD);

        // Guide ModelMapper: when see UserEntity map sang UserDTO using property "typeMap"
        // Thì hãy lấy 'secretIdentity' bỏ vào 'publicName'
        modelMapper.typeMap(UserEntity.class, UserDTO.class).addMappings(mapper -> {
            mapper.map(UserEntity::getSecretIdentity, UserDTO::setPublicName);
        });
        return modelMapper;
    }
}