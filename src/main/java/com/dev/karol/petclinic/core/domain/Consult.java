package com.dev.karol.petclinic.core.domain;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Consult {

    UUID id;
    Pet pet;
    Veterinary veterinary;
    Date date;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinary getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(Veterinary veterinary) {
        this.veterinary = veterinary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consult consult = (Consult) o;
        return getId().equals(consult.getId()) && getPet().equals(consult.getPet()) && getVeterinary().equals(consult.getVeterinary()) && getDate().equals(consult.getDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPet(), getVeterinary(), getDate());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Consult{");
        sb.append("id=").append(id);
        sb.append(", pet=").append(pet);
        sb.append(", veterinary=").append(veterinary);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
