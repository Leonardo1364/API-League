package com.apiexternal.league.service.mapper.request;

import com.apiexternal.league.model.entity.League;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;

public interface LeagueServiceRequestMapper {

    static League toEntity(LeagueServiceRequest leagueRequest) {
        if (leagueRequest == null) {
            return null;
        }
     return League.builder()
             .id(leagueRequest.getId())
             .name(leagueRequest.getName())
             .country(leagueRequest.getCountry())
             .build();
    }
}
