package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    public Radio radio = new Radio();

    @ParameterizedTest
    @CsvFileSource(resources = "/NextRadioStation.csv")
    public void shouldNextRadioStation(String test, int StationNumber, int expected) {
        radio.setStationNumber(StationNumber);
        radio.nextRadioStation();
        assertEquals(expected, radio.getStationNumber());
        System.out.println("Текущая Радиостанция = " + radio.getStationNumber());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/PrevRadioStation.csv")
    public void shouldPrevRadioStation(String test, int StationNumber, int expected) {
        radio.setStationNumber(StationNumber);
        radio.prevRadioStation();
        assertEquals(expected, radio.getStationNumber());
        System.out.println("Текущая Радиостанция = " + radio.getStationNumber());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/UpVolumeLevel.csv")
    public void shouldUpVolumeLevel(String test, int VolumeLevel, int expected) {
        radio.setVolumeLevel(VolumeLevel);
        radio.upVolumeLevel();
        assertEquals(expected, radio.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio.getVolumeLevel());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/DownVolumeLevel.csv")
    public void shouldDownVolumeLevel(String test, int VolumeLevel, int expected) {
        radio.setVolumeLevel(VolumeLevel);
        radio.downVolumeLevel();
        assertEquals(expected, radio.getVolumeLevel());
        System.out.println("Текущий уровень громкости = " + radio.getVolumeLevel());
    }

}