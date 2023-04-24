package com.example.child;

import java.time.LocalDate;
import java.time.LocalDate;

public class Child {
    private String name;
    private String placeOfBirth;
    private String registrationNumber;
    private LocalDate dateOfBirth;
    private String gender;
    private double weight;
    private String motherName;
    private int motherAge;
    private String motherOccupation;
    private String motherMaritalStatus;
    private int id;

    public Child() {
    }

    public Child(String name, String placeOfBirth, String registrationNumber, LocalDate dateOfBirth,
                 String gender, double weight, String motherName, int motherAge,
                 String motherOccupation, String motherMaritalStatus) {
        this.name = name;
        this.placeOfBirth = placeOfBirth;
        this.registrationNumber = registrationNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.weight = weight;
        this.motherName = motherName;
        this.motherAge = motherAge;
        this.motherOccupation = motherOccupation;
        this.motherMaritalStatus = motherMaritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getMotherAge() {
        return motherAge;
    }

    public void setMotherAge(int motherAge) {
        this.motherAge = motherAge;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public String getMotherMaritalStatus() {
        return motherMaritalStatus;
    }

    public void setMotherMaritalStatus(String motherMaritalStatus) {
        this.motherMaritalStatus = motherMaritalStatus;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", motherName='" + motherName + '\'' +
                ", motherAge=" + motherAge +
                ", motherOccupation='" + motherOccupation + '\'' +
                ", motherMaritalStatus='" + motherMaritalStatus + '\'' +
                '}';
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
