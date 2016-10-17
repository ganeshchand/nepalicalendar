package com.gc.nepalicalendar

/**
  * Created by ganeshchand on 10/16/16.
  */
object HelloWorld {

  def greet(s: String = "World") = s"Hello, $s!"

  def main(args: Array[String]): Unit = {
    println(greet())
  }
}
