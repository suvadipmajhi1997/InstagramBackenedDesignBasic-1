package com.geekster.Instagram.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInInput {

    @Email
    String email;
    @Size(min = 8, max = 20, message = "Password length must be between 8 and 20 characters")   // The @Pattern annotation specifies that the password must contain at least one digit, one lowercase letter, one uppercase letter, and one special character (i.e., one of @#$%^&+=!).
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).*$", message = "Password must contain at least one digit, one lowercase, one uppercase letter and one special character")
    String password;
}

