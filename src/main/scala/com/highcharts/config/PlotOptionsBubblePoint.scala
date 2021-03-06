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
  * @note JavaScript name: <code>plotOptions-bubble-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBubblePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsBubblePointEvents]] = js.undefined
}

object PlotOptionsBubblePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsBubblePointEvents]] = js.undefined): PlotOptionsBubblePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsBubblePointEvents]] = events
    new PlotOptionsBubblePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsBubblePointEvents]] = eventsOuter
    }
  }
}
