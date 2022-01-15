package com.zkb.yyappjava.cygdata.service;

import com.sun.org.apache.regexp.internal.RE;
import com.zkb.yyappjava.cygdata.dao.enitity.StockEntity;
import com.zkb.yyappjava.cygdata.dao.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private EntityManager entityManager;

    public List<StockEntity> listByPage(Integer page) {
        Pageable pageAble = getPageAble(page);
        Page<StockEntity> all = stockRepository.findAll(pageAble);
        List<StockEntity> content = all.getContent();
        return content;
    }

    private Pageable getPageAble(Integer page) {
        PageRequest pageRequest = PageRequest.of(page, 20);
        return pageRequest;
    }

    public List<StockEntity> byCode(Integer code) {
        if (code == null) {
            return Collections.EMPTY_LIST;
        }
        List<StockEntity> resultList = entityManager
                .createNativeQuery("select * from stock_zh_ah_name where code =" + code, StockEntity.class)
                .getResultList();
        return resultList;
    }

    public List<StockEntity> byName(String name) {
        if (name == null) {
            return Collections.EMPTY_LIST;
        }
        String str = "%" + name + "%";
        String sql = "select * from stock_zh_ah_name where name like \'" + str + "\'";
        List<StockEntity> resultList = entityManager
                .createNativeQuery(sql, StockEntity.class)
                .getResultList();
        return resultList;
    }
}
