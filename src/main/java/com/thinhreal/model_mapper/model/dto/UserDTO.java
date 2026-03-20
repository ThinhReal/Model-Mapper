package com.thinhreal.model_mapper.model.dto;

import lombok.Data;
// some field that we want to display
@Data
public class UserDTO {
    private String name;
    private String email;
    //Object + Property (auto matching) <Practice 9>
    private String addressCity;
    private String addressCountry;
    // Challenge 10 Variable:
    private String publicName;
}