package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.beans.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//继承通用Mapper,所有的单表的CRUD都可以直接使用
public interface UmsMemberMapper extends Mapper<UmsMember> {
    List<UmsMember> getAllUser();
}
