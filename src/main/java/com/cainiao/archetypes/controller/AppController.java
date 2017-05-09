package com.cainiao.archetypes.controller;

import com.cainiao.archetypes.service.IAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jifang
 * @since 16/10/17 下午8:00.
 */
@Controller
public class AppController {

    @Autowired
    private IAppService service;

    @ResponseBody
    @RequestMapping("/app.do")
    public String add(@RequestParam("param") String param) {
        return service.service(param);
    }
}
