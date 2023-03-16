package com.koscom.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koscom.demo.dao.TestDao;
import com.koscom.demo.protocol.domain.User;
import com.koscom.demo.protocol.response.GetUserResponseDto;
import com.koscom.demo.service.TestService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    
    private final TestDao testDao;

    @Override
    public List<GetUserResponseDto> getUser() {
        return testDao.getUser();
    }

    @Override
    public void addUser(User user) {
        List<GetUserResponseDto> userList = this.getUser();
        Integer newIdx = Integer.parseInt(userList.get(userList.size() - 1).getUserId()) + 1;
        
        user.setUserId(newIdx.toString());
        user.setUserStat("대기중");

        testDao.addUser(user);
    }

    @Override
    public void deleteUser(String userId) {
        testDao.deleteUser(userId);
    }

    @Override
    public GetUserResponseDto getOneUser(String userId) {
        return testDao.getOneUser(userId);
    }

    @Override
    public void updateUser(User user) {
        testDao.updateUser(user);
    }
    

}
