package com.cainiao.archetypes.dao;

import com.cainiao.archetypes.domain.MySQLUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jifang
 * @since 16/10/17 下午8:19.
 */
public interface AppDAO {

    List<MySQLUser> service(@Param("param") String param);
}
