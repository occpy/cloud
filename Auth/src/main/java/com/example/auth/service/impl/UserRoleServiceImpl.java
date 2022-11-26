package com.example.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth.domain.UserRole;
import com.example.auth.service.UserRoleService;
import com.example.auth.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author 24185
* @description 针对表【user_role(用户所属角色表)】的数据库操作Service实现
* @createDate 2022-11-26 10:31:52
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




