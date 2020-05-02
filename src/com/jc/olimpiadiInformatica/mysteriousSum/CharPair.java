package com.jc.olimpiadiInformatica.mysteriousSum;

class CharPair {
    private final char addend1Char;
    private final char second2Char;

    static CharPairBuilder newCharPair() {
        return new CharPairBuilder();
    }

    private CharPair(char addend1Char, char second2Char) {
        this.addend1Char = addend1Char;
        this.second2Char = second2Char;
    }

    char getAddend1Char() {
        return addend1Char;
    }

    char getSecond2Char() {
        return second2Char;
    }

    static final class CharPairBuilder {
        private char addend1Char;
        private char second2Char;

        CharPairBuilder withAddend1Char(char addend1Char) {
            this.addend1Char = addend1Char;
            return this;
        }

        CharPairBuilder withSecond2Char(char second2Char) {
            this.second2Char = second2Char;
            return this;
        }

        CharPair build() {
            return new CharPair(addend1Char, second2Char);
        }
    }
}
