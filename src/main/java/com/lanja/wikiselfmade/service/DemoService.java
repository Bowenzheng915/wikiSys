package com.lanja.wikiselfmade.service;


import com.lanja.wikiselfmade.domain.Demo;
import com.lanja.wikiselfmade.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    };

}
