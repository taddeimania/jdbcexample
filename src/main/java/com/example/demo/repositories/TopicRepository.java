package com.example.demo.repositories;

import com.example.demo.interfaces.ITopicRepository;
import com.example.demo.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Joel Taddei on 7/31/2017.
 */
@Repository
public class TopicRepository implements ITopicRepository{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private String INSERT_SQL = "INSERT INTO topic (title, description) VALUES (?, ?)";
    @Override
    public void add(String title, String description) {
        jdbcTemplate.update(INSERT_SQL, title, description);
    }

    public static class TopicMapper implements RowMapper<Topic> {
        public Topic mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Topic(rs.getInt("id"), rs.getString("title"), rs.getString("description"));
        }
    }
}
