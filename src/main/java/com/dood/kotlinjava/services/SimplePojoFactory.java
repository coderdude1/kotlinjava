package com.dood.kotlinjava.services;

import com.dood.kotlinjava.model.SimpleKotlinPojo;
import com.dood.kotlinjava.model.SimplePojo;
import com.dood.kotlinjava.model.Status;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class SimplePojoFactory {
    private static final Logger LOG = LoggerFactory.getLogger(SimplePojoFactory.class);

    public SimplePojo createSimplePojo() {
        List<String> childKeys = generateChildKeys();

        Instant now = Instant.now();
        return new SimplePojo().setCreateDate(now.minus(5, DAYS))
                .setUpdateDate(now.minusSeconds(100))
                .setName("name - " + now.getEpochSecond())
                .setStatus(Status.NEW)
                .setChildKeys(childKeys);
    }

    public SimpleKotlinPojo createSimpleKotlinPojo() {
        Instant now = Instant.now();
        return new SimpleKotlinPojo().setChildKeys(generateChildKeys())
                .setCreateDate(now)
                .setName("kotlinPojoName - " + now.getEpochSecond())
                .setStatus(Status.NEW)
                .setUpdateDate(now.minusSeconds(100));
    }

    @NotNull
    private List<String> generateChildKeys() {
        List<String> childKeys = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            childKeys.add(UUID.randomUUID().toString());
        }
        return childKeys;
    }
}
