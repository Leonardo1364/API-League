package com.apiexternal.league.contract.mapper.response;

import com.apiexternal.league.contract.model.response.LeagueControllerResponse;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;

import java.util.Optional;

public class LeagueControllerResponseMapper {

    public static LeagueControllerResponse toLeagueResponse(LeagueServiceResponse leagueResponse) {

        return Optional.ofNullable(leagueResponse)
                .map(leagueServiceResponse -> LeagueControllerResponse.builder()
                    .id(leagueResponse.getId())
                    .name(leagueResponse.getName())
                    .country(leagueResponse.getCountry())
                    .build())
                .orElse(null);
    }
}
