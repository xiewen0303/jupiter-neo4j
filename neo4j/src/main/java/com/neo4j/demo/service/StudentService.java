package com.neo4j.demo.service;

import com.neo4j.demo.dao.StudentDao;
import com.neo4j.demo.entity.StudentNode;
import com.neo4j.demo.entity.UserNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentService {

    @Resource
    private StudentDao studentDao;

    public StudentNode save(StudentNode profile){
        return studentDao.save(profile);
    }

    public void delete(StudentNode profile){
        studentDao.delete(profile);
    }

    public StudentNode findById(long id,int depth) {
        Optional<StudentNode> optional =  studentDao.findById(id);
        return  optional!= null ? optional.get() :null;
    }

    public List<StudentNode> getUserNodeList(){
        return studentDao.getUserNodeList();
    }

    public Iterable<StudentNode> getUserNodeIterable(){
        return studentDao.findAll();
    }
}
