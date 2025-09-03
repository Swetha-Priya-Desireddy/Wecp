package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Match;

public interface MatchRepository extends JpaRepository<Match,Long> {
}
