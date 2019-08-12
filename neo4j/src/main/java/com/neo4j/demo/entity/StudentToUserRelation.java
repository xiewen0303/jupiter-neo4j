package com.neo4j.demo.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.io.Serializable;

@Data
@RelationshipEntity
public class StudentToUserRelation implements Serializable {

    @Id
    @GeneratedValue
    private Long relationshipId;

    @StartNode private StudentNode studentNode;
    @EndNode   private UserNode userNode;

    @Property  private String title;
}
