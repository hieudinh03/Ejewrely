package com.project.ejewelry.services;

import com.project.ejewelry.dtos.UserDTO;
import com.project.ejewelry.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password) throws Exception;
}
