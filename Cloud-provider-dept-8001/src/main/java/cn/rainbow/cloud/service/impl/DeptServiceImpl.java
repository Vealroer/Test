package cn.rainbow.cloud.service.impl;

import cn.rainbow.cloud.dao.DeptDao;
import cn.rainbow.cloud.entity.Dept;
import cn.rainbow.cloud.service.DeptService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public int addDept(Dept dept) {
        return deptDao.insert(dept);
    }

    @Override
    public Dept find(Long id) {
        return deptDao.selectByPrimaryKey(id);
    }


}
