package com.atguigu.basedaotest;

import com.atguigu.basedao.BaseDao;
import org.junit.Test;

public class Test1 {
    BaseDao baseDao = new BaseDao();
    @Test
    public void test01() throws Exception {
        String sql = "insert into account values(null,?,?)";
        Object[] o ={"冰冰",500};
        int i = baseDao.commonUpdate(sql, o);
        System.out.println(i>0?"成功":"失败");
    }
}
