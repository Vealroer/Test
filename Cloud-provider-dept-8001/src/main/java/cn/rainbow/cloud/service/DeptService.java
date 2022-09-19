package cn.rainbow.cloud.service;

import cn.rainbow.cloud.entity.Dept;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DeptService {
    public int addDept(Dept dept);

    public Dept find(Long id);

}
