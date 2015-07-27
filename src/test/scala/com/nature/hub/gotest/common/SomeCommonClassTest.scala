package com.nature.hub.gotest.common

import org.hamcrest.CoreMatchers.is
import org.hamcrest.MatcherAssert.assertThat

class SomeCommonClassTest extends org.scalatest.FunSuite {
  test("some common test") {
    val common = new SomeCommonClass()
    assertThat(common.someCommonFunction("s"), is("this is a common [s]"))
  }
}
