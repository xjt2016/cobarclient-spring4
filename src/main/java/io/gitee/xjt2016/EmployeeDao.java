package io.gitee.xjt2016;

import com.alibaba.cobarclient.dao.MysdalBaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao extends MysdalBaseDao {

    public int update(Employee employee) {
        return super.getSqlMapClientTemplate().update("Employee.update", employee);
    }

    public List<Employee> getAll(Employee employee) {
        System.out.println("Going to read records.....");
        return (List<Employee>) super.getSqlMapClientTemplate().queryForList("Employee.getAll", employee);

    }
}
