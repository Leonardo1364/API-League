package com.apiexternal.league.contract.facade.league;

import com.apiexternal.league.contract.mapper.response.LeagueControllerResponseMapper;
import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.contract.model.response.LeagueControllerResponse;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;
import com.apiexternal.league.service.v1.leagueService.LeagueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.apiexternal.league.contract.mapper.request.LeagueControllerRequestMapper.toServiceWithId;
import static com.apiexternal.league.contract.mapper.request.LeagueControllerRequestMapper.toServiceWithoutId;
import static com.apiexternal.league.contract.mapper.response.LeagueControllerResponseMapper.toLeagueResponse;

@AllArgsConstructor
@Component
public class LeagueControllerFacadeImpl implements LeagueControllerFacade{

    private final LeagueService facade;

    public LeagueControllerResponse save(LeagueControllerRequest league) {
        LeagueServiceResponse leagueResponse = facade.save(toServiceWithoutId(league));
        return toLeagueResponse(leagueResponse);
    }

    public LeagueControllerResponse update(LeagueControllerRequest league, Long id) {
        LeagueServiceResponse leagueResponse = facade.update(toServiceWithId(league, id));
        return toLeagueResponse(leagueResponse);
    }

    public void delete(Long id) {
        facade.delete(id);
    }

    public LeagueControllerResponse findById(Long id) {
        LeagueServiceResponse leagueFind = facade.findById(id);
        return toLeagueResponse(leagueFind);
    }

    public List<LeagueControllerResponse> findAll() {
        return facade.findAll().stream()
                .map(LeagueControllerResponseMapper::toLeagueResponse)
                .toList();
    }
}
