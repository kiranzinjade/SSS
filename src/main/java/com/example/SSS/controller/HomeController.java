package com.example.SSS.controller;


import com.example.SSS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    UserService us;

    @GetMapping("/getData")
    public List<Integer> getListData()
    {
        return us.getList();
    }


}
