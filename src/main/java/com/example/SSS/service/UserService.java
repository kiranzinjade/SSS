package com.example.SSS.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    public List<Integer> getList() {
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(24);
        list.add(17);
        list.add(28);

        return list;
    }
}
