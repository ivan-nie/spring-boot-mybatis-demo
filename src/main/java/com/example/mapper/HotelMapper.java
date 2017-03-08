package com.example.mapper;

import com.example.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ivann on 2017/3/8.
 */
@Mapper
public interface HotelMapper {

    Hotel selectByCityId(int city_id);

}
