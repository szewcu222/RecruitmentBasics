package com.company;

import java.util.Objects;

public class HashClassTest {

    Integer liczba;
    String name;

    public HashClassTest(int liczba, String name) {
        this.liczba = liczba;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashClassTest that = (HashClassTest) o;
        return liczba.equals(that.liczba) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liczba);
    }
}
