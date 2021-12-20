package com.example.assignment4;

public class Political_Party_Name {
    String partyName;
    String partyHead;
    String partySymbol;


    public Political_Party_Name(String p_Name, String p_Head, String electoral_Symbol) {
        partyName = p_Name;
        partyHead = p_Head;
        partySymbol = electoral_Symbol;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String p_Name) {
        partyName = p_Name;
    }

    public String getPartyHead() {
        return partyHead;
    }

    public void setPartyHead(String p_Head) {
        partyHead = p_Head;
    }

    public String getPartySymbol() {
        return partySymbol;
    }

    public void setPartySymbol(String electoral_Symbol) {
        partySymbol = electoral_Symbol;
    }
}


