package cn.dishenghk.controller;

import cn.dishenghk.entity.User;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by john on 2017/7/18.
 */
@Entity
public class Msg {
    private int code;
    private int count;
    private List data;


    public  void success(List data){
        this.data=data;
        if(data.size()!=0){
            count=data.size();
            code=1;
        }else {
            code=0;
            count=0;
        }



    }

    public void fail(){
        code=0;
        count=0;
        data=null;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setResult(List data) {
        this.data = data;
    }
}
