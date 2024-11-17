package com.loginsystem.mapper;

import com.loginsystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findUserByPassword(@Param("username") String username,
                            @Param("password") String password);
}
