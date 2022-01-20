package com.apiexternal.league.service.v1.leagueService;

import com.apiexternal.league.service.model.request.LeagueServiceRequest;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class LeagueFacade {

    private LeagueService leagueService;

    public LeagueServiceResponse save(LeagueServiceRequest league) {
        return leagueService.save(league);
    }

    public LeagueServiceResponse update(LeagueServiceRequest league) {
        return leagueService.update(league);
    }

    public void delete(Long id) {
        leagueService.findById(id);
        leagueService.delete(id);
    }

    public LeagueServiceResponse findById(Long id) {
        leagueService.findById(id);
        return leagueService.findById(id);
    }

    public List<LeagueServiceResponse> findAll() {
        return leagueService.findAll();
    }
}
