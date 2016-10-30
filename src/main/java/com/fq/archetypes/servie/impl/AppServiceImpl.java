package com.fq.archetypes.servie.impl;

import com.alibaba.fastjson.JSON;
import com.fq.archetypes.dao.AppDAO;
import com.fq.archetypes.domain.MySQLUser;
import com.fq.archetypes.servie.IAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jifang
 * @since 16/10/17 下午8:15.
 */
@Service
public class AppServiceImpl implements IAppService {

    @Autowired
    private AppDAO dao;

    @Override
    public String service(String param) {
        List<MySQLUser> list = dao.service(param);
        return JSON.toJSONString(list);
    }
}
