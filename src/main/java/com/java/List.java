package com.java;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;


public class List<T> {
  private Node<T> head;
  private Node<T> tail;
  int length = 0;

  public List() {
    head = new EmptyNode();
    tail = new EmptyNode();
    length = 0;
  }

  public T getData(int index) {
    int currentIndex = 0;
    Node<T> temp = head;

    if(index >= length) {
      throw new ArrayIndexOutOfBoundsException();
    }

    while(currentIndex != index) {
      temp = temp.next;
      currentIndex++;
    }

    return temp.data;
  }

  private class EmptyNode extends Node<T> {
    public EmptyNode() {
      next = null;
      data = null;
    }

    public boolean isEmptyNode() {
      return true;
    }
  }

  private class DataNode extends Node<T> {
    public DataNode(T data) {
      this.data = data;
      this.next = new EmptyNode();
    }

    public boolean isEmptyNode() {
      return false;
    }
  }

  public boolean isEquals(List<T> list) {
    Node<T> currentHead = head;
    Node<T> givenHead = list.head;

    if (length != list.getLength()) {
      return false;
    }

    return checkIfListsAreEqual(currentHead, givenHead);
  }

  private boolean checkIfListsAreEqual(Node<T> currentHead, Node<T> givenHead) {
    while (!currentHead.isEmptyNode()) {
      if (!Objects.equals(currentHead.data, givenHead.data)) {
        return false;
      }
      currentHead = currentHead.next;
      givenHead = givenHead.next;
    }
    return true;
  }

  public int getLength() {
    return length;
  }

  protected <R> List<R> map(Function<T, R> function) {
    Node<T> current = head;
    List<R> result = new List<>();

    while (!current.isEmptyNode()) {
      result.insert(function.apply(current.data));
      current = current.next;
    }

    return result;
  }

  protected List<T> filter(Function<T, Boolean> function) {
    Node<T> current = head;
    List<T> result = new List<>();

    while (!current.isEmptyNode()) {
      if (function.apply(current.data)) {
        result.insert(current.data);
      }
      current = current.next;
    }
    return result;
  }

  protected <R> R reduce(R initialValue, BiFunction<R, T, R> function) {
    Node<T> current = head;
    R result = initialValue;
    while (!current.isEmptyNode()) {
      result = function.apply(result, current.data);
      current = current.next;
    }
    return result;
  }

  public boolean isEmpty() {
    return head.isEmptyNode();
  }

  public void insert(T data) {
    Node<T> newNode = new DataNode(data);

    if (head.isEmptyNode()) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = tail.next;
    }
    length++;
  }
}
