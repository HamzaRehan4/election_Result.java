package com.example.assignment4;

public class Presiding_Officer {
    private String name;
    private String ECP_Login_Pin;
    private String CNIC;


    public String getName() {
        return name;
    }

    public String getECP_Login_Pin() {
        return ECP_Login_Pin;
    }

    public Presiding_Officer(String n, String E_L_P, String C) {
        name = n;
        ECP_Login_Pin = E_L_P;
        CNIC = C;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setECP_Login_Pin(String ECP_Login_Pin) {
        this.ECP_Login_Pin = ECP_Login_Pin;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String C) {
        CNIC = C;
    }
}
