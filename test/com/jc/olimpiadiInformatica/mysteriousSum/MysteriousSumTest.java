package com.jc.olimpiadiInformatica.mysteriousSum;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(Parameterized.class)
public class MysteriousSumTest {
    private final MysteriousSum mysteriousSum;

    public MysteriousSumTest(MysteriousSumTestConfiguration configuration) {
        this.mysteriousSum = configuration.getMysteriousSum();
    }

    @Parameterized.Parameters(name = "{0}")
    public static List<MysteriousSumTestConfiguration> init() {
        return Arrays.asList(
            MysteriousSumTestConfiguration.newMysteriousSumTestConfiguration()
                    .withConfigName("Brute Force")
                    .withMysteriousSum(new BruteForceMysteriousSum())
                    .build(),
            MysteriousSumTestConfiguration.newMysteriousSumTestConfiguration()
                    .withConfigName("Optimized")
                    .withMysteriousSum(new OptimizedMysteriousSum())
                    .build()
        );
    }

    @Test
    public void mysteriousSumExample1Test() {
        List<Decode> decodeList = mysteriousSum.decodeSum("AB", "CA", 58);
        check(decodeList, "AB", "CA", 58);
    }

    @Test
    public void mysteriousSumExample2Test() {
        List<Decode> decodeList = mysteriousSum.decodeSum("AABCDEF", "DBGJCIH", 12345678);
        check(decodeList, "AABCDEF", "DBGJCIH", 12345678);
    }

    private static void check(List<Decode> decodeList, String addend1, String addend2, int sum) {
        int intAddend1 = convert(addend1, decodeList);
        int intAddend2 = convert(addend2, decodeList);
        Assert.assertThat(intAddend1 + intAddend2, Is.is(sum));
    }

    private static int convert(String addend, List<Decode> decodeList) {
        return Integer.parseInt(addend.chars().mapToObj(i->(char)i)
                .map(charI -> decodeList.stream()
                        .filter(decode -> decode.getLetter() == charI)
                        .findFirst()
                        .map(decode -> Integer.toString(decode.getDigit()))
                        .orElseThrow())
                .collect(Collectors.joining()));
    }
}
