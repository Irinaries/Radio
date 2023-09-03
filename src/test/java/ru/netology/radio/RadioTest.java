package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationNumber() {
        Radio radio = new Radio(9);

        radio.setCurrentStationNumber(5);

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(8, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNotSetStationNumberAboveMax() {
        Radio radio = new Radio(10);

        radio.setCurrentStationNumber(10);

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNotSetStationNumberBelowMin() {
        Radio radio = new Radio(9);

        radio.setCurrentStationNumber(-1);

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(8, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldSetMaxStationNumber() {
        Radio radio = new Radio(0);
        radio.setCurrentStationNumber(8);

        radio.maxCurrentStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(-1, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumber() {
        Radio radio = new Radio(10);

        radio.setCurrentStationNumber(5);
        radio.nextStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextMoreMaxStationNumber() {
        Radio radio = new Radio(10);

        radio.setCurrentStationNumber(9);
        radio.nextStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }


    @Test
    public void shouldPrevStationNumber() {
        Radio radio = new Radio(10);

        radio.setCurrentStationNumber(7);
        radio.prevStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevMinStationNumber() {
        Radio radio = new Radio(10);

        radio.setCurrentStationNumber(7);
        radio.prevStationNumber();

        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(6, radio.getCurrentStationNumber());
    }


    @Test
    public void shouldSetSoundVolume() {
        Radio radio = new Radio(10);

        radio.setSoundVolume(54);

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(10, radio.getMaxSoundVolume());
        Assertions.assertEquals(54, radio.getSoundVolume());
    }

    @Test
    public void shouldSetMaxSoundVolume() {
        Radio radio = new Radio(54);

        radio.setSoundVolume(54);
        radio.maxSoundVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(54, radio.getMaxSoundVolume());
        Assertions.assertEquals(55, radio.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio radio = new Radio(100);

        radio.setSoundVolume(0);

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(100, radio.getMaxSoundVolume());
        Assertions.assertEquals(0, radio.getSoundVolume());
    }

    @Test
    public void shouldNotSetSoundVolumeBelowMin() {
        Radio radio = new Radio(1);

        radio.setSoundVolume(0);

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(1, radio.getMaxSoundVolume());
        Assertions.assertEquals(0, radio.getSoundVolume());
    }


    @Test
    public void shouldMoreSoundVolume() {
        Radio radio = new Radio(100);

        radio.setSoundVolume(0);
        radio.moreSoundVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(100, radio.getMaxSoundVolume());
        Assertions.assertEquals(+1, radio.getSoundVolume());
    }

    @Test
    public void shouldMoreMaxSoundVolume() {
        Radio radio = new Radio(49);

        radio.setSoundVolume(0);
        radio.moreSoundVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(49, radio.getMaxSoundVolume());
        Assertions.assertEquals(+1, radio.getSoundVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(99);

        radio.setSoundVolume(0);
        radio.increaseVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(99, radio.getMaxSoundVolume());
        Assertions.assertEquals(+1, radio.getSoundVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio(7);

        radio.setSoundVolume(5);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(7, radio.getMaxSoundVolume());
        Assertions.assertEquals(4, radio.getSoundVolume());
    }


    @Test
    public void shouldDecreaseVolumeMin() {
        Radio radio = new Radio(99);

        radio.setSoundVolume(0);
        radio.decreaseVolume();

        Assertions.assertEquals(0, radio.getMinSoundVolume());
        Assertions.assertEquals(99, radio.getMaxSoundVolume());
        Assertions.assertEquals(0, radio.getSoundVolume());
    }

    //

    @Test
    public void test() {
        Radio radio = new Radio(9, 0);
        Assertions.assertEquals(9, radio.getMaxCurrentStationNumber());
        Assertions.assertEquals(0, radio.getMinCurrentStationNumber());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }



    @Test
    public void shouldCreateStationsWithLimits() {
        Radio radio = new Radio(1);
        Assertions.assertEquals(0, radio.getMaxCurrentStationNumber());

        Radio radio1 = new Radio(100);
        Assertions.assertEquals(99, radio1.getMaxCurrentStationNumber());

        Radio radio2 = new Radio(10);
        Assertions.assertEquals(0, radio2.getMinCurrentStationNumber());
    }
}