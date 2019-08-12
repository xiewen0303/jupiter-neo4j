package com.neo4j.demo.dao;

import com.neo4j.demo.entity.UserNode;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface UserDao extends BaseDao<UserNode> {

    @Query("MATCH (n:user) RETURN n ")
    List<UserNode> getUserNodeList();

    @Query("create (n:user{age:{age},name:{name}}) RETURN n ")
//    List<UserNode> addUserNodeList(UserNode userNode);
    List<UserNode> addUserNodeList(@Param("name") String name, @Param("age")int age);

}
