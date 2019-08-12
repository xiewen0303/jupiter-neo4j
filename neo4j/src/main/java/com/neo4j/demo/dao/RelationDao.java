package com.neo4j.demo.dao;

import com.neo4j.demo.entity.StudentNode;
import com.neo4j.demo.entity.StudentToUserRelation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface RelationDao extends BaseDao<StudentToUserRelation> {

    @Query("MATCH (n:user) RETURN n ")
    List<StudentNode> getUserNodeList();

}
