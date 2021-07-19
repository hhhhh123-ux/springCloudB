package com.gzq.springcloud.dao;

import com.gzq.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    public void addDept(Dept dept);

    public Dept queryById(Long deptNo);

    public List<Dept> queryAll();
}
