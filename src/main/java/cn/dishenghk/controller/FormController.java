package cn.dishenghk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by john on 2017/7/12.
 */
@Controller
public class FormController {
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        return formName;
    }

}
