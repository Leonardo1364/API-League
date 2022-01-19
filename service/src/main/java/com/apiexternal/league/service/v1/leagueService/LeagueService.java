package com.apiexternal.league.service.v1.leagueService;

import com.apiexternal.league.exceptions.notfound.NotFoundException;
import com.apiexternal.league.model.entity.League;
import com.apiexternal.league.repository.LeagueRepository;
import com.apiexternal.league.service.mapper.response.LeagueServiceResponseMapper;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.apiexternal.league.service.mapper.request.LeagueServiceRequestMapper.toLeagueEntity;
import static com.apiexternal.league.service.mapper.response.LeagueServiceResponseMapper.toLeagueResponse;

@AllArgsConstructor
@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    public LeagueServiceResponse saveLeague(LeagueServiceRequest league) {
        League leagueResponse = leagueRepository.save(toLeagueEntity(league));
        return toLeagueResponse(leagueResponse);
    }

    public LeagueServiceResponse updateLeague(LeagueServiceRequest league) {
        League leagueSave = leagueRepository.save(toLeagueEntity(league));
        return toLeagueResponse(leagueSave);
    }

    public void deleteLeague(Long id) {
        leagueRepository.deleteById(id);
    }

    public LeagueServiceResponse findLeague(Long id) throws NotFoundException {
        League league = leagueRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return toLeagueResponse(league);
    }

    public List<LeagueServiceResponse> findAllLeagues() {
        return leagueRepository.findAll().stream()
                .map(LeagueServiceResponseMapper::toLeagueResponse)
                .toList();
    }
}
