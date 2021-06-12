package com.dev.karol.petclinic.core.ports.output;

import com.dev.karol.petclinic.core.domain.Consult;

import java.util.List;

public interface IConsultRepository {
    public void addConsult(Consult consult);
    public void updateConsult(Consult consult);
    public Consult getConsult(Integer id);
    public List<Consult> getConsults();
}
