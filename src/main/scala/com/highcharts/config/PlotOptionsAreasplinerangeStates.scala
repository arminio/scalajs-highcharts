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
  * @note JavaScript name: <code>plotOptions-areasplinerange-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAreasplinerangeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerangeStatesHover]] = js.undefined
}

object PlotOptionsAreasplinerangeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerangeStatesHover]] = js.undefined): PlotOptionsAreasplinerangeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerangeStatesHover]] = hover
    new PlotOptionsAreasplinerangeStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplinerangeStatesHover]] = hoverOuter
    }
  }
}
