package com.yourBuddy.entity;

import com.yourBuddy.enums.UserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull (message = "First name cannot be empty")
    private String firstName;

    @NotNull (message = "Last name cannot be empty")
    private String lastName;

    @Email(message = "Invalid email")
    @NotNull (message = "Email cannot be empty")
    private String email;

    @NotNull (message = "User type cannot be empty")
    @Enumerated(EnumType.STRING)
    private UserType userType;

}
