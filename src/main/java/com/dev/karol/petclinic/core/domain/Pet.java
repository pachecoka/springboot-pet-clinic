package com.dev.karol.petclinic.core.domain;

import java.util.Date;
import java.util.Objects;

public class Pet {
    String name;
    Date birthDate;
    String ownerFirstName;
    String ownerLastName;
    Specie specie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public Specie getSpecie() {
        return specie;
    }

    public void setSpecie(Specie specie) {
        this.specie = specie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return getName().equals(pet.getName()) && Objects.equals(getBirthDate(), pet.getBirthDate()) && getOwnerFirstName().equals(pet.getOwnerFirstName()) && Objects.equals(getOwnerLastName(), pet.getOwnerLastName()) && getSpecie() == pet.getSpecie();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirthDate(), getOwnerFirstName(), getOwnerLastName(), getSpecie());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", ownerFirstName='").append(ownerFirstName).append('\'');
        sb.append(", ownerLastName='").append(ownerLastName).append('\'');
        sb.append(", specie=").append(specie);
        sb.append('}');
        return sb.toString();
    }
}
