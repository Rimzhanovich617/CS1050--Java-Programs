/* Assignment 2.31 - Table of Squares and Cubes
 * write an application that calculates the
 * squares and cubes of the numbers from 0 to 10
 * and prints the resulting values in table format
 */

import java.util.Scanner; // import Scanner class for input

public class SquaresandCubes {
    // main method SquaresandCubes begins execution of Java application

    public static void main(String[] args) {
        // Below is the header for the table
        System.out.printf("-------------------------------%n");
        System.out.printf("  Table of Squares and Cubes %n");
        System.out.printf("-------------------------------%n");
        System.out.printf(" | %4s | %4s | %4s |%n", "Number", "Square", "Cube");

        // Variable list of numbers 0 - 10 squared and cubed
        int a = 0; // starts with 0
        int a2 = a * a; // 0 squared
        int a3 = a * a * a;// 0 cubed

        int b = 1; // 1 squared and cubed
        int b2 = b * b;
        int b3 = b * b * b;

        int c = 2; // 2 squared and cubed
        int c2 = c * c;
        int c3 = c * c * c;

        int d = 3; // 3 squared and cubed
        int d2 = d * d;
        int d3 = d * d * d;

        int e = 4; // 4 squared and cubed
        int e2 = e * e;
        int e3 = e * e * e;

        int f = 5; // 5 squared and cubed
        int f2 = f * f;
        int f3 = f * f * f;

        int g = 6; // 6 squared and cubed
        int g2 = g * g;
        int g3 = g * g * g;

        int h = 7; // 7 squared and cubed
        int h2 = h * h;
        int h3 = h * h * h;

        int i = 8; // 8 squared and cubed
        int i2 = i * i;
        int i3 = i * i * i;

        int j = 9; // 9 squared and cubed
        int j2 = j * j;
        int j3 = j * j * j;

        int k = 10; // 10 squared and cubed
        int k2 = k * k;
        int k3 = k * k * k;

        // Below are the tables for all squared and cubed numbers 0 - 10
        System.out.printf(" | %-6s | %-6s | %-4s |%n", a, a2, a3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", b, b2, b3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", c, c2, c3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", d, d2, d3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", e, e2, e3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", f, f2, f3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", g, g2, g3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", h, h2, h3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", i, i2, i3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", j, j2, j3);
        System.out.printf(" | %-6s | %-6s | %-4s |%n", k, k2, k3);

    }
}
// terminal
// end of method main
// end of class SquaresandCubes