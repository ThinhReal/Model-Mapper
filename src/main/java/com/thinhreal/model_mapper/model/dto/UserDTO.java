package com.thinhreal.model_mapper.model.dto;

import lombok.Data;
// some field that we want to display
@Data
public class UserDTO {
    private String name;
    private String email;
    //
    private String addressCity;
    private String addressCountry;
}