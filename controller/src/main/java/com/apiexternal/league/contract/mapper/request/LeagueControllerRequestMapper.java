package com.apiexternal.league.contract.mapper.request;

import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;

public interface LeagueControllerRequestMapper {

    static LeagueServiceRequest toLeagueService(LeagueControllerRequest leagueRequest) {
        if (leagueRequest == null) {
            return null;
        }

        return LeagueServiceRequest.builder()
                .id(leagueRequest.getId())
                .league(leagueRequest.getLeague())
                .country(leagueRequest.getCountry())
                .build();
    }
}
