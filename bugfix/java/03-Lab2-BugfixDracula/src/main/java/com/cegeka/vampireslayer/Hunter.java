package com.cegeka.vampireslayer;

import java.time.LocalTime;

public class Hunter {
    public boolean canHunt(LocalTime huntingTime) {
        int huntingHour = huntingTime.getHour();
        return huntingHour >= 0 && huntingHour <= 6;
    }
}
