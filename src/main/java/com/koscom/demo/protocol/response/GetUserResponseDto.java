package com.koscom.demo.protocol.response;

import lombok.Value;

@Value
public class GetUserResponseDto {
    String userId;
    String userName;
    String userType;
    String userStat;
}
