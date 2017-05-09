package com.cainiao.archetypes.service.impl;

import com.alibaba.fastjson.JSON;
import com.cainiao.archetypes.dao.AppDAO;
import com.cainiao.archetypes.service.IAppService;
import com.cainiao.archetypes.domain.MySQLUser;
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
