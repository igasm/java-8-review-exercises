package com.igasm.interfaces;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface RegularPolygon {

  int getNumSides();
  int getSideLength();

  static int totalSides(RegularPolygon[] polygons){
    int sum = 0;

    for(int i=0; i< polygons.length; i++){
      if(polygons[i] != null) {
        sum += polygons[i].getNumSides();
      }
    }

    return sum;
  }

  default int getPerimeter(){
    return getNumSides() * getSideLength();
  }

  default double getInteriorAngle(){
    int n = getNumSides();
    return ((n-2) * Math.PI)/n;
  }

}
