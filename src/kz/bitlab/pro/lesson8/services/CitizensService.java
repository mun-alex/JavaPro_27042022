package kz.bitlab.pro.lesson8.services;

import kz.bitlab.pro.lesson8.models.Citizen;

public class CitizensService {
    private static int index = 0;
    private static Citizen[] citizens = new Citizen[100];

    public static void addCitizen(Citizen citizen) {
        citizen.setId(index+1);
        citizens[index] = citizen;
        index++;
    }

    public static Citizen[] getAllCitizens() {
        return citizens;
    }
}
