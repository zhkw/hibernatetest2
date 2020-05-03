package com.mastertheboss.domain;

import java.util.HashSet;
import java.util.Set;

public class Address {
    private int id;
    private String postcode;
    private String location;
    private Set<Student> students = new HashSet<Student>();

    public Address() {
    }

    public Address(int id, String postcode, String location) {
        this.id = id;
        this.postcode = postcode;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", postcode='" + postcode + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
