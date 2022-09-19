package cn.rainbow.cloud.controller;

import cn.rainbow.cloud.entity.Dept;
import cn.rainbow.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/add")
    public int addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept find(@PathVariable("id") Long id){
        System.out.println(deptService.find(id));
        return deptService.find(id);
    }

    //注册进来的微服务，获取一些信息
    @GetMapping("/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> clientServices = client.getServices();
        System.out.println(clientServices);
        List<ServiceInstance> instances = client.getInstances(clientServices.get(0));
        System.out.println(instances.get(0).getInstanceId()+"\t"+instances.get(0).getHost()+"\t"+instances.get(0).getPort());
        return this.client;
    }
}
