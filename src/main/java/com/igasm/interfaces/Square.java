package com.igasm.interfaces;

public class Square implements RegularPolygon {

  private final int numSides;
  private final int sideLength;

  public Square(int sideLength) {
    this.sideLength = sideLength;
    this.numSides = 4;
  }


  @Override
  public int getNumSides() {
    return numSides;
  }

  @Override
  public int getSideLength() {
    return this.sideLength;
  }
}
