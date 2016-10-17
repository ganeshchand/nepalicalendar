package com.gc.nepalicalendar

import org.scalatest.FunSuite

/**
  * Created by ganeshchand on 10/16/16.
  */
class HelloWorldTest extends FunSuite {
  test("HelloWorld test without argument") {
    assert(HelloWorld.greet() == "Hello, World!")
  }
  test("HelloWorld test with argument"){
    assert(HelloWorld.greet("Nepal") == "Hello, Nepal!")
  }

}
