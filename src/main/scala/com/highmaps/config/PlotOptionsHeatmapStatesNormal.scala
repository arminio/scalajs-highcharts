/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-heatmap-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsHeatmapStatesNormal extends js.Object {

  /**
    * Animation options for the fill color when returning from hover state to normal state. The animation adds some latency in order to reduce the effect of flickering when hovering in and out of for example an uneven coastline.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-states-animation-false/" target="_blank">No animation of fill color</a>
    */
  val animation: js.UndefOr[js.Object | Boolean] = js.undefined
}

object PlotOptionsHeatmapStatesNormal {
  /**
    * @param animation Animation options for the fill color when returning from hover state to normal state. The animation adds some latency in order to reduce the effect of flickering when hovering in and out of for example an uneven coastline.
    */
  def apply(animation: js.UndefOr[js.Object | Boolean] = js.undefined): PlotOptionsHeatmapStatesNormal = {
    val animationOuter: js.UndefOr[js.Object | Boolean] = animation
    new PlotOptionsHeatmapStatesNormal {
      override val animation: js.UndefOr[js.Object | Boolean] = animationOuter
    }
  }
}
