/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-errorbar-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsErrorbarPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsErrorbarPointEvents]] = js.undefined
}

object PlotOptionsErrorbarPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsErrorbarPointEvents]] = js.undefined): PlotOptionsErrorbarPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsErrorbarPointEvents]] = events
    new PlotOptionsErrorbarPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsErrorbarPointEvents]] = eventsOuter
    }
  }
}
