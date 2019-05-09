package com.aew.users.messages.request;

import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Define the request payloads that the APIs will use for singup a user.
 */
@Getter
@Setter
public class SignUpForm {

    @NotBlank
    @Size(min = 3, max = 50)
    private String name;

    @NotBlank
    @Size(max = 60)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

}