package com.apiexternal.league.contract.facade.league;

import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.contract.model.response.LeagueControllerResponse;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface LeagueControllerFacade {

    LeagueControllerResponse saveLeague(LeagueControllerRequest league);

    LeagueControllerResponse updateLeague(LeagueControllerRequest league, String id);

    void deleteLeague(String id);

    LeagueControllerResponse findLeague(String id);

    List<LeagueControllerResponse> findAllLeagues();
}
