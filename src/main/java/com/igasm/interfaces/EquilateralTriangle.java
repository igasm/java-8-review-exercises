package com.igasm.interfaces;

public class EquilateralTriangle implements RegularPolygon {

  private int numSides;
  private int sideLength;

  public EquilateralTriangle(int sideLength){
    this.numSides = 3;
    this.sideLength = sideLength;
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
