package com.jc.olimpiadiInformatica.mysteriousSum;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MysteriousSumUtilsTest {
    @Test
    public void convertTest() {
        int convertedValue = MysteriousSumUtils.convert("ADBC", Arrays.asList(
                Decode.newDecode()
                        .withLetter('A')
                        .withDigit(1)
                        .build(),
                Decode.newDecode()
                        .withLetter('B')
                        .withDigit(4)
                        .build(),
                Decode.newDecode()
                        .withLetter('C')
                        .withDigit(6)
                        .build(),
                Decode.newDecode()
                        .withLetter('D')
                        .withDigit(9)
                        .build()
        ));
        Assert.assertThat(convertedValue, Is.is(1946));
    }

    @Test(expected = RuntimeException.class)
    public void convertTest2() {
        int convertedValue = MysteriousSumUtils.convert("ADBC", Arrays.asList(
                Decode.newDecode()
                        .withLetter('A')
                        .withDigit(1)
                        .build(),
                Decode.newDecode()
                        .withLetter('C')
                        .withDigit(6)
                        .build(),
                Decode.newDecode()
                        .withLetter('D')
                        .withDigit(9)
                        .build()
        ));
        Assert.assertThat(convertedValue, Is.is(1946));
    }
}
