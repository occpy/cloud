package com.example.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth.domain.UserInfoDefault;
import com.example.auth.service.UserInfoDefaultService;
import com.example.auth.mapper.UserInfoDefaultMapper;
import org.springframework.stereotype.Service;

/**
* @author 24185
* @description 针对表【user_info_default】的数据库操作Service实现
* @createDate 2022-11-26 10:31:52
*/
@Service
public class UserInfoDefaultServiceImpl extends ServiceImpl<UserInfoDefaultMapper, UserInfoDefault>
    implements UserInfoDefaultService{

}




