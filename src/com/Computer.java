package com;

import java.util.Objects;

public class Computer {

    private final String name;
    private final int ram;
    private final Processor processor;

    public Computer(String name, int ram, Processor processor) {
        this.name = name;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(name, computer.name) && processor == computer.processor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram);
    }
}
