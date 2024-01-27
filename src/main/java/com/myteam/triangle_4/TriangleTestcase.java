package com.myteam.triangle_4;

/**
 * InnerTriangleTestcase
 */
class TriangleTestcase {
    int side1;
    int side2;
    int side3;
    String expected;

    public TriangleTestcase(int side1, int side2, int side3, String expected) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.expected = expected;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String getExpected() {
        return expected;
    }
}
