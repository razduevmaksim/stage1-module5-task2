package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (x) -> x.stream().map(num -> num/divider).collect(Collectors.toList());
    }
}
