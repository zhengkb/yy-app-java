package com.zkb.yyappjava.countmanage.service;

import com.zkb.yyappjava.countmanage.dao.entity.CountManageEntity;
import com.zkb.yyappjava.countmanage.dao.repository.CountManageRepository;
import com.zkb.yyappjava.countmanage.packet.CountPacket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class CountManageService {

    @Autowired
    private CountManageRepository countManageRepository;

    public CountManageEntity insertIntoRepository(CountPacket packet) {
        CountManageEntity entity = new CountManageEntity();
        BeanUtils.copyProperties(packet, entity);
        CountManageEntity save = countManageRepository.save(entity);
        return save;
    }
}
