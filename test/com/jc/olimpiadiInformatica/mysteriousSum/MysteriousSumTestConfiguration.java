package com.jc.olimpiadiInformatica.mysteriousSum;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

class MysteriousSumTestConfiguration {
    private final String configName;
    private final MysteriousSum mysteriousSum;

    static MysteriousSumTestConfigurationBuilder newMysteriousSumTestConfiguration() {
        return new MysteriousSumTestConfigurationBuilder();
    }

    private MysteriousSumTestConfiguration(String configName, MysteriousSum mysteriousSum) {
        this.configName = configName;
        this.mysteriousSum = mysteriousSum;
    }

    String getConfigName() {
        return configName;
    }

    MysteriousSum getMysteriousSum() {
        return mysteriousSum;
    }

    @Override
    public String toString() {
        return configName;
    }

    static final class MysteriousSumTestConfigurationBuilder {
        private String configName;
        private MysteriousSum mysteriousSum;

        MysteriousSumTestConfigurationBuilder withConfigName(String configName) {
            this.configName = configName;
            return this;
        }

        MysteriousSumTestConfigurationBuilder withMysteriousSum(MysteriousSum mysteriousSum) {
            this.mysteriousSum = mysteriousSum;
            return this;
        }

        MysteriousSumTestConfiguration build() {
            return new MysteriousSumTestConfiguration(configName, mysteriousSum);
        }
    }
}
