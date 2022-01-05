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




    RadioMan run2=new RadioMan();

    @Test
    void getCurrentWaveForRadioMan2() {
        run2.getCurrentWave();
        int expected = 0;
        int actual = run2.getCurrentWave();
        assertEquals(expected, actual);
    }
    @Test
    void setCurrentWaveForRadioman2() {
        run2.setCurrentWave(-1);
        run2.setCurrentWave(10);
        int expected = 0;
        int actual = run2.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void next2() {
        run2.setCurrentWave(8);
        run2.next();
        run2.next();
        int expected = 0;
        int actual = run2.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void prev2() {
        run2.setCurrentWave(1);
        run2.prev();
        run2.prev();
        int expected = 9;
        int actual = run2.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    void getCurrentVolumeForRadioMan2() {
        run2.getCurrentVolume();
        int expected = 0;
        int actual = run2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeForRadioMan2() {
        run2.setCurrentVolume(-1);
        run2.setCurrentVolume(101);
        int expected = 0;
        int actual = run2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increase2() {
        run2.setCurrentVolume(99);
        run2.increaseVolume();
        run2.increaseVolume();
        int expected = 100;
        int actual = run2.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void LowVolume2() {
        run2.setCurrentVolume(1);
        run2.lowVolume();
        run2.lowVolume();
        int expected = 0;
        int actual = run2.getCurrentVolume();
        assertEquals(expected, actual);
    }


}
