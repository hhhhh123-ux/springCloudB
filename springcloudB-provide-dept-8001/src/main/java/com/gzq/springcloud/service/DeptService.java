package com.gzq.springcloud.service;

import com.gzq.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public void addDept(Dept dept);

    public Dept queryById(Long deptNo);

    public List<Dept> queryAll();
}
