package com.example.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth.domain.RoleAuthority;
import com.example.auth.service.RoleAuthorityService;
import com.example.auth.mapper.RoleAuthorityMapper;
import org.springframework.stereotype.Service;

/**
* @author 24185
* @description 针对表【role_authority(角色所属权限表)】的数据库操作Service实现
* @createDate 2022-11-26 10:31:52
*/
@Service
public class RoleAuthorityServiceImpl extends ServiceImpl<RoleAuthorityMapper, RoleAuthority>
    implements RoleAuthorityService{

}




