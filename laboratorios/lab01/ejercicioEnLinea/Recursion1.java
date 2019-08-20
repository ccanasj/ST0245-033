package rectangulos;

public class Recursion1 {

    public int factorial(int n) {
        if (n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return bunnyEars(bunnies - 1) + 2;
        }
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public int bunnyEars2(int bunnies) {
        int aux = 0;
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 1) {
            return bunnyEars2(bunnies - 1) + 2;
        } else {
            return bunnyEars2(bunnies - 1) + 3;
        }
    }

    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else {
            return triangle(rows - 1) + rows;
        }
    }

}
