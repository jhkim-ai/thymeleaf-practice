package com.koscom.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koscom.demo.protocol.domain.User;
import com.koscom.demo.protocol.response.GetUserResponseDto;

@Mapper
public interface TestDao {
    List<GetUserResponseDto> getUser();
    GetUserResponseDto getOneUser(String userId);
    void addUser(User user);
    void deleteUser(String userId);
    void updateUser(User user);
}
