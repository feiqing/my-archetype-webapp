package com.fq.archetypes.dao;

import com.fq.archetypes.TestBase;
import com.fq.archetypes.domain.MySQLUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author jifang
 * @since 16/10/17 下午8:47.
 */
public class AppDAOTest extends TestBase {

    @Autowired
    private AppDAO dao;

    @Test
    public void testApp(){
        List<MySQLUser> root = dao.service("root");
        System.out.println(root);
    }
}
