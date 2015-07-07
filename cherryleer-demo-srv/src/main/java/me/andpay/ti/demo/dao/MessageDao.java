package me.andpay.ti.demo.dao;


import me.andpay.ti.daf.dao.hibernate.HibernateGenericDao;
import me.andpay.ti.demo.model.Message;
import me.andpay.ti.demo.model.QueryMessageCond;


/**
 * 消息Dao
 *
 * @author : cherryleer
 */
public class MessageDao extends HibernateGenericDao<Message, Integer, QueryMessageCond> {
}
