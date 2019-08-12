package com.neo4j.demo.service;

import com.neo4j.demo.dao.RelationDao;
import com.neo4j.demo.entity.StudentToUserRelation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class RelationService {

    @Resource
    private RelationDao relationDao;

    public StudentToUserRelation save(StudentToUserRelation profile){
        return relationDao.save(profile);
    }

//    public void delete(StudentNode profile){
//        relationDao.delete(profile);
//    }
//
//    public StudentNode findById(long id,int depth) {
//        Optional<StudentNode> optional =  relationDao.findById(id);
//        return  optional!= null ? optional.get() :null;
//    }
//
//    public List<StudentNode> getUserNodeList(){
//        return relationDao.getUserNodeList();
//    }
//
//    public Iterable<StudentNode> getUserNodeIterable(){
//        return relationDao.findAll();
//    }
}
