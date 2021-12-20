package com.example.qth.mapper;

import com.example.qth.domain.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;
@Mapper
public interface LogMapper {
    int save(Log log);
    List<Log> findByUserEmail(@Param("email") String email);

}
