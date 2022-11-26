package com.example.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth.domain.User;
import com.example.auth.service.UserService;
import com.example.auth.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 24185
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2022-11-26 10:31:52
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




