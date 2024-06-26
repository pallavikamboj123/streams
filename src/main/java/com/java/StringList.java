package com.java;

import java.util.function.BiFunction;
import java.util.function.Function;

public class StringList extends List<String> {
  public StringList() {
    super();
  }

  public List<String> convertToUpperCase() {
    Function<String, String> function = String::toUpperCase;

    return this.map(function);
  }

  public List<String> convertToLowerCase() {
    Function<String, String> function = String::toLowerCase;

    return this.map(function);
  }

  public List<String> getThreeLengthValues() {
    Function<String, Boolean> function = val -> val.length() == 3;

    return this.filter(function);
  }

  public List<Integer> getStringLength() {
    Function<String, Integer> function = String::length;

    return this.map(function);
  }

  public int getStringLengthSum() {
    BiFunction<Integer, String, Integer> function =
      (total, val) -> Integer.sum(val.length(), total);

    return this.reduce(0, function);
  }

  public String concatStringList() {
    String delimiter = " ";

    BiFunction<String, String, String> function = (str1, str2) -> {
      if (str1.isEmpty()) {
        return str2;
      } else {
        return String.join(delimiter, str1, str2);
      }
    };

    return this.reduce("", function);
  }

  public String concatFirstCharStringList() {

    BiFunction<String, String, String> function =
      (str1, str2) -> str1.concat(String.valueOf(str2.charAt(0)));
    return this.reduce("", function);
  }
}


