package com.dev.karol.petclinic.core.ports.input;

import com.dev.karol.petclinic.core.domain.Consult;

import java.util.List;

public interface IConsultManager {
    public List<Consult> getConsults();
    public List<Consult> getConsults(String petName);
    public void scheduleConsult(Consult consult);
    public void rescheduleConsult(Consult consult);
    public void cancelConsult(Consult consult);
}
