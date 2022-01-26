package com.apiexternal.league.service.mapper.request;

import com.apiexternal.league.model.entity.LeagueEntity;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;

import java.util.Optional;

public class LeagueServiceRequestMapper {

    public static LeagueEntity toEntity(LeagueServiceRequest leagueRequest) {

         return Optional.ofNullable(leagueRequest)
                 .map(leagueServiceRequest -> LeagueEntity.builder()
                     .id(leagueRequest.getId())
                     .name(leagueRequest.getName())
                     .country(leagueRequest.getCountry())
                     .build())
                 .orElse(null);
        }
}
