package com.java;


import java.util.function.BiFunction;
import java.util.function.Function;

public class IntegerList extends List<Integer> {

  public List<Integer> calculatePower(int exponent) {
    Function<Integer, Integer> function = val -> (int) Math.pow(val, exponent);

    return this.map(function);
  }

  public List<Integer> getOddValues() {
    Function<Integer, Boolean> function = val -> (val % 2) != 0;

    return this.filter(function);
  }

  public List<Integer> getEvenValues() {
    Function<Integer, Boolean> function = val -> (val % 2) == 0;

    return this.filter(function);
  }

  public int getSum() {
    BiFunction<Integer, Integer, Integer> function = Integer::sum;

    return this.reduce(0, function);
  }

  public int getMinimumValue() {
    BiFunction<Integer, Integer, Integer> function = Integer::min;

    return this.reduce(Integer.MAX_VALUE, function);
  }

  public int getMaximumValue() {
    BiFunction<Integer, Integer, Integer> function = Integer::max;

    return this.reduce(Integer.MIN_VALUE, function);
  }

}
