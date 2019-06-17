package io.gitee.xjt2016;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

public class IbatisUpdate {
    public static void main(String[] args)
            throws IOException, SQLException {
        Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

        /* This would update one record in Employee table. */
        System.out.println("Going to update record.....");
        Employee rec = new Employee();
        rec.setId(1);
        rec.setFirstName("Roma");
        smc.update("Employee.update", rec);
        System.out.println("Record updated Successfully ");

        System.out.println("Going to read records.....");
        List<Employee> ems = (List<Employee>) smc.queryForList("Employee.getAll", null);
        Employee em = null;

        for (Employee e : ems) {
            System.out.print("  " + e.getId());
            System.out.print("  " + e.getFirstName());
            System.out.print("  " + e.getLastName());
            System.out.print("  " + e.getSalary());
            em = e;
            System.out.println("");
        }

        System.out.println("Records Read Successfully ");
    }
} 