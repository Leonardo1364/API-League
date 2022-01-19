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

    private Long id;

    private String name;

    private String country;
}
