package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.User;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {


    @Select("select * from user where openid = #{openid}")
    User getByOpenId(String openid);

    @AutoFill(value = OperationType.INSERT)
    void insert(User user);
}
