package com.gc.nepalicalendar

/**
  * Created by ganeshchand on 10/16/16.
  */

class NepaliDate() {
  /**
    *
    * @param adDate Date in AD format
    * @return BS Date in String
    */
  def date(adDate: String) = "2072/09/17"
}

class AdDate() {
  def date(bsDate: String) = "2016/01/01"
}

class NepaliCalendar {
  def ADtoBS = new NepaliDate()
  def BStoAD = new AdDate()
}
