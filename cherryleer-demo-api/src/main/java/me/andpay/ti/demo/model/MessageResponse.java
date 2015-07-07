package me.andpay.ti.demo.model;

/**
 * 消息响应实体
 *
 * @author : cherryleer
 */
public class MessageResponse {

    private Integer code;
    private Message message;

    public MessageResponse() {
    }

    public MessageResponse(Message message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageResponse)) return false;

        MessageResponse that = (MessageResponse) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "code=" + code +
                ", message=" + message +
                '}';
    }
}
