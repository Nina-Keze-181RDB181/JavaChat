package com.example.javachat;

public class Message {
    private String text; // ziņojuma teksts
    private MemberData memberData; // ziņojuma sūtītāja dati
    private boolean belongsToCurrentUser; // pārbaude: ziņojums nav jāsūta sūtītāju atpakaļ

    public Message(String text, MemberData memberData, boolean belongsToCurrentUser) {
        this.text = text;
        this.memberData = memberData;
        this.belongsToCurrentUser = belongsToCurrentUser;
    }

    public String getText() {
        return text;
    }

    public MemberData getMemberData() {
        return memberData;
    }

    public boolean isBelongsToCurrentUser() {
        return belongsToCurrentUser;
    }
}