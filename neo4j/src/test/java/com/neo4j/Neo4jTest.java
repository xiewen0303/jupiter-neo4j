package com.neo4j;

import com.alibaba.fastjson.JSONObject;
import com.neo4j.demo.ApplicationStart;
import com.neo4j.demo.entity.StudentNode;
import com.neo4j.demo.entity.StudentToUserRelation;
import com.neo4j.demo.entity.UserNode;
import com.neo4j.demo.service.RelationService;
import com.neo4j.demo.service.StudentService;
import com.neo4j.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationStart.class)
public class Neo4jTest {

    @Resource
    private UserService userService;
    @Resource
    private StudentService studentService;
    @Resource
    private RelationService relationService;

    @Test
    public void save2Neo4j() throws Exception {
        UserNode userNode = new UserNode();
        userNode.setAddress("中国上海市浦东新区张杨路501号");
        userNode.setJob("八佰伴管理员");
        userNode.setName("小明");
        userNode.setSex("man");
        userNode.setAge(20);
        userNode = userService.save(userNode);
        System.out.println(JSONObject.toJSONString(userNode));
    }

    @Test
    public void save2Student() throws Exception {
        StudentNode studentNode = new StudentNode();
        studentNode.setName("小样");
        studentNode.setSex("女");
        studentNode.setSchool("艺术学院");
        studentNode = studentService.save(studentNode);
        System.out.println(JSONObject.toJSONString(studentNode));
    }

    @Test
    public void save2StudentSuerRelation() throws Exception {
        StudentToUserRelation relation = new StudentToUserRelation();
        relation.setTitle("测试数据");
        UserNode userNode = userService.findById(96,1);
        StudentNode studentNode = studentService.findById(76,1);
        relation.setStudentNode(studentNode);
        relation.setUserNode(userNode);
        relation =  relationService.save(relation);
        System.out.println(JSONObject.toJSONString(relation));
    }

    @Test
    public void get2Neo4j() throws Exception {
//        Iterable<UserNode> userNodes= userService.getUserNodeIterable();
        List<UserNode> users =   userService.getUserNodeList();
        System.out.println(JSONObject.toJSONString(users));
    }

    @Test
    public void getById(){
        UserNode userNode = userService.findById(96,1);
        System.out.println(userNode);
    }

    @Test
    public void deleteById(){
        UserNode userNode = userService.findById(97,1);

        userService.delete(userNode);

        System.out.println(userNode);
    }
}
