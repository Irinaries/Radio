package ru.netology.radio;

public class Radio {
    private int currentStationNumber;


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {

        if (newCurrentStationNumber > 9) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public void nextStationNumber() {
        if (currentStationNumber >= 9) {
            return;
        }
        currentStationNumber = currentStationNumber + 1;
    }

    public void prevStationNumber() {
        if (currentStationNumber <= 0) {
            return;
        }
        currentStationNumber = currentStationNumber - 1;
    }

    private int soundVolume;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume >= 100) {
            return;
        }
        if (newSoundVolume <= 0) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void maxSoundVolume(int newSoundVolume) {
        if (soundVolume == 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void moreSoundVolume() {
        if (soundVolume >= 100) {
            return;
        }

        soundVolume = soundVolume + 1;

    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            return;
        }
        soundVolume = soundVolume + 1;

    }
}