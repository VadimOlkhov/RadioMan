package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextRadioStation() {
        int currentRadioStation = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation1() {
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation2() {
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation1() {
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation2() {
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.prevRadioStation();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldInputNomerRadioStation() {
        int nomerRadioStation = 7;
        int currentRadioStation = 2;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.inputNomerRadioStation(nomerRadioStation);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldInputNomerRadioStation1() {
        int nomerRadioStation = 10;
        int currentRadioStation = 2;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.inputNomerRadioStation(nomerRadioStation);
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldInputNomerRadioStation2() {
        int nomerRadioStation = -1;
        int currentRadioStation = 2;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.inputNomerRadioStation(nomerRadioStation);
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDecreaseVolume() {
        int currentSoundVolume = 10;
        radio.setCurrentVolume(currentSoundVolume);
        radio.decreaseSoundVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseSoundVolume1() {
        int currentSoundVolume = 5;
        radio.setCurrentVolume(currentSoundVolume);
        radio.decreaseSoundVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseSoundVolume2() {
        int currentSoundVolume = 11;
        radio.setCurrentVolume(currentSoundVolume);
        radio.decreaseSoundVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseSoundVolume() {
        int currentSoundVolume = 5;
        radio.setCurrentVolume(currentSoundVolume);
        radio.increaseSoundVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseSoundVolume1() {
        int currentSoundVolume = 0;
        radio.setCurrentVolume(currentSoundVolume);
        radio.increaseSoundVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseSoundVolume2() {
        int currentSoundVolume = -1;
        radio.setCurrentVolume(currentSoundVolume);
        radio.increaseSoundVolume();
        assertEquals(0, radio.getCurrentVolume());
    }


}