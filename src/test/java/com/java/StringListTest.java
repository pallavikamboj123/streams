package com.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {
  @Test
  void shouldConvertToUpperCase() {
    StringList stringList = new StringList();
    StringList expected = new StringList();

    stringList.insert("is");
    stringList.insert("am");
    stringList.insert("are");

    expected.insert("IS");
    expected.insert("AM");
    expected.insert("ARE");

    StringList actual = stringList.convertToUpperCase();

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldConvertToLowerCase() {
    StringList stringList = new StringList();
    StringList expected = new StringList();

    stringList.insert("iS");
    stringList.insert("AM");
    stringList.insert("are");

    expected.insert("is");
    expected.insert("am");
    expected.insert("are");

    StringList actual = stringList.convertToLowerCase();

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldGetListOnlyWithThreeCharLengthValues() {
    StringList stringList = new StringList();
    StringList expected = new StringList();

    stringList.insert("is");
    stringList.insert("ame");
    stringList.insert("are");

    expected.insert("ame");
    expected.insert("are");

    StringList actual = stringList.getThreeLengthValues();

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldGetSizeOfEveryStringFromList() {
    StringList stringList = new StringList();
    IntegerList expected = new IntegerList();

    stringList.insert("is");
    stringList.insert("ame");
    stringList.insert("are");

    expected.insert(2);
    expected.insert(3);
    expected.insert(3);

    IntegerList actual = stringList.getStringLength();

    assertTrue(actual.isEquals(expected));
  }

  @Test
  void shouldGetSumOfLengthOfStrings() {
    StringList stringList = new StringList();

    stringList.insert("is");
    stringList.insert("ame");
    stringList.insert("are");

    int actual = stringList.getStringLengthSum();

    assertEquals(8, actual);
  }

  @Test
  void shouldGetSingleStringByConcatenatingStringList() {
    StringList stringList = new StringList();

    stringList.insert("all");
    stringList.insert("is");
    stringList.insert("well");

    String actual = stringList.concatStringList();

    assertEquals("all is well", actual);
  }

  @Test
  void shouldGetStringByConcatenatingFirstCharFromList() {
    StringList stringList = new StringList();

    stringList.insert("all");
    stringList.insert("is");
    stringList.insert("well");

    String actual = stringList.concatFirstCharStringList();

    assertEquals("aiw", actual);
  }
}