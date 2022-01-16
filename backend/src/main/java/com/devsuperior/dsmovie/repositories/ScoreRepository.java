package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.emtities.Score;
import com.devsuperior.dsmovie.emtities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score,ScorePK> {

}
