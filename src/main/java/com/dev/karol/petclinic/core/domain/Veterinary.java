package com.dev.karol.petclinic.core.domain;

import java.util.Objects;

public class Veterinary {
    String firstName;
    String lastName;
    String degree;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veterinary that = (Veterinary) o;
        return getFirstName().equals(that.getFirstName()) && getLastName().equals(that.getLastName()) && getDegree().equals(that.getDegree());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getDegree());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veterinary{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", degree='").append(degree).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
