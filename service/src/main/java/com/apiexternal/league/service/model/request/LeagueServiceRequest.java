package com.apiexternal.league.service.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LeagueServiceRequest {

    private Long id;

    private String name;

    private String country;
}
