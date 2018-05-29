package eiler;

import java.math.BigInteger;

public class Application{

    public static void main(String[] args) {
        System.out.println(new Application().run());
    }

    private static final int SET_SIZE = 12;

    public String run() {
        BigInteger ans = BigInteger.ZERO;
        for (int i = 2; i * 2 <= SET_SIZE; i++) {
            BigInteger x = Library.binomial(SET_SIZE, i * 2);
            BigInteger y = Library.binomial(i * 2, i).shiftRight(1);
            BigInteger z = Library.binomial(i * 2, i).divide(BigInteger.valueOf(i + 1));
            ans = ans.add(x.multiply(y.subtract(z)));
        }
        return ans.toString();
    }
}
