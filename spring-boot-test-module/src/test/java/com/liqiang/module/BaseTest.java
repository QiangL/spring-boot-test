package com.liqiang.module;

import com.liqiang.springboot.module.ModuleConfig;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liqiang
 * @Date 2018/1/19
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ModuleConfig.class)
public abstract class BaseTest {

}
