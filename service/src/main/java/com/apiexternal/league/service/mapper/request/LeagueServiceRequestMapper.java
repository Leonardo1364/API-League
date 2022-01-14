package com.apiexternal.league.service.mapper.request;

import com.apiexternal.league.model.entity.League;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;

public interface LeagueServiceRequestMapper {

    static League toLeagueEntity(LeagueServiceRequest leagueRequest) {
        if (leagueRequest == null) {
            return null;
        }
     return League.builder()
             .id(leagueRequest.getId())
             .league(leagueRequest.getLeague())
             .country(leagueRequest.getCountry())
             .build();
    }
}
