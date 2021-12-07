package com.zkb.yyappjava.countmanage.controller;

import com.zkb.yyappjava.countmanage.dao.entity.CountManageEntity;
import com.zkb.yyappjava.countmanage.packet.CountPacket;
import com.zkb.yyappjava.countmanage.service.CountManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/count/")
public class CountManageController {

    @Autowired
    private CountManageService countManageService;

    @PostMapping("add")
    public CountManageEntity add(@RequestBody CountPacket packet) {
        return countManageService.insertIntoRepository(packet);
    }
}
