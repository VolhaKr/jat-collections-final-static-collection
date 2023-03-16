package org.example.epam.volha.jat.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    final Collection rainbowColors = new ArrayList(List.of("Red", "Orange", "Yellow", "Green", "Blue", "Indigo",
        "Violete"));
    System.out.println("Rainbow colors : " + rainbowColors);

    rainbowColors.add("VERY BLACK");
    System.out.println("Modified rainbow colors : " + rainbowColors);
  }
}