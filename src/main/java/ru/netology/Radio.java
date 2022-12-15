package ru.netology;

public class Radio {
    public int currentNumber;
    public int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void nextNumber() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        }
        else {
            currentNumber = 0;
        }
    }

    public void prevNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        }
        else {
            currentNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
