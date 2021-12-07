package com.zkb.yyappjava.cygdata.controller;

import com.zkb.yyappjava.cygdata.dao.enitity.CygDataInfoEntity;
import com.zkb.yyappjava.cygdata.service.CygService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cyg/")
public class CygController {

    @Autowired
    private CygService cygService;

    @GetMapping("all")
    public List<CygDataInfoEntity> getAll() {
        return cygService.getEntities();
    }

    @GetMapping("dataNum")
    public Long getDataNum() {
        return cygService.getDataNum();
    }

    @GetMapping("findByPage")
    public List<CygDataInfoEntity> findByPage(@RequestParam Integer page) {
        return cygService.findByPage(page);
    }
}
