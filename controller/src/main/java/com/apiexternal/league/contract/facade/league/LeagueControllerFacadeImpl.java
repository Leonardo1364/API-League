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

import static com.apiexternal.league.contract.mapper.request.LeagueControllerRequestMapper.toLeagueServiceWithId;
import static com.apiexternal.league.contract.mapper.request.LeagueControllerRequestMapper.toLeagueServiceWithoutId;
import static com.apiexternal.league.contract.mapper.response.LeagueControllerResponseMapper.toLeagueResponse;

@AllArgsConstructor
@Component
public class LeagueControllerFacadeImpl implements LeagueControllerFacade{

    private final LeagueService facade;

    public LeagueControllerResponse saveLeague(LeagueControllerRequest league) {
        LeagueServiceResponse leagueResponse = facade.saveLeague(toLeagueServiceWithoutId(league));
        return toLeagueResponse(leagueResponse);
    }

    public LeagueControllerResponse updateLeague(LeagueControllerRequest league, Long id) {
        LeagueServiceResponse leagueResponse = facade.updateLeague(toLeagueServiceWithId(league, id));
        return toLeagueResponse(leagueResponse);
    }

    public void deleteLeague(Long id) {
        facade.deleteLeague(id);
    }

    public LeagueControllerResponse findLeague(Long id) {
        LeagueServiceResponse leagueFind = facade.findLeague(id);
        return toLeagueResponse(leagueFind);
    }

    public List<LeagueControllerResponse> findAllLeagues() {
        return facade.findAllLeagues().stream()
                .map(LeagueControllerResponseMapper::toLeagueResponse)
                .toList();
    }
}
