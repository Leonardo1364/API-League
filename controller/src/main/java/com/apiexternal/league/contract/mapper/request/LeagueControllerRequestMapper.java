package com.apiexternal.league.contract.mapper.request;

import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;

import java.util.Optional;

public class LeagueControllerRequestMapper {

    public static LeagueServiceRequest toServiceWithId(LeagueControllerRequest leagueRequest, Long id) {

        return Optional.ofNullable(leagueRequest)
                .map(leagueControllerRequest -> LeagueServiceRequest.builder()
                    .id(id)
                    .name(leagueRequest.getName())
                    .country(leagueRequest.getCountry())
                    .build())
                .orElse(null);
    }

    public static LeagueServiceRequest toServiceWithoutId(LeagueControllerRequest leagueRequest) {

            return Optional.ofNullable(leagueRequest)
                    .map(leagueControllerRequest -> LeagueServiceRequest.builder()
                        .name(leagueRequest.getName())
                        .country(leagueRequest.getCountry())
                        .build())
                    .orElse(null);
    }
}
