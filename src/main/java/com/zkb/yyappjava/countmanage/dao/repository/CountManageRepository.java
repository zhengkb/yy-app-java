package com.zkb.yyappjava.countmanage.dao.repository;

import com.zkb.yyappjava.countmanage.dao.entity.CountManageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountManageRepository extends JpaRepository<CountManageEntity, Integer> {
}
