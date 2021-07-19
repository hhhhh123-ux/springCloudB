package com.gzq.springCloud.controller;

import com.gzq.springcloud.pojo.Dept;
import com.gzq.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class DeptController {



    private DeptClientService deptClientService;

    @GetMapping("/get/{deptNo}")
    public Dept get(@PathVariable("deptNo") Long deptNo){
        return this.deptClientService.queryById(deptNo);
    }

    @PostMapping("/add")
    public void add(@RequestBody Dept dept){

        this.deptClientService.add(dept);

    }

    @GetMapping("/getAll")
    public List<Dept> getAll(){
        return this.deptClientService.getAll();
    }
}
