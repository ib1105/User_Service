package com.example.userservices.dto;

import com.example.userservices.vo.ResponseOrder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {

    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createAt;
    private List<ResponseOrder> orders;

    private String encryptedPwd;
}
