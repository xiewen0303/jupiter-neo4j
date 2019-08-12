package com.neo4j.demo.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.io.Serializable;

@Data
@NodeEntity(label = "student")
public class StudentNode implements Serializable {

    @GraphId
    private Long id;  //如何不设置＠graphId字段的值，可以创建成功节点，但是如果认为设置＠graphId字段的值，则不能成功创建节点
    private String name;
    private String school;
    private String sex;
}
