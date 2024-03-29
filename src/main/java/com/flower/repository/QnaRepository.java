package com.flower.repository;

import com.flower.entity.Qna;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface QnaRepository extends JpaRepository<Qna, Long> , QuerydslPredicateExecutor<Qna>, BoardRepositoryCustom{


    @Modifying
    @Query("update Qna n set n.hits = n.hits + 1 where n.id = :id")
    int updateHits(Long id);
}
