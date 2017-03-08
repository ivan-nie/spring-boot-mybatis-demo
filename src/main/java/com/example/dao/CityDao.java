package com.example.dao;

import com.example.domain.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * Created by ivann on 2017/3/8.
 */
@Component
public class CityDao {

    private final SqlSession sqlSession;

    public CityDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public City selectCityById(long id) {
        return this.sqlSession.selectOne("selectCityById", id);
    }

}