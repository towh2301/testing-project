package com.myteam.triangle_1;

import com.myteam.triangle_1.TriangleTestcase;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
 * This is a JUnit test class for TriangleClassify.java
 * Generate test cases then export to csv TriangleTestcase.csv
 */
public class TriangleTestcaseGenerator {
    static Scanner sc = new Scanner(System.in);

//    public static void main(String[] args) {
//        // generateTestCase(7);
//    }

    /**
     *
     * @param input
     * @return
     */
    public static List<TriangleTestcase> generateTestCase(int input, int max, int min) {
        List<int[]> side = new ArrayList<>();
        String expected = "";
        List<TriangleTestcase> testcases = new ArrayList<>();

        // Generate test cases
        for (int i = 0; i < 3; i++) {
            side.add(getTest(max, min, input));
        }

        // Set test cases 1
        int side1 = side.get(0)[0];
        int side2 = side.get(1)[0];
        for (int i = 0; i < side.get(2).length; i++) {
            int side3 = side.get(2)[i];
            expected = classifyTriangle(side1, side2, side3);
            testcases.add(new TriangleTestcase(side1, side2, side.get(2)[i], expected));
        }

        // Set test cases 2
        side1 = side.get(1)[0];
        side2 = side.get(2)[0];
        for (int i = 1; i < side.get(0).length; i++) {
            int side3 = side.get(0)[i];
            expected = classifyTriangle(side1, side2, side3);
            testcases.add(new TriangleTestcase(side.get(0)[i], side1, side2, expected));
        }

        // Set test cases 3
        side1 = side.get(2)[0];
        side2 = side.get(0)[0];
        for (int i = 1; i < side.get(1).length; i++) {
            int side3 = side.get(1)[i];
            expected = classifyTriangle(side1, side2, side3);
            testcases.add(new TriangleTestcase(side1, side.get(1)[i], side2, expected));
        }

        // Print test cases
        System.out.println("side1,side2,side3,expected");
        for (int i = 0; i < input * 3 - 2; i++) {
            System.out.println(
                    testcases.get(i).getSide1() + "," + testcases.get(i).getSide2() + "," + testcases.get(i).getSide3()
                            + "," + testcases.get(i).getExpected());
        }

        // export to csv
        exportToCSV("src/main/java/com/myteam/triangle_1/triangleTestcase.csv", testcases);
        return testcases;
    }

    public static int[] getTest(int max, int min, int inputCount) {
        int nom = (max + min) / 2;
        int[] test;
        int minPlus = min + 1;
        int maxMinus = max - 1;

        if (inputCount == 5) {
            test = new int[] { nom, minPlus, max, min, maxMinus };
        } else if (inputCount == 7) {
            int maxPlus = max + 1;
            int minMinus = min - 1;
            test = new int[] { nom, maxPlus, minPlus, max, min, maxMinus, minMinus };
        } else {
            throw new IllegalArgumentException("Invalid input count. Supported counts are 5 and 7.");
        }
        return test;
    }

    public static String classifyTriangle(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 > 200 || side2 > 200 || side3 > 200) {
            return "OUT_OF_RANGE";
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "IsNotTriangle";
        } else if (side1 == side2 && side2 == side3) {
            return "EQUILATERAL";
        } else if (side1 != side2 && side1 != side3 && side2 != side3) {
            return "SCALENE";
        } else {
            return "ISOSCELES";
        }
    }

    public static void exportToCSV(String fileName, List<TriangleTestcase> testcases) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (TriangleTestcase testcase : testcases) {
                writer.append(testcase.getSide1() + "," + testcase.getSide2() + "," + testcase.getSide3() + ","
                        + testcase.getExpected() + "\n");
            }
            System.out.println("Test cases exported to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}