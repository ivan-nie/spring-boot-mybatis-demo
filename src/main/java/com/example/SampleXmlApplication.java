package com.example;

import com.example.dao.CityDao;
import com.example.domain.City;
import com.example.mapper.HotelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ivann on 2017/3/8.
 */

@SpringBootApplication
public class SampleXmlApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SampleXmlApplication.class, args);
    }

    private final CityDao cityDao;

    private final HotelMapper hotelMapper;

    public SampleXmlApplication(CityDao cityDao, HotelMapper hotelMapper) {
        this.cityDao = cityDao;
        this.hotelMapper = hotelMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityDao.selectCityById(1));
        System.out.println(this.hotelMapper.selectByCityId(1));
    }

}
