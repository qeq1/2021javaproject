package com.atguigu.basedao;

import com.atguigu.utils.JDBCUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*

 */
public class BaseDao {


     //通用的增删改方法
    /*
      insert into account(null,?,?);
      update account set sname =? where id = ?;
        "杜甫"  2
        delete from account where id = ?;
        1
       insert into account(null,"李白",'123');

     */

    public int commonUpdate(String sql,Object...objs) throws Exception {
        //1.获取连接
        Connection connection = JDBCUtils.getConnection();
        //2.准备sql 会采用形参传入
        //3.准备命令发送器
        PreparedStatement pst = connection.prepareStatement(sql);

        if(objs!=null && objs.length>0){
            for (int i = 0; i < objs.length; i++) {
                //4.设置值
                pst.setObject(i+1, objs[i]);
            }
        }

        //5.执行命令获取结果
        int i = pst.executeUpdate();
        return i;
    }


}
