package com.lanja.wikiselfmade.service;


import com.lanja.wikiselfmade.domain.Test;
import com.lanja.wikiselfmade.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    };

}
