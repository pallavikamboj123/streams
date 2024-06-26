package com.java;

import java.util.Objects;

public abstract class Node<T> {
  Node<T> next;
  T data;

  abstract public boolean isEmptyNode();
}
