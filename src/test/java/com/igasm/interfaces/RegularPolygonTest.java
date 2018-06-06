package com.igasm.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularPolygonTest {

  @Test
  public void givenSquareAndTriangle_totalSidesShouldReturn7() {
    RegularPolygon[] polygons = {new Square(5), new EquilateralTriangle(5)};

    assertEquals(7, RegularPolygon.totalSides(polygons));
  }

  @Test
  public void givenEmptyRegularPolygonArray_shouldReturn0(){
    RegularPolygon[] polygons = new RegularPolygon[5];
    assertEquals(0, RegularPolygon.totalSides(polygons));
  }
}