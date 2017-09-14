package com.dood.kotlinjava.controller;

import com.dood.kotlinjava.model.SimpleKotlinPojo;
import com.dood.kotlinjava.model.SimplePojo;
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

    @Autowired
    public SimplePojoController(SimplePojoFactory simplePojoFactory) {
        this.simplePojoFactory = simplePojoFactory;
    }

    @RequestMapping(value = "/getSome", method = RequestMethod.GET)
    public SimplePojo pojo() {
        SimplePojo simplePojo = simplePojoFactory.createSimplePojo();
        LOG.debug("getSome called.  Object={}", simplePojo);
        return simplePojo;
    }

    @RequestMapping(value = "/getSomeKotlin", method = RequestMethod.GET)
    public SimpleKotlinPojo kotlinPojo() {
        SimpleKotlinPojo simplePojo = simplePojoFactory.createSimplePojo();
        LOG.debug("getSome called.  Object={}", simplePojo);
        return simplePojo;
    }
}
