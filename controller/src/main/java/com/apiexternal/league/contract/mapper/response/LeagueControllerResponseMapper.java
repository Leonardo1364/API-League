package com.apiexternal.league.contract.mapper.response;

import com.apiexternal.league.contract.model.response.LeagueControllerResponse;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;

public interface LeagueControllerResponseMapper {

    static LeagueControllerResponse toLeagueResponse(LeagueServiceResponse leagueResponse) {
        if (leagueResponse == null) {
            return null;
        }

        return LeagueControllerResponse.builder()
                .id(leagueResponse.getId())
                .name(leagueResponse.getName())
                .country(leagueResponse.getCountry())
                .build();
    }
}
