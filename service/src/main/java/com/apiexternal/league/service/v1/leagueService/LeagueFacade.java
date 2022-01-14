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

    public LeagueServiceResponse saveLeague(LeagueServiceRequest league) {
        return leagueService.saveLeague(league);
    }

    public LeagueServiceResponse updateLeague(LeagueServiceRequest league, String id) {
        LeagueServiceResponse leagueId = leagueService.findLeague(id);
        return leagueService.updateLeague(league, leagueId.getId());
    }

    public void deleteLeague(String id) {
        leagueService.findLeague(id);
        leagueService.deleteLeague(id);
    }

    public LeagueServiceResponse findLeague(String id) {
        leagueService.findLeague(id);
        return leagueService.findLeague(id);
    }

    public List<LeagueServiceResponse> findAllLeagues() {
        return leagueService.findAllLeagues();
    }
}
