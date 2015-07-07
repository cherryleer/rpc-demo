package me.andpay.ti.demo.model;

import me.andpay.ti.daf.dao.simplequery.AbstractOrderableCondition;
import me.andpay.ti.daf.dao.simplequery.annotation.Condition;
import me.andpay.ti.daf.dao.simplequery.annotation.Expression;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QueryMessageCond)) return false;

        QueryMessageCond that = (QueryMessageCond) o;

        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (context != null ? context.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "QueryMessageCond{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
