package com.expTrackHibernate.expTrackHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.expTrackHibernate.expTrackHibernate.entity.Income;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface IncomesRepository extends JpaRepository<Income, Integer> {
    
    @Modifying
    @Query("DELETE FROM Income WHERE title=:title") // NOTE :::: Use Entity/Class name in query, rather than using the table name
    int deleteByTitle(@Param("title") String title);
    
}
