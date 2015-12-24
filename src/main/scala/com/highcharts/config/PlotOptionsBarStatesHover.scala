/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.0 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class PlotOptionsBarStatesHover extends js.Object {
  
  /**
   * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
   * @example Disable hover on <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/" target="_blank">line</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/" target="_blank">column</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/" target="_blank">pie</a>
   * @since 1.2
   */
  var enabled: Boolean = true
  
  /**
   * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/halo/" target="_blank">Halo options</a>
   * @since 4.0
   */
  var halo: UndefOr[js.Object] = js.undefined
  
  /**
   * Pixel with of the graph line.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/" target="_blank">5px line on hover</a>
   */
  var lineWidth: Double = 2
  
  /**
   * The additional line width for the graph of a hovered series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">5 pixels wider</a>
   * @since 4.0.3
   */
  var lineWidthPlus: Double = 1
  
  var marker: UndefOr[PlotOptionsBarStatesHoverMarker] = js.undefined
}