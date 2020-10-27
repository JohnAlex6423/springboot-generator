package com.generator.springbootgenerator.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void test01() throws SQLException {
        System.err.println(dataSource);
        Connection connection = dataSource.getConnection();

        System.err.println(connection);
        connection.close();

    }

    @Test
    public void test02() throws SQLException {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from s_dept");
        maps.stream().forEach(s -> {
                    System.err.println(s.get("dept_no"));
                    System.err.println(s.get("dept_name"));
                }
        );
    }
}
