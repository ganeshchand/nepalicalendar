package com.gc.nepalicalendar

import org.scalatest.FunSuite

/**
  * Created by ganeshchand on 10/16/16.
  */
class NepaliCalendarTest extends FunSuite {
  //2016-01-01 => 2072-09-17
  test("Simple BS to AD Date conversion") {
    val bsDate = new NepaliCalendar()
      .ADtoBS
      .date("2016/01/01")
    assert(bsDate == "2072/09/17")
  }
  test("Simple AD to BS Date conversion") {
    val adDate = new NepaliCalendar()
      .BStoAD
      .date("2072/09/17")
    assert(adDate == "2016/01/01")
  }

}
