package com.neo4j.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories(basePackages = "com.neo4j.demo.dao")   //Neo4j扫描Repositories所在包，理解为mybatis扫描mapper包
@EnableTransactionManagement // 激活SDN隐式事务
public class Neo4jConfig {

}
