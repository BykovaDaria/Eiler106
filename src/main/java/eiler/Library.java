package eiler;

import java.math.BigInteger;

final class Library {
    public static BigInteger factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Factorial of negative number");
        BigInteger prod = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            prod = prod.multiply(BigInteger.valueOf(i));
        return prod;
    }

    public static BigInteger binomial(int n, int k) {
        if (k < 0 || k > n)
            throw new IllegalArgumentException();
        BigInteger product = BigInteger.ONE;
        for (int i = 0; i < k; i++)
            product = product.multiply(BigInteger.valueOf(n - i));
        return product.divide(factorial(k));
    }
}
