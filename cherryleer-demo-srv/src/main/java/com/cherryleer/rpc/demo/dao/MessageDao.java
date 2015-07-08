package com.cherryleer.rpc.demo.dao;


import com.cherryleer.rpc.daf.dao.hibernate.HibernateGenericDao;
import com.cherryleer.rpc.demo.model.Message;
import com.cherryleer.rpc.demo.model.QueryMessageCond;


/**
 * 消息Dao
 *
 * @author : cherryleer
 */
public class MessageDao extends HibernateGenericDao<Message, Integer, QueryMessageCond> {
}
