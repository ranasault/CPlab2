package com.example.mandlab2;

public class Appointment {
    private  int id;
    private String name;
    private String doctor;
    private int room;


    public Appointment(int id, String name, String doctor, int room) {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
        this.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}


