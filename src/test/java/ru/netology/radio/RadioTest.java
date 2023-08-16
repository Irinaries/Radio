package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(6);

        radio.nextStationNumber();

        int expected = 7;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(4);

        radio.prevStationNumber();

        int expected = 3;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetSoundVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(49);

        int expected = 49;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxSoundVolume() {
        Radio radio = new Radio();

        radio.maxSoundVolume(100);

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(49);
        radio.moreSoundVolume();

        int expected = 50;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(8);
        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
