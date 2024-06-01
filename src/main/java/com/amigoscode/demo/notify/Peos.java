package com.amigoscode.demo.notify;

import java.util.Objects;

public class Peos {

    private String ole;

    public Peos(String ole) {
        this.ole = ole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peos peos = (Peos) o;
        return Objects.equals(ole, peos.ole);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ole);
    }
}
