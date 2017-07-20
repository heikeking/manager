package cn.dishenghk.serviceimpl;

import cn.dishenghk.dao.ContractListDao;
import cn.dishenghk.entity.ContractlistEntity;
import cn.dishenghk.service.ContractListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by john on 2017/7/15.
 */

@Service
public class ContractListServiceImpl implements ContractListService {

    @Autowired
    ContractListDao contractListDao;

    @Override
    public List<ContractlistEntity> queryAllUser() {
        return contractListDao.queryAllUser();
    }

    @Override
    public List<ContractlistEntity> selectById(int id) {
        return contractListDao.selectById(id);
    }

    @Override
    public List<ContractlistEntity> selectBycid(int cid) {
        return contractListDao.selectBycid(cid);
    }

    @Override
    public void deleteBycid(int cid) {
        contractListDao.deleteBycid(cid);
    }

    @Override
    public void Insertlist(ContractlistEntity contractlist) {
        contractListDao.Insertlist(contractlist);
    }




}


