package com.company;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.company.Main.*;
import static org.junit.Assert.*;

/**
 * Unit tests for the Main class
 */
public class Testing {
    @Test
    public void AddList() {
        ArrayList<Integer> listArr = new ArrayList<>();
        LinkedList<Integer> listLinked = new LinkedList<>();
        assertTrue(testAddList (listArr)> 0 && testAddList (listLinked) > 0);
    }

    @Test
    public void AddInMiddleList() {
        ArrayList<Integer> listArr = new ArrayList<>();
        LinkedList<Integer> listLinked = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            listArr.add(i);
            listLinked.add(i);
        }
        assertTrue(testAddInMiddleList (listArr)> 0 && testAddInMiddleList (listLinked) > 0);
    }

    @Test
    public void getList() {
        ArrayList<Integer> listArr = new ArrayList<>();
        LinkedList<Integer> listLinked = new LinkedList<>();

        for (int i = 0; i < 10000; i++) {
            listArr.add(i);
            listLinked.add(i);
        }
        assertTrue(testGetList (listArr) > 0 && testGetList (listLinked) > 0);
    }

    @Test
    public void deleteList() {
        ArrayList<Integer> listArr = new ArrayList<>();
        LinkedList<Integer> listLinked = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            listArr.add(i);
            listLinked.add(i);
        }
        assertTrue(testDeleteList (listArr) > 0 && testDeleteList (listLinked) > 0);
    }
}
