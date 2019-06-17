package io.gitee.xjt2016;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:/spring-datasource.xml"})
public class IbatisTest {
    @Resource
    EmployeeDao employeeDao;

    @Test
    public void test001() throws Exception {
        Employee employee = new Employee();
        employee.setFkId("2");
        System.out.println(JSON.toJSONString(employeeDao.getAll(employee)));
    }
}
