package ru.netology;

public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentRadioStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prevRadioStation() {
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void inputNomerRadioStation(int nomerRadioStation) {
        if (nomerRadioStation > maxRadioStation) {
            return;
        }
        if (nomerRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = nomerRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void decreaseSoundVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void increaseSoundVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }
}
