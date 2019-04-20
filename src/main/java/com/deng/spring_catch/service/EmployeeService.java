package com.deng.spring_catch.service;

import com.deng.spring_catch.bean.Employee;
import com.deng.spring_catch.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames="{emp}")
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable()
    public Employee getEmployByid(Integer id){
        System.out.print("查询员工号为"+id+"的员工");
        Employee empByid = employeeMapper.getEmpByid(id);
        return empByid;
    }

    @CachePut(key ="{#employee.id}")
    public void update(Employee employee){
        System.out.println("更新的员工号为"+employee.getId());
        employeeMapper.updateEmp(employee);
        System.out.println(employee);
    }


}
