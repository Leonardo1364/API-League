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

    private final LeagueControllerFacade controllerFacade;

    @PostMapping()
    @ResponseStatus(CREATED)
    public LeagueControllerResponse save(@RequestBody LeagueControllerRequest league) {
        return controllerFacade.save(league);
    }

    @PutMapping("/{id}")
    @ResponseStatus(OK)
    public LeagueControllerResponse update(@RequestBody LeagueControllerRequest league,
                                           @PathVariable Long id) {
        return controllerFacade.update(league, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void delete(@PathVariable Long id) {
        controllerFacade.delete(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(OK)
    public LeagueControllerResponse findById(@PathVariable Long id) {
        return controllerFacade.findById(id);
    }

    @GetMapping()
    @ResponseStatus(OK)
    public List<LeagueControllerResponse> findAll() {
        return controllerFacade.findAll();
    }
}
