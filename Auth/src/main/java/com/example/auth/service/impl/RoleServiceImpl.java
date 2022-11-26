package com.example.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth.domain.Role;
import com.example.auth.service.RoleService;
import com.example.auth.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author 24185
* @description 针对表【role(角色表)】的数据库操作Service实现
* @createDate 2022-11-26 10:31:52
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




