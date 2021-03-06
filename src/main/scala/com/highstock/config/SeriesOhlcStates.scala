/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;ohlc&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesOhlcStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesOhlcStatesHover]] = js.undefined
}

object SeriesOhlcStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesOhlcStatesHover]] = js.undefined): SeriesOhlcStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesOhlcStatesHover]] = hover
    new SeriesOhlcStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesOhlcStatesHover]] = hoverOuter
    }
  }
}
