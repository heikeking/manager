package cn.dishenghk.controller;

import cn.dishenghk.entity.ContractlistEntity;
import cn.dishenghk.entity.User;
import cn.dishenghk.service.ContractListService;
import cn.dishenghk.service.UserService;
import cn.dishenghk.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zuozhiyuan on 2017/7/6.
 */
@RestController
@RequestMapping("/user")
public class TestController {
    @Autowired
    UserService userService;
    @Autowired
    User user;

    @Autowired
    ContractListService contractListService;

    @RequestMapping("/test")
    public List<User> test(){
        return userService.queryAllUser();
    }
    @RequestMapping("/test1")
    public void  insertuser(){
        user.setEmail("dishenghk@qq.com");
        user.setId(11111);
        user.setUserName("disheng");
        userService.InsertUser(user);
    }
    @RequestMapping("/test2")
    public List<ContractlistEntity> test2(){
        return contractListService.queryAllUser();
    }


        @RequestMapping(value="/login",produces ="text/html;charset=UTF-8")
        public String login(HttpServletRequest request,HttpServletResponse response){
            String userName=request.getParameter("userName");
            String Password=request.getParameter("Password");
            List<User> user=userService.login(userName,Password);
            Msg msg=new Msg();
            if(user!=null&&user.get(0).getPassword().equals(Password)){
                HttpSession session = request.getSession();
                session.setAttribute("uid", user.get(0).getId());
                msg.success(user);
                JsonUtil.toJson(msg);
               return JsonUtil.toJson(msg);
            }else {
                msg.fail();
                return JsonUtil.toJson(msg);


            }

        }

        @RequestMapping(value = "/jsontest", method =RequestMethod.GET)
        @ResponseBody
        public String jsontest(){

            Msg msg=new Msg();
            List<User> users=userService.queryAllUser();
            if(users!=null){
                msg.success(users);
                JsonUtil.toJson(msg);
                return JsonUtil.toJson(msg);
            }else {
                msg.fail();

                return JsonUtil.toJson(msg);
            }
        }



    }





