package com.dev.karol.petclinic.core.ports.output;

import com.dev.karol.petclinic.core.domain.Consult;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IConsultRepository {
    public void save(Consult consult);
    public void updateConsult(Consult consult);
    public Optional<Consult> findById(UUID id);
    public List<Consult> findByPetName(String name);
    public List<Consult> findAll();
    public void deleteById(UUID id);
}
