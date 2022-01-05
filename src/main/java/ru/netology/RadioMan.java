package ru.netology;

public class RadioMan {
    private int numberOffStation=10;
    private int currentWave;
    private int currentVolume;
    private int minWaveStation=0;
    private int maxVolume=100;
    private int minVolume=0;

    public RadioMan(int numberOffStation) {
        this.numberOffStation = numberOffStation;
    }

    public RadioMan(){

   }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave < minWaveStation) {
            return;
        }
        if (currentWave > numberOffStation-1) {
            return;
        }
        this.currentWave = currentWave;
    }

    public void next() {
        if (currentWave < numberOffStation-1) {
            currentWave++;
        } else {
            currentWave = 0;
        }

    }

    public void prev() {
        if (currentWave > minWaveStation) {
            currentWave--;
        } else {
            currentWave = numberOffStation-1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void lowVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}
