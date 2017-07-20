package cn.dishenghk.controller;

import cn.dishenghk.entity.ContractlistEntity;
import cn.dishenghk.service.ContractListService;
import com.sun.javafx.scene.layout.region.Margins;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.persistence.Convert;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by john on 2017/7/19.
 */
@RestController
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    ContractListService contractListService;
    @Autowired
    ContractlistEntity contractlist;



    @RequestMapping(value = "/list",produces ="text/html;charset=UTF-8")
    public String list(HttpServletRequest request,HttpServletResponse response){

        Msg msg=new Msg();
        HttpSession session = request.getSession();
        if(session==null||session.getAttribute("uid")==null)
        {
            msg.fail();
            JsonUtil.toJson(msg);
            return JsonUtil.toJson(msg);
        }
        else
        {
            Integer uid=(Integer) session.getAttribute("uid");
            int id= uid.intValue();
            List<ContractlistEntity> list=contractListService.selectById(id);
            msg.success(list);
            JsonUtil.toJson(msg);
            return JsonUtil.toJson(msg);
        }


    }
    //String area,int contractNumber,String contractName,String hirer,String startTime,String endTime,String status,String remark
    @RequestMapping(value = "/addcontract",produces ="text/html;charset=UTF-8")
    public String  insert(HttpServletRequest request,HttpServletResponse response) throws ParseException {

        String area=request.getParameter("area");
        String contractNumberS=request.getParameter("contractNumber");
        int contractNumber= Integer.parseInt(contractNumberS);
        String contractName=request.getParameter("contractName");
        String hirer=request.getParameter("hirer");
        String startTime=request.getParameter("startTime");
        String endTime=request.getParameter("endTime");
        String status=request.getParameter("status");
        String remark=request.getParameter("remark");


        HttpSession session = request.getSession();



        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date1 =sdf.parse(startTime);
        java.util.Date date2 =sdf.parse(endTime);
        java.sql.Date sqlDate1=new java.sql.Date(date1.getTime());
        java.sql.Date sqlDate2=new java.sql.Date(date2.getTime());

        List<ContractlistEntity> list=contractListService.selectBycid(contractNumber);
        Msg msg=new Msg();
        if(list.size()==1&&(session==null||session.getAttribute("usrid")==null)){
            msg.fail();
            JsonUtil.toJson(msg);
            return JsonUtil.toJson(msg);
        }else {
                Integer uid=(Integer) session.getAttribute("uid");
                int id= uid.intValue();
                contractlist.setId(id);

                contractlist.setArea(area);
                contractlist.setContractNumber(contractNumber);
                contractlist.setContractName(contractName);
                contractlist.setHirer(hirer);
                contractlist.setStartTime(sqlDate1);
                contractlist.setEndTime(sqlDate2);
                contractlist.setStatus(status);
                contractlist.setRemark(remark);
                contractListService.Insertlist(contractlist);

                list = contractListService.selectBycid(contractNumber);

                msg.success(list);
                JsonUtil.toJson(msg);
                return JsonUtil.toJson(msg);



        }

    }

    @RequestMapping(value = "/deletecontract",produces ="text/html;charset=UTF-8")
    public String delete(HttpServletRequest request,HttpServletResponse response){
        String contractNumberS=request.getParameter("contractNumber");
        int contractNumber= Integer.parseInt(contractNumberS);

        contractListService.deleteBycid(contractNumber);

        List<ContractlistEntity> list=contractListService.selectBycid(contractNumber);
        Msg msg=new Msg();
        if(list.size()==0){
            msg.setCode(1);
            msg.setCount(0);
            msg.setResult(null);
            JsonUtil.toJson(msg);
            return JsonUtil.toJson(msg);
        }else {
            msg.setCode(0);
            msg.setCount(0);
            msg.setResult(null);
            JsonUtil.toJson(msg);
            return JsonUtil.toJson(msg);
        }
    }
}
