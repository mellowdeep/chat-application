package org.chatapp.models;

import org.chatapp.validations.IsPasswordsMatching;
import org.chatapp.validations.IsUserExist;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@IsPasswordsMatching
@IsUserExist
public class UserBindingModel {

    @NotNull
    private String username;
    @NotNull
    @Pattern(regexp = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+")
    private String email;
    @NotNull
    private String password;
    private String confirmPassword;
    private String image;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
