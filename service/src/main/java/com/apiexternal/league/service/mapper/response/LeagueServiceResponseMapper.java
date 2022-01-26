package com.apiexternal.league.service.mapper.response;

import com.apiexternal.league.model.entity.LeagueEntity;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;

import java.util.Optional;

public class LeagueServiceResponseMapper {

    public static LeagueServiceResponse toResponse(LeagueEntity leagueResponse) {

        return Optional.ofNullable(leagueResponse)
                .map(leagueEntity -> LeagueServiceResponse.builder()
                .id(leagueResponse.getId())
                .name(leagueResponse.getName())
                .country(leagueResponse.getCountry())
                .build())
                .orElse(null);
    }
}
