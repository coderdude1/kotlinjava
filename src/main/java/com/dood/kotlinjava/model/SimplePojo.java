package com.dood.kotlinjava.model;

import com.google.common.base.MoreObjects;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class SimplePojo {
    private Instant createDate;
    private Instant updateDate;
    private String name;
    private Status status;
    private List<String> childKeys;

    public Instant getCreateDate() {
        return createDate;
    }

    public SimplePojo setCreateDate(Instant createDate) {
        this.createDate = createDate;
        return this;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public SimplePojo setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public String getName() {
        return name;
    }

    public SimplePojo setName(String name) {
        this.name = name;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public SimplePojo setStatus(Status status) {
        this.status = status;
        return this;
    }

    public List<String> getChildKeys() {
        return childKeys;
    }

    public SimplePojo setChildKeys(List<String> childKeys) {
        this.childKeys = childKeys;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimplePojo that = (SimplePojo) o;
        return Objects.equals(createDate, that.createDate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(name, that.name) &&
                status == that.status &&
                Objects.equals(childKeys, that.childKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDate, updateDate, name, status, childKeys);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .toString();
    }
}
