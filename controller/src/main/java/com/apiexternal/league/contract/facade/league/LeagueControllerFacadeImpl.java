package com.apiexternal.league.contract.facade.league;

import com.apiexternal.league.contract.mapper.response.LeagueControllerResponseMapper;
import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.contract.model.response.LeagueControllerResponse;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;
import com.apiexternal.league.service.v1.leagueService.LeagueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.apiexternal.league.contract.mapper.request.LeagueControllerRequestMapper.toLeagueService;
import static com.apiexternal.league.contract.mapper.response.LeagueControllerResponseMapper.toLeagueResponse;

@AllArgsConstructor
@Component
public class LeagueControllerFacadeImpl implements LeagueControllerFacade{

    private final LeagueService facade;

    public LeagueControllerResponse saveLeague(LeagueControllerRequest league) {
        LeagueServiceRequest leagueSave = toLeagueService(league);
        LeagueServiceResponse leagueResponse = facade.saveLeague(leagueSave);
        return toLeagueResponse(leagueResponse);
    }

    public LeagueControllerResponse updateLeague(LeagueControllerRequest league, String id) {
        LeagueServiceRequest leagueUpdate = toLeagueService(league);
        LeagueServiceResponse leagueResponse = facade.updateLeague(leagueUpdate, id);
        return toLeagueResponse(leagueResponse);
    }

    public void deleteLeague(String id) {
        facade.deleteLeague(id);
    }

    public LeagueControllerResponse findLeague(String id) {
        LeagueServiceResponse leagueFind = facade.findLeague(id);
        return toLeagueResponse(leagueFind);
    }

    public List<LeagueControllerResponse> findAllLeagues() {
        return facade.findAllLeagues().stream()
                .map(LeagueControllerResponseMapper::toLeagueResponse)
                .toList();
    }
}
