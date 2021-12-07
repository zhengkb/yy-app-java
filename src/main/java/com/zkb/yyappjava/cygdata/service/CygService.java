package com.zkb.yyappjava.cygdata.service;

import com.zkb.yyappjava.cygdata.dao.enitity.CygDataInfoEntity;
import com.zkb.yyappjava.cygdata.dao.repository.CygRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CygService {
    @Autowired
    private CygRepository cygRepository;

    public List<CygDataInfoEntity> getEntities() {
        List<CygDataInfoEntity> all = cygRepository.findAll();
        return all;
    }

    public Long getDataNum() {
        return cygRepository.count();
    }

    public List<CygDataInfoEntity> findByPage(Integer page) {
        Pageable pageAble = getPageAble(page);
        Page<CygDataInfoEntity> cygRepositoryAll = cygRepository.findAll(pageAble);
        List<CygDataInfoEntity> content = cygRepositoryAll.getContent();
        return content;
    }

    private Pageable getPageAble(Integer page) {
        PageRequest pageRequest = PageRequest.of(page, 20);
        return pageRequest;
    }
}
