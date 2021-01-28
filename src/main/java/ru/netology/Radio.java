package ru.netology;


import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
public class Radio {
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int currentRadioStation=0;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
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