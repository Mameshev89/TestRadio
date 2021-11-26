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
        run.setCurrentWave(11);
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void next() {
        RadioMan run = new RadioMan();
        run.setCurrentWave(1);
        run.next();
        int expected = 2;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        RadioMan run = new RadioMan();
        run.setCurrentWave(0);
        run.prev();
        int expected = 9;
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
        run.setCurrentVolume(-1);
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        RadioMan run = new RadioMan();
        run.setCurrentVolume(1);
        run.increaseVolume();
        int expected = 2;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void LowVolume() {
        RadioMan run = new RadioMan();
        run.setCurrentVolume(0);
        run.lowVolume();
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }
}