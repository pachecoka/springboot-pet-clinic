package com.dev.karol.petclinic.data;

import com.dev.karol.petclinic.core.domain.Consult;
import com.dev.karol.petclinic.core.ports.output.IConsultRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ConsultRepository implements IConsultRepository {

    HashMap<UUID, Consult> consults = new HashMap<>();

    @Override
    public void save(Consult consult) {
        consults.put(consult.getId(), consult);
    }

    @Override
    public void updateConsult(Consult consult) {
        consults.replace(consult.getId(), consult);
    }

    @Override
    public Consult findById(UUID id) {
        return consults.get(id);
    }

    @Override
    public List<Consult> findByPetName(String name) {
        return consults.values().stream().filter(
                consult -> consult.getPet().getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Consult> findAll() {
        return new ArrayList<>(consults.values());
    }
}
