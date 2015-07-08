package com.cherryleer.rpc.demo.model;

import com.cherryleer.rpc.daf.dao.simplequery.AbstractOrderableCondition;
import com.cherryleer.rpc.daf.dao.simplequery.annotation.Condition;
import com.cherryleer.rpc.daf.dao.simplequery.annotation.Expression;

import java.util.Date;

/**
 * 消息查询条件
 *
 * @author : cherryleer
 */
@Condition
public class QueryMessageCond extends AbstractOrderableCondition {

    private Integer id;

    private String title;

    @Expression(operator = "like")
    private String context;

    @Expression(property = "createTime", operator = ">=")
    private Date startCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Date startCreateTime) {
        this.startCreateTime = startCreateTime;
    }
}
