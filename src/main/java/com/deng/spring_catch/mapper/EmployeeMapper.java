package com.deng.spring_catch.mapper;

import com.deng.spring_catch.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id = #{id}")
    public Employee getEmpByid(Integer id);

    @Update("update employee set lastName=#{lastName},email=#{email} where id=#{id}")
    public void updateEmp(Employee employee);
}
