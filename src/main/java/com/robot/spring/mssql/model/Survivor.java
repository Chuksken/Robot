package com.robot.spring.mssql.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_survivors")
public class Survivor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String water;
    private String food;
    private String medication;
    private String ammunition;
    private String age;
    private String gender;
    private String latitude;
    private String longitude;
    private String location;
    private String infectionstatus;
    private int infectionReport;

    public Survivor() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public int getInfectionReport() {
        return infectionReport;
    }

    public void setInfectionReport(int infectionReport) {
        this.infectionReport = infectionReport;
    }

    public String getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(String ammunition) {
        this.ammunition = ammunition;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInfectionstatus() {
        return infectionstatus;
    }

    public void setInfectionstatus(String infectionstatus) {
        this.infectionstatus = infectionstatus;
    }


    public Survivor(int infectionReport, String name, String water, String food, String medication, String ammunition, String age, String gender, String latitude, String longitude, String location, String infectionstatus) {
       this.infectionReport = infectionReport;
        this.name = name;
        this.water = water;
        this.food = food;
        this.medication = medication;
        this.ammunition = ammunition;
        this.age = age;
        this.gender = gender;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location = location;
        this.infectionstatus = infectionstatus;
    }
}
