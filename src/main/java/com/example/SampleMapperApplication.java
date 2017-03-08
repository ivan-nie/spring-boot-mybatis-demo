package com.example;

import com.example.mapper.CityMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ivann on 2017/3/8.
 */
@SpringBootApplication
public class SampleMapperApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SampleMapperApplication.class, args);
    }

    final private CityMapper cityMapper;

    public SampleMapperApplication(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.cityMapper.findByState("CA"));
    }
}
