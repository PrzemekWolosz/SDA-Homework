package com.company.ZadanieWesele;

public class Invitation {
    private String name;
    private String surname;
    InvitationType invitationType;

    public Invitation(String name, String surname, InvitationType invitationType) {
        this.name = name;
        this.surname = surname;
        this.invitationType = invitationType;
    }

    @Override
    public String toString() {
        return "\n" + name +
                "\n" + surname +
                "\n" + invitationType + "\n";
    }
}
