package com.dev.karol.petclinic.core.service;

import com.dev.karol.petclinic.core.domain.Consult;
import com.dev.karol.petclinic.core.exceptions.ConsultNotFoundException;
import com.dev.karol.petclinic.core.ports.output.IConsultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ConsultService {

    IConsultRepository consultRepository;

    @Autowired
    public ConsultService(IConsultRepository consultRepository) {
        this.consultRepository = consultRepository;
    }

    public List<Consult> getConsults(){
        return this.consultRepository.findAll();
    }

    public List<Consult> getConsults(String name){
        return this.consultRepository.findByPetName(name);
    }

    public void scheduleConsult(Consult consult){
        this.consultRepository.save(consult);
    }

    public void cancelConsult(UUID id){
        this.consultRepository.findById(id).orElseThrow(() ->
                new ConsultNotFoundException("No consult found for id: "+id));
        this.consultRepository.deleteById(id);
    }
}
