package com.gzq.springcloud.service;

import com.gzq.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "SPRINGCLOUDB-PROVIDE-DEPT")
@ComponentScan
public interface DeptClientService {

    @GetMapping("/get/{deptNo}")
    public Dept queryById(@PathVariable long deptNo);

    @GetMapping("/getAll")
    public List<Dept> getAll();

    @PostMapping("/add")
    public Dept add(Dept dept);
}
