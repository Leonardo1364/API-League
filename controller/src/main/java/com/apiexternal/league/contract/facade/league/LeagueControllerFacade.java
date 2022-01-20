package com.apiexternal.league.contract.facade.league;

import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.contract.model.response.LeagueControllerResponse;

import java.util.List;

public interface LeagueControllerFacade {

    LeagueControllerResponse save(LeagueControllerRequest league);

    LeagueControllerResponse update(LeagueControllerRequest league, Long id);

    void delete(Long id);

    LeagueControllerResponse findById(Long id);

    List<LeagueControllerResponse> findAll();
}
