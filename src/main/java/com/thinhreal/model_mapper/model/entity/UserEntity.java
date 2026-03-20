package com.thinhreal.model_mapper.model.entity;

import com.thinhreal.model_mapper.model.value.Address;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Entity
@NoArgsConstructor
public class UserEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    //challenge 10 variable:
    private String secretIdentity;
    @Embedded
    private Address address;

    public UserEntity (Long id, String name, String email, String password,String secretIdentity , Address address) {
        if (id != null && id <= 0) {
            throw new IllegalArgumentException("ID must be a positive number.");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (email == null || !email.matches(emailRegex)) {
            throw new IllegalArgumentException("Invalid email format.");
        }

        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.secretIdentity = secretIdentity;

    }
}