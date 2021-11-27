package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioManTest {

    @Test
    void getCurrentWave() {
        RadioMan run = new RadioMan();
        run.getCurrentWave();
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentWave() {
        RadioMan run = new RadioMan();
        run.setCurrentWave(-1);
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void next() {
        RadioMan run = new RadioMan();
        run.setCurrentWave(9);
        run.next();
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        RadioMan run = new RadioMan();
        run.setCurrentWave(9);
        run.prev();
        int expected = 8;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        RadioMan run = new RadioMan();
        run.getCurrentVolume();
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        RadioMan run = new RadioMan();
        run.setCurrentVolume(11);
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        RadioMan run = new RadioMan();
        run.setCurrentVolume(10);
        run.increaseVolume();
        int expected = 10;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void LowVolume() {
        RadioMan run = new RadioMan();
        run.setCurrentVolume(10);
        run.lowVolume();
        int expected = 9;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }
}