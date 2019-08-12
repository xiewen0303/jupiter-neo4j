package com.neo4j.demo.service;

import com.neo4j.demo.dao.UserDao;
import com.neo4j.demo.entity.UserNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserService {

    @Resource
    private UserDao userDao;

    public UserNode save(UserNode profile){
        return userDao.save(profile);
    }

    public List<UserNode> addUserNodeList(UserNode userNode){
        return userDao.addUserNodeList(userNode.getName(),userNode.getAge());
    }

    public void delete(UserNode profile){
        userDao.delete(profile);
    }

    public UserNode findById(long id,int depth) {
//        Optional<UserNode> optional = userDao.findById(id,10);
        Optional<UserNode> optional =  userDao.findById(id);
        return  optional.isPresent() ? optional.get() :null;
    }

    public List<UserNode> getUserNodeList(){
        return userDao.getUserNodeList();
    }

    public Iterable<UserNode> getUserNodeIterable(){
        return userDao.findAll();
    }
}
