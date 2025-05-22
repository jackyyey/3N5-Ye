package org.ye.CalculServeur;

import java.math.BigInteger;

@org.springframework.stereotype.Service
public class Service {
    public BigInteger fibonacci(int n){
        if (n <= 0) {
            throw new IllegalArgumentException("Length must be a positive integer.");
        }

        if (n == 1) {
            return BigInteger.ZERO;
        } else if (n == 2) {
            return BigInteger.ONE;
        }

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger next = BigInteger.ZERO;

        for (int i = 3; i <= n; i++) {
            next = a.add(b);
            a = b;
            b = next;
        }

        return b;
    }
}
