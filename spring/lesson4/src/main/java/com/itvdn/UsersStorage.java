package com.itvdn;

import com.itvdn.dtos.PutUserRequest;
import com.itvdn.dtos.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersStorage {
    private List<UserDto> users = new ArrayList<>();


    public void putUser(PutUserRequest putUserRequest){
        long id=(long)users.size()+1;
         users.add(new UserDto(id,
                putUserRequest.getName(),
                putUserRequest.getSurname(),
                putUserRequest.getLogin(),
                putUserRequest.getPassword(),
                putUserRequest.getEmail()));
    }

    public UserDto getUserById(int id){
        return users.get(id-1);
    }
}
