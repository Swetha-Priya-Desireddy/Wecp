package com.wecp.progressive.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Cricketer;
@Repository
public interface CricketerRepository extends JpaRepository<Cricketer,Integer>{
    Cricketer findByCricketerId(int cricketerId);
    List<Cricketer>findByTeam_TeamId(int teamId);
    @Modifying
    @Transactional
    @Query("delete from Cricketer c where c.team.teamId = :teamId")
    void deleteByTeamId(@Param("teamId")int teamId);
}
