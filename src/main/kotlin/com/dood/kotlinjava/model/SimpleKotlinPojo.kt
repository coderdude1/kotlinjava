package com.dood.kotlinjava.model

import com.google.common.base.MoreObjects

import java.time.Instant
import java.util.Objects

/*
Created via copying the java SimplePojo here, and running the code->convert java to kotlin.

It appears to have a lot of stuff not needed, like the getter/setters, hashcode, etc.  will experiment

Currently it has the same package path as the java SimplePojo, and I tweeked the name to indicate it is a kotlin pojo,
not sure ATM about duplicate naming rules and such

need to play around with kotlin constructors, default values, val vs var, data classes, etc
 */
class SimpleKotlinPojo {
    private var createDate: Instant? = null
    private var updateDate: Instant? = null
    private var name: String? = null
    private var status: Status? = null
    private var childKeys: List<String>? = null

    fun getCreateDate(): Instant? {
        return createDate
    }

    fun setCreateDate(createDate: Instant): SimpleKotlinPojo {
        this.createDate = createDate
        return this
    }

    fun getUpdateDate(): Instant? {
        return updateDate
    }

    fun setUpdateDate(updateDate: Instant): SimpleKotlinPojo {
        this.updateDate = updateDate
        return this
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String): SimpleKotlinPojo {
        this.name = name
        return this
    }

    fun getStatus(): Status? {
        return status
    }

    fun setStatus(status: Status): SimpleKotlinPojo {
        this.status = status
        return this
    }

    fun getChildKeys(): List<String>? {
        return childKeys
    }

    fun setChildKeys(childKeys: List<String>): SimpleKotlinPojo {
        this.childKeys = childKeys
        return this
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val that = o as SimpleKotlinPojo?
        return createDate == that!!.createDate &&
                updateDate == that.updateDate &&
                name == that.name &&
                status == that.status &&
                childKeys == that.childKeys
    }

    override fun hashCode(): Int {
        return Objects.hash(createDate, updateDate, name, status, childKeys)
    }

    override fun toString(): String {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .toString()
    }
}
