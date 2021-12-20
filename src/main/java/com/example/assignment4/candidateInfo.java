package com.example.assignment4;
public class candidateInfo {
     String name;
    String CNIC;
    Political_Party_Name candidateParty;

    public candidateInfo(String n, String C, Political_Party_Name c_Party) {
        name = n;
        CNIC = C;
        candidateParty = c_Party;
    }
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String C) {
        CNIC = C;
    }

    public Political_Party_Name getCandidateParty() {
        return candidateParty;
    }

    public void setCandidateParty(Political_Party_Name c_Party) {
        candidateParty = c_Party;
    }
}


