package com.apiexternal.league.service.mapper.response;

import com.apiexternal.league.model.entity.League;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;

public interface LeagueServiceResponseMapper {

    static LeagueServiceResponse toLeagueResponse(League leagueResponse) {
        if (leagueResponse == null) {
            return null;
        }

        return LeagueServiceResponse.builder()
                .id(leagueResponse.getId())
                .league(leagueResponse.getLeague())
                .country(leagueResponse.getCountry())
                .build();
    }
}
