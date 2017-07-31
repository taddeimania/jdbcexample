package com.example.demo.controllers;

import com.example.demo.models.Topic;
import com.example.demo.repositories.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Joel Taddei on 7/30/2017.
 */
@Controller
public class TopicController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    TopicRepository repo;

    @RequestMapping("/")
    public String index(Model model)  {
        List<Topic> topics = jdbcTemplate.query("SELECT * from topic", new TopicRepository.TopicMapper());
        model.addAttribute("model", model);
        return "index";
    }

    @RequestMapping(value = "/createTopic", method = RequestMethod.POST)
    public String createTopic(@RequestParam("title") String title, @RequestParam("description") String description) {
        repo.add(title, description);
        return "redirect:/";
    }
}
