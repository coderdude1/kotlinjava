package com.dood.kotlinjava.controller;

import com.dood.kotlinjava.model.SimpleKotlinPojo;
import com.dood.kotlinjava.model.SimplePojo;
import com.dood.kotlinjava.services.SimpleKotlinPojoFactory;
import com.dood.kotlinjava.services.SimplePojoFactory;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimplePojoController {
    private static final Logger LOG = LoggerFactory.getLogger(SimplePojoController.class);

    private SimplePojoFactory simplePojoFactory;
    private SimpleKotlinPojoFactory simpleKotlinPojoFactory;

    @Autowired
    public SimplePojoController(SimplePojoFactory simplePojoFactory, SimpleKotlinPojoFactory simpleKotlinPojoFactory) {
        this.simplePojoFactory = simplePojoFactory;
        this.simpleKotlinPojoFactory = simpleKotlinPojoFactory;
    }

    @RequestMapping(value = "/getSome", method = RequestMethod.GET)
    public SimplePojo pojo() {
        SimplePojo simplePojo = simplePojoFactory.createSimplePojo();
        LOG.info("getSome called.  Object={}", simplePojo);
        return simplePojo;
    }

    @RequestMapping(value = "/getSomeKotlinFromJava", method = RequestMethod.GET)
    public SimpleKotlinPojo kotlinPojoFromJavaService() {
        SimpleKotlinPojo simplePojo = simplePojoFactory.createSimpleKotlinPojo();
        LOG.info("getSomeKotlin called.  Object={}", simplePojo);
        return simplePojo;
    }
//
//    @RequestMapping(value = "/getSomeKotlinFromKotlinService", method = RequestMethod.GET)
//    public SimpleKotlinPojo kotlinPojoFromKotlinService() {
//        SimpleKotlinPojo simplePojo = simpleKotlinPojoFactory.();
//        LOG.info("getSomeKotlin called.  Object={}", simplePojo);
//        return simplePojo;
//    }
}
