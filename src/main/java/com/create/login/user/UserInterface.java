package com.create.login.user;

import com.create.login.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface UserInterface {
    List<User> getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User theUser, String verificationToken);
}
