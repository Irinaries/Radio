package ru.netology.radio;

public class Radio {
    private int currentStationNumber;
    private int soundVolume;


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }


    public int getSoundVolume() {
        return soundVolume;
    }


    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber >= 9) {
            return;
        }
        if (newCurrentStationNumber < 0) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
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

    public void maxCurrentStationNumber() {
        currentStationNumber = 9;
    }


    public void nextStationNumber() {
        if (currentStationNumber >= 9) {
            return;
        }
         if   (currentStationNumber == 0) {
            return;
        }
            currentStationNumber = currentStationNumber + 1;




    }


    public void prevStationNumber() {
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
            return;
        }
        currentStationNumber = currentStationNumber - 1;

    }


    public void maxSoundVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }

    public void moreSoundVolume() {
        if (soundVolume < 100) {
            soundVolume = soundVolume + 1;
        }
    }


    public void increaseVolume() {
        if (soundVolume <= 100) {
            soundVolume++;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}













