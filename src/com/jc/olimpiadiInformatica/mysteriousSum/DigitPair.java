package com.jc.olimpiadiInformatica.mysteriousSum;

class DigitPair {
    private final int addend1Digit;
    private final int addend2Digit;

    static DigitPairBuilder newDigitPair() {
        return new DigitPairBuilder();
    }

    private DigitPair(int addend1Digit, int addend2Digit) {
        this.addend1Digit = addend1Digit;
        this.addend2Digit = addend2Digit;
    }

    int getAddend1Digit() {
        return addend1Digit;
    }

    int getAddend2Digit() {
        return addend2Digit;
    }

    static final class DigitPairBuilder {
        private int addend1Digit;
        private int addend2Digit;

        DigitPairBuilder withAddend1Digit(int addend1Digit) {
            this.addend1Digit = addend1Digit;
            return this;
        }

        DigitPairBuilder withAddend2Digit(int addend2Digit) {
            this.addend2Digit = addend2Digit;
            return this;
        }

        DigitPair build() {
            return new DigitPair(addend1Digit, addend2Digit);
        }
    }
}
