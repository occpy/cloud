package com.example.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.auth.domain.Authority;
import com.example.auth.service.AuthorityService;
import com.example.auth.mapper.AuthorityMapper;
import org.springframework.stereotype.Service;

/**
* @author 24185
* @description 针对表【authority(权限表)】的数据库操作Service实现
* @createDate 2022-11-26 10:31:52
*/
@Service
public class AuthorityServiceImpl extends ServiceImpl<AuthorityMapper, Authority>
    implements AuthorityService{

}




