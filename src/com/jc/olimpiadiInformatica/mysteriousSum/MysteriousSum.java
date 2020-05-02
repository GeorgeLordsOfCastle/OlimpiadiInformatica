package com.jc.olimpiadiInformatica.mysteriousSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MysteriousSum {
    static List<Decode> decodeSum(String addend1, String addend2, int sum) {
        List<CharPair> charPairList = getCharPairList(addend1, addend2);

        return Arrays.asList(
                Decode.newDecode()
                        .withLetter('A')
                        .withDigit(1)
                        .build(),
                Decode.newDecode()
                        .withLetter('B')
                        .withDigit(7)
                        .build(),
                Decode.newDecode()
                        .withLetter('C')
                        .withDigit(4)
                        .build()
        );
    }

    static List<CharPair> getCharPairList(String addend1, String addend2) {
        List<CharPair> charPairList = new ArrayList<>();
        int commonLength = Math.min(addend1.length(), addend2.length());
        for(int i = 0; i < commonLength; i++) {
            charPairList.add(CharPair.newCharPair()
                    .withAddend1Char(addend1.charAt(i))
                    .withSecond2Char(addend2.charAt(i))
                    .build());
        }
        if(addend1.length() > addend2.length()) {
            for(int i = commonLength; i < addend1.length(); i++) {
                charPairList.add(CharPair.newCharPair()
                        .withAddend1Char(addend1.charAt(i))
                        .build());
            }
        }
        if(addend1.length() < addend2.length()) {
            for(int i = commonLength; i < addend2.length(); i++) {
                charPairList.add(CharPair.newCharPair()
                        .withSecond2Char(addend2.charAt(i))
                        .build());
            }
        }
        return charPairList;
    }

    int getDigit(int sum, int digitIndex) {
        return Character.getNumericValue(Integer.toString(sum).charAt(digitIndex));
    }

    List<DigitPair> getPossibility(CharPair charPair, int sumDigit) {

        return Arrays.asList();
    }
}
