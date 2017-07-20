package cn.dishenghk.dao;

import cn.dishenghk.entity.ContractlistEntity;
import cn.dishenghk.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by john on 2017/7/15.
 */

@Service
public interface ContractListDao {
    List<ContractlistEntity> queryAllUser();
    List<ContractlistEntity> selectById(@Param("id") int id);
    boolean Insertlist(@Param("contractlist") ContractlistEntity contractlist);
    List<ContractlistEntity> selectBycid(@Param("cid") int cid);
    boolean deleteBycid(@Param("cid") int cid);

}
