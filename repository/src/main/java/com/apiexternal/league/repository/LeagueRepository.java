package com.apiexternal.league.repository;

import com.apiexternal.league.model.entity.League;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends MongoRepository<League, String> {
}
