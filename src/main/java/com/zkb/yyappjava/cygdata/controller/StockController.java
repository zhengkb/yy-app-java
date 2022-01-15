package com.zkb.yyappjava.cygdata.controller;

import com.zkb.yyappjava.cygdata.dao.enitity.StockEntity;
import com.zkb.yyappjava.cygdata.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock/getInfo/")
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("byPage")
    public List<StockEntity> byPage(@RequestParam Integer page) {
        return stockService.listByPage(page);
    }

    @GetMapping("byCode")
    public List<StockEntity> byCode(@RequestParam Integer code) {
        return stockService.byCode(code);
    }

    @GetMapping("byName")
    public List<StockEntity> byName(@RequestParam String name) {
        return stockService.byName(name);
    }

}
