package com.neo4j.demo.dao;

import com.neo4j.demo.entity.StudentNode;
import com.neo4j.demo.entity.UserNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface StudentDao extends BaseDao<StudentNode> {

    @Query("MATCH (n:user) RETURN n ")
    List<StudentNode> getUserNodeList();

}
