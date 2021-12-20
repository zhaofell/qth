package com.example.qth.mapper;

import com.example.qth.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
@Mapper
public interface UserMapper {
    int save(User user);
    int update(@Param("email") String email, @Param("lastLoginTime") LocalDateTime lastLoginTime);
    User findByEmailAndPassword(@Param("email")String email, @Param("password") String password);
    String findEmail(@Param("email") String email);
}
// @Param没有办法去传递多个参数。所以需要使用@Param注解给方法参数命名，
// 然后在xml文件的该dao层方法对应的sql语句中就可以正常使用@Param注解的参数名。