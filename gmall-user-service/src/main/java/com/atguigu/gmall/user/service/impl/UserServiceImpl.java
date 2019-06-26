package com.atguigu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import com.atguigu.gmall.beans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public  class UserServiceImpl implements UserService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllUser() {
        //umsMemberMapper.selectAll()通用mapper中的方法
        List<UmsMember> allUser = umsMemberMapper.selectAll(); //umsMemberMapper.getAllUser();

        return allUser;
    }

    @Override
    public UmsMember getUserById(String uid) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(uid);
        UmsMember umsMember1 = umsMemberMapper.selectOne(umsMember);
        return umsMember1;
    }

}
