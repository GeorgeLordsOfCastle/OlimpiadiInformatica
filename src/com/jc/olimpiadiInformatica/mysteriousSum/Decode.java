package com.jc.olimpiadiInformatica.mysteriousSum;

class Decode {
    private final char letter;
    private final int digit;

    static DecodeBuilder newDecode() {
        return new DecodeBuilder();
    }

    private Decode(char letter, int digit) {
        this.letter = letter;
        this.digit = digit;
    }

    char getLetter() {
        return letter;
    }

    int getDigit() {
        return digit;
    }

    static final class DecodeBuilder {
        private char letter;
        private int digit;

        DecodeBuilder withLetter(char letter) {
            this.letter = letter;
            return this;
        }

        DecodeBuilder withDigit(int digit) {
            this.digit = digit;
            return this;
        }

        Decode build() {
            return new Decode(letter, digit);
        }
    }
}
