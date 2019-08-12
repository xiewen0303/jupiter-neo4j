package com.neo4j.demo.dao;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BaseDao<T> extends Neo4jRepository<T, Long> {

    <S extends T> S save(S s, int depth);

    <S extends T> Iterable<S> save(Iterable<S> entities, int depth);

//    T findOne(Long id, int depth);

//    Iterable<T> findAll();
//
//    Iterable<T> findAll(int depth);
//
//    Iterable<T> findAll(Sort sort);
//
//    Iterable<T> findAll(Sort sort, int depth);
//
//    Iterable<T> findAll(Iterable<Long> ids);
//
//    Iterable<T> findAll(Iterable<Long> ids, int depth);
//
//    Iterable<T> findAll(Iterable<Long> ids, Sort sort);
//
//    Iterable<T> findAll(Iterable<Long> ids, Sort sort, int depth);

//    /**
//     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
//     * {@link Page#getTotalPages()} returns an estimation of the total number of pages and should not be relied upon for accuracy.
//     *
//     * @param pageable
//     * @return a page of entities
//     */
//    Page<T> findAll(Pageable pageable);
//
//    /**
//     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
//     * {@link Page#getTotalPages()} returns an estimation of the total number of pages and should not be relied upon for accuracy.
//     *
//     * @param pageable
//     * @param depth
//     * @return a page of entities
//     */
//    Page<T> findAll(Pageable pageable, int depth);
}