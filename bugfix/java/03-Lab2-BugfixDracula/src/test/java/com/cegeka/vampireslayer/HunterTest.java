package com.cegeka.vampireslayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

class HunterTest {
    private Hunter hunter;

    @BeforeEach
    public void setup() {
        hunter = new Hunter();
    }

    @Test
    void canHunt_givenDayTime_thenCannotHunt() {
        LocalTime huntingTime = LocalTime.of(16, 1);

        assertThat(hunter.canHunt(huntingTime)).isFalse();
    }

    @Test
    void canHunt_givenNightTime_thenCanHunt() {
        LocalTime huntingTime = LocalTime.of(1, 1);

        assertThat(hunter.canHunt(huntingTime)).isTrue();
    }

    @Test
    void canHunt_givenNightTime_thenCanHuntAt6() {
        LocalTime huntingTime = LocalTime.of(6, 0);

        assertThat(hunter.canHunt(huntingTime)).isTrue();
    }

    @Test
    void canHunt_givenNightTime_thenCanHuntAtMidnight() {
        LocalTime huntingTime = LocalTime.of(0, 0);

        assertThat(hunter.canHunt(huntingTime)).isTrue();
    }


}
