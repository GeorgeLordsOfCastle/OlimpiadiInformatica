package com.jc.olimpiadiInformatica.mysteriousSum;

import java.util.List;
import java.util.stream.Collectors;

public class MysteriousSumUtils {
    static int convert(String addend, List<Decode> decodeList) {
        return Integer.parseInt(addend.chars().mapToObj(i->(char)i)
                .map(charI -> decodeList.stream()
                        .filter(decode -> decode.getLetter() == charI)
                        .findFirst()
                        .map(decode -> Integer.toString(decode.getDigit()))
                        .orElseThrow(() -> new RuntimeException("Decode doesn't produce a number.")))
                .collect(Collectors.joining()));
    }
}
