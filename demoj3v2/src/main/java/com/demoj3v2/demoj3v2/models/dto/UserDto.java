package com.demoj3v2.demoj3v2.models.dto;

import com.demoj3v2.demoj3v2.models.User;

public class UserDto {
    private String title;
    private User user;
    public UserDto() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    
    
}
