package com.apiexternal.league.contract.v1;

import com.apiexternal.league.contract.facade.league.LeagueControllerFacade;
import com.apiexternal.league.contract.model.request.LeagueControllerRequest;
import com.apiexternal.league.contract.model.response.LeagueControllerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/league")
public class LeagueController {

    private final LeagueControllerFacade facade;

    @PostMapping()
    @ResponseStatus(CREATED)
    public LeagueControllerResponse saveLeague(@RequestBody LeagueControllerRequest league) {
        return facade.saveLeague(league);
    }

    @PutMapping("/{id}")
    @ResponseStatus(OK)
    public LeagueControllerResponse updateLeague(@RequestBody LeagueControllerRequest league,
                                                 @PathVariable Long id) {
        return facade.updateLeague(league, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteLeague(@PathVariable Long id) {
        facade.deleteLeague(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public LeagueControllerResponse findLeague(@PathVariable Long id) {
        return facade.findLeague(id);
    }

    @GetMapping()
    @ResponseStatus(OK)
    public List<LeagueControllerResponse> findAllLeagues() {
        return facade.findAllLeagues();
    }
}
