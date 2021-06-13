package com.dev.karol.petclinic.core.service;

import com.dev.karol.petclinic.core.domain.Consult;
import com.dev.karol.petclinic.core.ports.output.IConsultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultService {

    IConsultRepository consultRepository;

    @Autowired
    public ConsultService(IConsultRepository consultRepository) {
        this.consultRepository = consultRepository;
    }

    public List<Consult> getConsults(){
        return this.consultRepository.getConsults();
    }

    public void scheduleConsult(Consult consult){
        this.consultRepository.addConsult(consult);
    }
}
