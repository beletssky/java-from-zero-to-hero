package com.course.task02;

import java.util.ArrayList;
import java.util.List;

public class Task02 {

  private List<Integer> nums = new ArrayList<>();

  public void add(int n) {
    nums.add(n);
  }

  public int sum() {
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return total;
  }

  public double average() {
    if (nums.isEmpty()) {
      return 0.0;
    }
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return (double) total / nums.size();
  }

  public int max() {
    if (nums.isEmpty()) {
      throw new java.util.NoSuchElementException();
    }
    int maxVal = nums.get(0);
    for (int num : nums) {
      if (num > maxVal) {
        maxVal = num;
      }
    }
    return maxVal;
  }

  public int min() {
    if (nums.isEmpty()) {
      throw new java.util.NoSuchElementException();
    }
    int minVal = nums.get(0);
    for (int num : nums) {
      if (num < minVal) {
        minVal = num;
      }
    }
    return minVal;
  }
}