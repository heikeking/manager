package cn.dishenghk.service;

import cn.dishenghk.controller.Msg;
import cn.dishenghk.entity.ContractlistEntity;
import cn.dishenghk.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zuozhiyuan on 2017/7/10.
 */
public interface UserService {
    List<User> queryAllUser();
    void InsertUser(@Param("user") User user);

    List<User> login(String userName,String Password);

}
