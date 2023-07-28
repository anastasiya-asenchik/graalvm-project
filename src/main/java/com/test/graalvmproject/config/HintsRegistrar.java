package com.test.graalvmproject.config;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

public class HintsRegistrar implements RuntimeHintsRegistrar {

  @Override
  public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
    hints.resources().registerPattern("db/master-changelog.xml");
    hints.resources().registerPattern("db/changelog/*.xml");
  }
}
