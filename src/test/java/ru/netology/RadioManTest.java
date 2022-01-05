package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioManTest {
    RadioMan run = new RadioMan(10);
    @Test
    void getCurrentWave() {
        run.getCurrentWave();
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentWave() {
        run.setCurrentWave(-1);
        run.setCurrentWave(10);
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void next() {
        run.setCurrentWave(8);
        run.next();
        run.next();
        int expected = 0;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        run.setCurrentWave(1);
        run.prev();
        run.prev();
        int expected = 9;
        int actual = run.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolume() {
        run.getCurrentVolume();
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        run.setCurrentVolume(-1);
        run.setCurrentVolume(101);
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        run.setCurrentVolume(99);
        run.increaseVolume();
        run.increaseVolume();
        int expected = 100;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void LowVolume() {
        run.setCurrentVolume(1);
        run.lowVolume();
        run.lowVolume();
        int expected = 0;
        int actual = run.getCurrentVolume();
        assertEquals(expected, actual);
    }


}