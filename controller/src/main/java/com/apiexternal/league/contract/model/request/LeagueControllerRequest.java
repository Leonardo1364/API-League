package com.apiexternal.league.contract.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LeagueControllerRequest {

    private String id;
    private String league;
    private String country;
}
