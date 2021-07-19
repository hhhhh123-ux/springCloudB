package com.gzq.springCloud.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.gzq.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class DeptController {

    @Autowired
    private RestTemplate restTemplate;


    //private static final String url="http://localhost:8001/";
    //Ribbon
    private static final String url="http://SPRINGCLOUDB-PROVIDE-DEPT";

    @GetMapping("/get/{deptNo}")
    public ResponseEntity<Dept> get(@PathVariable("deptNo") Long deptNo){
        return restTemplate.getForEntity(url+"/get/"+deptNo,Dept.class);
    }

    @PostMapping("/add")
    public void add(@RequestBody Dept dept){
        restTemplate.postForObject(url+"/add",dept, JSONPObject.class);
    }

    @GetMapping("/getAll")
    public List<Dept> getAll(){
        return restTemplate.getForObject(url+"/getAll",List.class);
    }
}
