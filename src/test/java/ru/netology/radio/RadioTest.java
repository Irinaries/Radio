package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(8);

        int expected = 8;
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
    public void shouldNotSetStationNumberBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);


        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStationNumber() {
        Radio radio = new Radio();

        radio.maxCurrentStationNumber();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);

        radio.nextStationNumber();

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMoreMaxStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        radio.nextStationNumber();

        int expected = 1;
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
    public void shouldPrevMinStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prevStationNumber();

        int expected = 9;
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

        radio.setSoundVolume(49);
        radio.maxSoundVolume();

        int expected = 50;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setSoundVolume(100);

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(-1);

        int expected = 0;
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
    public void shouldMoreMaxSoundVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.moreSoundVolume();

        int expected = 1;
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

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setSoundVolume(6);
        radio.decreaseVolume();

        int expected = 5;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio();

        radio.setSoundVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
