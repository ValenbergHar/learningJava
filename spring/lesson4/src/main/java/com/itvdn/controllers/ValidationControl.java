package com.itvdn.controllers;

import com.itvdn.UsersStorage;
import com.itvdn.dtos.PutUserRequest;
import com.itvdn.dtos.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class ValidationControl {

    private UsersStorage usersStorage;

    public ValidationControl(UsersStorage usersStorage) {
        this.usersStorage = usersStorage;
    }

    @RequestMapping(path = "/getUser", method = RequestMethod.GET)
    public UserDto getUserById(@RequestParam(value = "id") int id) {
        return usersStorage.getUserById(id);
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public ResponseEntity putUser(@Validated @RequestBody PutUserRequest putUserRequest) {
        usersStorage.putUser(putUserRequest);
        return new ResponseEntity(HttpStatus.OK);
    }
}
