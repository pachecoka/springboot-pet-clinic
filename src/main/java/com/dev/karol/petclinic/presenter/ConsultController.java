package com.dev.karol.petclinic.presenter;

import com.dev.karol.petclinic.core.domain.Consult;
import com.dev.karol.petclinic.core.domain.Pet;
import com.dev.karol.petclinic.core.ports.input.IConsultManager;
import com.dev.karol.petclinic.core.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consults")
public class ConsultController implements  IConsultManager {

    ConsultService consultService;

    @Autowired
    public ConsultController(ConsultService consultService) {
        this.consultService = consultService;
    }

    @Override
    @GetMapping
    public List<Consult> getConsults() {
        return this.consultService.getConsults();
    }

    @Override
    public List<Consult> getConsults(Pet pet) {
        return null;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void scheduleConsult(@RequestBody Consult consult) {
        this.consultService.scheduleConsult(consult);
    }

    @Override
    public void rescheduleConsult(Consult consult) {

    }

    @Override
    public void cancelConsult(Consult consult) {

    }
}
