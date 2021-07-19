package com.gzq.springcloud.service.impl;

import com.gzq.springcloud.dao.DeptDao;
import com.gzq.springcloud.pojo.Dept;
import com.gzq.springcloud.service.DeptService;
import jdk.nashorn.internal.runtime.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Logger
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    public void addDept(Dept dept) {
        deptDao.addDept(dept);
    }

    public Dept queryById(Long deptNo) {
        return deptDao.queryById(deptNo);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
