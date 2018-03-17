package com.juricastellani.javakata.n3HowBigHowFast;

import org.junit.Test;

import java.math.BigInteger;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HowBigHowFastTest {
    @Test
    public void howBig1Test() throws Exception {
        BigInteger tenBaseNumber;
        BigInteger relatedBinaryNumberDigits;

        tenBaseNumber = new BigInteger("1000");
        relatedBinaryNumberDigits = HowBigHowFast.howBig1(tenBaseNumber);
        assertThat(relatedBinaryNumberDigits, is(new BigInteger("10")));

        tenBaseNumber = new BigInteger("1000000");
        relatedBinaryNumberDigits = HowBigHowFast.howBig1(tenBaseNumber);
        assertThat(relatedBinaryNumberDigits, is(new BigInteger("20")));

        tenBaseNumber = new BigInteger("1000000000");
        relatedBinaryNumberDigits = HowBigHowFast.howBig1(tenBaseNumber);
        assertThat(relatedBinaryNumberDigits, is(new BigInteger("30")));

        tenBaseNumber = new BigInteger("1000000000000");
        relatedBinaryNumberDigits = HowBigHowFast.howBig1(tenBaseNumber);
        assertThat(relatedBinaryNumberDigits, is(new BigInteger("40")));

        tenBaseNumber = new BigInteger("8000000000000");
        relatedBinaryNumberDigits = HowBigHowFast.howBig1(tenBaseNumber);
        assertThat(relatedBinaryNumberDigits, is(new BigInteger("43")));
    }
}
