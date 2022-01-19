package com.apiexternal.league.contract.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LeagueControllerResponse {

    private Long id;

    private String name;

    private String country;
}
