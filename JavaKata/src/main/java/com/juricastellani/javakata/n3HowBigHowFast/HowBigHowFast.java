package com.juricastellani.javakata.n3HowBigHowFast;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HowBigHowFast {

    public static BigInteger howBig1(BigInteger tenBaseNumber) {
        BigDecimal tenBaseDecimalNumber = new BigDecimal(tenBaseNumber);
        BigInteger howBig = BigInteger.ZERO;
        do {
            tenBaseDecimalNumber = tenBaseDecimalNumber.divide(new BigDecimal("2"));
            howBig = howBig.add(BigInteger.ONE);
        } while (tenBaseDecimalNumber.compareTo(BigDecimal.ONE) > 0);
        return howBig;
    }
}
