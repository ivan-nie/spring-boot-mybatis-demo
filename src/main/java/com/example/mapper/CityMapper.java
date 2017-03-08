package com.example.mapper;

import com.example.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ivann on 2017/3/8.
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where state = #{state}")
    City findByState(@Param("state") String state);

}
