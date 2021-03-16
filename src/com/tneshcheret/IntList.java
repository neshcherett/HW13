package com.tneshcheret;

import java.util.Arrays;

public class IntList {
    private int[] array = new int[0];

    public void add(int value) {
        //add - добавить значеине в список
        int[] tmpArray = new int[this.array.length + 1];
        for (int i = 0; i < tmpArray.length; i++) {
            if (i <= tmpArray.length - 2) {
                tmpArray[i] = this.array[i];
            }
            if (i == tmpArray.length - 1) {
                tmpArray[i] = value;
            }
        }
        this.array = tmpArray;
    }

    public int get(int index) {
        //get - получить по индексу
        return this.array[index];
    }

    public void set(int index, int value) {
        // set - заменить по индексу
        this.array[index] = value;
    }

    public int size() {
        // size - вернуть размер, изначально 0
        return this.array.length;
    }

    @Override
    public String toString() {
        return "IntList{" +
                Arrays.toString(array) +
                '}';
    }
}
