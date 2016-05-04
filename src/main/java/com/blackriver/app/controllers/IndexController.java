package com.blackriver.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bipin on 5/3/2016.
 */
@Controller
public class IndexController {

    @RequestMapping(value="/")
    public String index() {
        return "index";
    }

}