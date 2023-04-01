package com.example.aoop2.mobileZoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //gives back data
@RequestMapping("/zoo")
public class ZooController {
    @GetMapping("/test")
    public String test(){
        Animal dog = new Animal("canis", "szarik", true);
        return dog.toString();
    }

    @GetMapping("/test2")
    public String test2(){
        return "pozdro 600";
    }

//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    @GetMapping("/test3")
//    public String test3(){
//        String sql = "INSERT INTO student (name,email) VALUES ('nanna','nan@gmail.com')";
//
//        int rows = jdbcTemplate.update(sql);
//
////        List<String> names = jdbcTemplate.queryForList("SELECT name FROM student", String.class);
//
//        List<Student> students = jdbcTemplate.query("SELECT * FROM student",new BeanPropertyRowMapper<>(Student.class));
//
//        return students.toString();
//    }
}
