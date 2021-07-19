package com.gzq.springcloud.controller;

import com.gzq.springcloud.pojo.Dept;
import com.gzq.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    public String add(@RequestBody Dept dept) {
        deptService.addDept(dept);
        return "";
    }

    @GetMapping("/get/{deptNo}")
    public Dept get(@PathVariable("deptNo") Long deptNo) {

        return deptService.queryById(deptNo);
    }

    @GetMapping("/getAll")
    public List<Dept> getAll() {
        return deptService.queryAll();
    }

}
