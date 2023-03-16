package com.koscom.demo.service;

import java.util.List;

import com.koscom.demo.protocol.domain.User;
import com.koscom.demo.protocol.response.GetUserResponseDto;

public interface TestService {
    List<GetUserResponseDto> getUser();    
    GetUserResponseDto getOneUser(String userId);
    void addUser(User user);
    void deleteUser(String userId);
    void updateUser(User user);
}
