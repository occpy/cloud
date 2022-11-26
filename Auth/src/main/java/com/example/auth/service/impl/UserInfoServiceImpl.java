package com.example.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth.domain.UserInfo;
import com.example.auth.service.UserInfoService;
import com.example.auth.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 24185
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2022-11-26 10:31:52
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




