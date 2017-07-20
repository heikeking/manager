package cn.dishenghk.serviceimpl;

import cn.dishenghk.dao.UserDao;
import cn.dishenghk.entity.User;
import cn.dishenghk.service.UserService;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zuozhiyuan on 2017/7/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }

    @Override
    public void InsertUser(User user) {
        userDao.InsertUser(user);

    }

    //登录方法的实现,从jsp页面获取username与password
    public List<User> login(String userName, String Password) {
//        System.out.println("输入的账号:" + username + "输入的密码:" + password);
        //对输入账号进行查询,取出数据库中保存对信息
        List<User> user = userDao.selectByName(userName);
        return user;
    }





}
