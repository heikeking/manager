package cn.dishenghk.service;

import cn.dishenghk.entity.ContractlistEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by john on 2017/7/15.
 */
public interface ContractListService {
    List<ContractlistEntity> queryAllUser();
    List<ContractlistEntity> selectById(@Param("id") int id);
    void Insertlist(@Param("contractlist") ContractlistEntity contractlist);
    List<ContractlistEntity> selectBycid(@Param("cid") int cid);
    void deleteBycid(@Param("cid") int cid);
}
