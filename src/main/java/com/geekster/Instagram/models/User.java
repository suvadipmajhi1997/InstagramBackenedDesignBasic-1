package com.geekster.Instagram.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable = false)
    @NotEmpty
    private String firstName;
    @Column(nullable = false)
    @NotEmpty
    private String lastName;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    @NotBlank(message = "Email is mandatory")
    @Email
    private String email;
    @Column(nullable = false)

    private String password;
    @Pattern(regexp = "\\d{2}-\\d{10}", message = "Phone number should be in the format XX-XXXXXXXXXX")
    private String phoneNumber;


    public User(String firstName, String lastName, Integer age, String email, String password, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }
}