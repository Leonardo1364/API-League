package com.apiexternal.league.service.v1.leagueService;

import com.apiexternal.league.exceptions.notfound.NotFoundException;
import com.apiexternal.league.model.entity.LeagueEntity;
import com.apiexternal.league.repository.LeagueRepository;
import com.apiexternal.league.service.mapper.response.LeagueServiceResponseMapper;
import com.apiexternal.league.service.model.request.LeagueServiceRequest;
import com.apiexternal.league.service.model.response.LeagueServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.apiexternal.league.service.mapper.request.LeagueServiceRequestMapper.toEntity;
import static com.apiexternal.league.service.mapper.response.LeagueServiceResponseMapper.toResponse;

@AllArgsConstructor
@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    public LeagueServiceResponse save(LeagueServiceRequest league) {
        LeagueEntity leagueResponse = leagueRepository.save(toEntity(league));
        return toResponse(leagueResponse);
    }

    public LeagueServiceResponse update(LeagueServiceRequest league) {
        LeagueEntity leagueSave = leagueRepository.save(toEntity(league));
        return toResponse(leagueSave);
    }

    public void delete(Long id) {
        leagueRepository.deleteById(id);
    }

    public LeagueServiceResponse findById(Long id) {
        LeagueEntity league = leagueRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return toResponse(league);
    }

    public List<LeagueServiceResponse> findAll() {
        return leagueRepository.findAll().stream()
                .map(LeagueServiceResponseMapper::toResponse)
                .toList();
    }
}
