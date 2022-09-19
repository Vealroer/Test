package cn.rainbow.cloud;

import cn.rainbow.cloud.service.DeptService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DeptProvider_8001.class)
public class Test {

    @Autowired
    private DeptService deptService;

    @org.junit.Test
    public void test(){
        System.out.println(deptService.find(2L));
    }
}
