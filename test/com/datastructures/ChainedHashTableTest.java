package com.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChainedHashTableTest {
    private ChainedHashTable<Integer, String> chainedHashTable;

    @Before
    public void setup(){
        chainedHashTable = new ChainedHashTable<>(10, new RemainderHashing());
        chainedHashTable.put(12,"Isabel");
        chainedHashTable.put(22,"Ruth");
        chainedHashTable.put(32,"Michelle");
        chainedHashTable.put(11,"James");
        chainedHashTable.put(21,"John");
        chainedHashTable.put(31,"Peter");
    }

    @Test
    public void putPositive() {
        String expectedName = "Marcy";
        chainedHashTable.put(15, "Marcy");
        String actualName = chainedHashTable.get(15).toString();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPositive() {
        String expectedName = "James";
        String actualName = chainedHashTable.get(11);
        assertEquals(expectedName, actualName);
    }

    @Test
    public void remove() {
    }
}