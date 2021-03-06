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
  * @note JavaScript name: <code>plotOptions</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptions extends js.Object {

  /**
    * The heatmap series type, a special case of a choropleth map where each point is a square colored to signify a value. Heatmaps are available both in Highmaps and in Highcharts since version 4.
    * @example <ul>
<li><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap/" target="_blank">Basic heatmap</a></li>
<li><a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/demo/heatmap-canvas/" target="_blank">Extended heatmap rendered on canvas for greater performance</a></li>
</ul>
    */
  val heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = js.undefined

  /**
    * The map series type is the default series type of a Highcharts map, where each point is represented by an area given by its <code>path</code> option of the path option of its corresponding <code>mapData</code> point.
    */
  val map: js.UndefOr[CleanJsObject[PlotOptionsMap]] = js.undefined

  /**
    * A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
    */
  val mapbubble: js.UndefOr[CleanJsObject[PlotOptionsMapbubble]] = js.undefined

  /**
    * Mapline series represent paths or lines in a map, all features that don't have an area. It can typically be used for rivers or roads, or for separator lines to distinguish overseas territories. For separator lines, set <code>enableMouseTracking</code> to false to turn off interactivity.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/" target="_blank">Map lines and points</a>
    */
  val mapline: js.UndefOr[CleanJsObject[PlotOptionsMapline]] = js.undefined

  /**
    * <p>A <code>mappoint</code> series is a scatter series laid on top of a map, where X and Y values relate to the coordinate system established by the paths used for the main map series. In Highmaps it is typically used to mark cities. The only difference from a Highcharts scatter series is that the data labels are by default enabled and formatted to display the name of the point.</p>
    * 
    * <p>For documentation on how to use the mappoint series, see <a href="http://api.highcharts.com/highcharts#plotOptions.scatter">scatter series</a> in the basic Highcharts API.</p>
    * @example  <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/" target="_blank">Lines and points in maps</a>
    */
  val mappoint: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>General options for all series types.</p>
    */
  val series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = js.undefined
}

object PlotOptions {
  /**
    * @param heatmap The heatmap series type, a special case of a choropleth map where each point is a square colored to signify a value. Heatmaps are available both in Highmaps and in Highcharts since version 4.
    * @param map The map series type is the default series type of a Highcharts map, where each point is represented by an area given by its <code>path</code> option of the path option of its corresponding <code>mapData</code> point.
    * @param mapbubble A bubble series is a three dimensional series type where each point renders an X, Y and Z value. Each points is drawn as a bubble where the position along the X and Y axes mark the X and Y values, and the size of the bubble relates to the Z value.
    * @param mapline Mapline series represent paths or lines in a map, all features that don't have an area. It can typically be used for rivers or roads, or for separator lines to distinguish overseas territories. For separator lines, set <code>enableMouseTracking</code> to false to turn off interactivity.
    * @param mappoint <p>A <code>mappoint</code> series is a scatter series laid on top of a map, where X and Y values relate to the coordinate system established by the paths used for the main map series. In Highmaps it is typically used to mark cities. The only difference from a Highcharts scatter series is that the data labels are by default enabled and formatted to display the name of the point.</p>. . <p>For documentation on how to use the mappoint series, see <a href="http://api.highcharts.com/highcharts#plotOptions.scatter">scatter series</a> in the basic Highcharts API.</p>
    * @param series <p>General options for all series types.</p>
    */
  def apply(heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = js.undefined, map: js.UndefOr[CleanJsObject[PlotOptionsMap]] = js.undefined, mapbubble: js.UndefOr[CleanJsObject[PlotOptionsMapbubble]] = js.undefined, mapline: js.UndefOr[CleanJsObject[PlotOptionsMapline]] = js.undefined, mappoint: js.UndefOr[js.Object] = js.undefined, series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = js.undefined): PlotOptions = {
    val heatmapOuter: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = heatmap
    val mapOuter: js.UndefOr[CleanJsObject[PlotOptionsMap]] = map
    val mapbubbleOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubble]] = mapbubble
    val maplineOuter: js.UndefOr[CleanJsObject[PlotOptionsMapline]] = mapline
    val mappointOuter: js.UndefOr[js.Object] = mappoint
    val seriesOuter: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = series
    new PlotOptions {
      override val heatmap: js.UndefOr[CleanJsObject[PlotOptionsHeatmap]] = heatmapOuter
      override val map: js.UndefOr[CleanJsObject[PlotOptionsMap]] = mapOuter
      override val mapbubble: js.UndefOr[CleanJsObject[PlotOptionsMapbubble]] = mapbubbleOuter
      override val mapline: js.UndefOr[CleanJsObject[PlotOptionsMapline]] = maplineOuter
      override val mappoint: js.UndefOr[js.Object] = mappointOuter
      override val series: js.UndefOr[CleanJsObject[PlotOptionsSeries]] = seriesOuter
    }
  }
}
