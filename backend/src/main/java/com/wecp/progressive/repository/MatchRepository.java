package com.wecp.progressive.repository;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Match;
@Repository
public interface MatchRepository extends JpaRepository<Match,Long> {
}
