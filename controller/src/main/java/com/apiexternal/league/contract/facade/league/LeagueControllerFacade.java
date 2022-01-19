package com.apiexternal.league.contract.facade.league;

import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.contract.model.response.LeagueControllerResponse;

import java.util.List;

public interface LeagueControllerFacade {

    LeagueControllerResponse saveLeague(LeagueControllerRequest league);

    LeagueControllerResponse updateLeague(LeagueControllerRequest league, Long id);

    void deleteLeague(Long id);

    LeagueControllerResponse findLeague(Long id);

    List<LeagueControllerResponse> findAllLeagues();
}
