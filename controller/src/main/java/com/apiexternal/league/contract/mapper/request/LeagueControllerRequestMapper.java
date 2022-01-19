package com.apiexternal.league.contract.mapper.request;

import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;

public interface LeagueControllerRequestMapper {

    static LeagueServiceRequest toLeagueServiceWithId(LeagueControllerRequest leagueRequest, Long id) {
        if (leagueRequest == null && id == null) {
            return null;
        }

        return LeagueServiceRequest.builder()
                .id(id)
                .name(leagueRequest.getName())
                .country(leagueRequest.getCountry())
                .build();
    }

    static LeagueServiceRequest toLeagueServiceWithoutId(LeagueControllerRequest leagueRequest) {
        if (leagueRequest == null) {
            return null;
        }

            return LeagueServiceRequest.builder()
                    .name(leagueRequest.getName())
                    .country(leagueRequest.getCountry())
                    .build();
    }
}
