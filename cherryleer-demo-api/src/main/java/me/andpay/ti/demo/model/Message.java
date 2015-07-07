package me.andpay.ti.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 消息实体
 *
 * @author : cherryleer
 */
@Entity
//@Table(name="message")
public class Message implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 消息主题
     */
    @Size(max = 20)
    private String title;

    /**
     * 消息内容
     */
    @Size(max = 200)
    private String context;

    public Message() {
    }

    public Message(String title, String context) {
        this.title = title;
        this.context = context;
    }

    public Message(Integer id, String title, String context) {
        this.id = id;
        this.title = title;
        this.context = context;
    }

    private static Message defaultMessageInstance;

    public static Message getDefaultMessageInstance(){

        if(defaultMessageInstance == null)
            defaultMessageInstance = new Message("default","This is the default message!");

        return defaultMessageInstance;
    }

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
        if (!(o instanceof Message)) return false;

        Message message = (Message) o;

        if (context != null ? !context.equals(message.context) : message.context != null) return false;
        if (id != null ? !id.equals(message.id) : message.id != null) return false;
        if (title != null ? !title.equals(message.title) : message.title != null) return false;

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
        return "Message{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
