package com.ps.beans.others;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class MtBeanTest {

    private Logger logger = LoggerFactory.getLogger(MtBeanTest.class);

    @Test
    public void testConfig() {
        //TODO 6. Modify this class to use the new set of configuration files, created by resolving TODO 5.
        //Configuration without wildcards
        ApplicationContext ctxEnum =  new ClassPathXmlApplicationContext("classpath:spring/others/collections-cfg.xml"
                , "classpath:spring/others/dateConverter-cfg.xml"
                , "classpath:spring/others/factory-cfg.xml"
                , "classpath:spring/others/num-cfg.xml");
        //TODO 7. Try to use wildcards as well.
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/others/*-cfg.xml");

        MultipleTypesBean mtBean = (MultipleTypesBean) ctx.getBean("mtBean");
        assertNotNull(mtBean);

    }
}
