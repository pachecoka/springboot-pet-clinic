package com.dev.karol.petclinic.data;

import com.dev.karol.petclinic.core.domain.Consult;
import com.dev.karol.petclinic.core.ports.output.IConsultRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class ConsultRepository implements IConsultRepository {

    HashMap<UUID, Consult> consults = new HashMap<>();

    @Override
    public void addConsult(Consult consult) {
        consults.put(consult.getId(), consult);
    }

    @Override
    public void updateConsult(Consult consult) {
        consults.replace(consult.getId(), consult);
    }

    @Override
    public Consult getConsult(UUID id) {
        return consults.get(id);
    }

    @Override
    public List<Consult> getConsults() {
        return new ArrayList<>(consults.values());
    }
}
