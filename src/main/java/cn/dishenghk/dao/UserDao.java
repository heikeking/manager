package cn.dishenghk.dao;

import cn.dishenghk.controller.Msg;
import cn.dishenghk.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zuozhiyuan on 2017/7/10.
 */
@Service
public interface UserDao {
    List<User> queryAllUser();
    boolean InsertUser(@Param("user") User user);

    User selectById(int id);
    List<User> selectByName(String userName);

}
