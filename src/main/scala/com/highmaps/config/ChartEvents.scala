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
  * @note JavaScript name: <code>chart-events</code>
  */
@js.annotation.ScalaJSDefined
class ChartEvents extends js.Object {

  /**
    * Fires when a series is added to the chart after load time, using the <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Through <code>event.options</code> you can access the series options that was passed to the <code>addSeries</code>  method. Returning false prevents the series from being added.
    */
  val addSeries: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires after a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/" target="_blank">Rescale the chart to print</a>
    * @since 1.1.0
    */
  val afterPrint: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires before a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/events-beforeprint-afterprint/" target="_blank">Rescale the chart to print</a>
    * @since 1.1.0
    */
  val beforePrint: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when clicking on the plot background. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p> <p>Information on the clicked spot can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' value at the clicked spot. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p>
    * <pre>click: function(e) {
    * 	console.log(
    * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value), 
    * 		e.yAxis[0].value
    * 	)
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/events-click/" target="_blank">Record coordinates on click</a>. <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/events-container/" target="_blank">Alternatively, attach event to container</a>
    */
  val click: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when a drilldown point is clicked, before the new series is added. Event arguments include <code>point</code> for the originating point, <code>seriesOptions</code> for the new series and <code>category</code> to indicate whether a category label was clicked.</p>
    * <p>This event is also utilized for async drilldown, where the seriesOptions are not added by option, but rather loaded async.</p>
    */
  val drilldown: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when drilling up from a drilldown series.
    */
  val drillup: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the chart is finished loading. Since v4.2.2, it also waits for images to be loaded, for example from point markers. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p>
    * 
    * <p>There is also a second parameter to the chart constructor where a callback function can be passed to be executed on chart.load.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/events-load/" target="_blank">Add series on chart load</a>
    */
  val load: js.UndefOr[js.Function] = js.undefined

  /**
    * Fires when the chart is redrawn, either after a call to chart.redraw() or after an axis, series or point is modified with the <code>redraw</code> option set to true. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/chart/events-redraw/" target="_blank">Set subtitle on chart redraw</a>
    */
  val redraw: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when an area of the chart has been selected. Selection is enabled by setting the chart's zoomType. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. The default action for the  selection event is to zoom the  chart to the selected area. It can be prevented by calling  <code>event.preventDefault()</code>.</p> <p>Information on the selected area can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p> 
    * <pre>selection: function(event) {
    * 	// log the min and max of the primary, datetime x-axis
    * 	console.log(
    * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),
    * 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max)
    * 	);
    * 	// log the min and max of the y axis
    * 	console.log(event.yAxis[0].min, event.yAxis[0].max);
    * }</pre>
    */
  val selection: js.UndefOr[js.Function] = js.undefined
}

object ChartEvents {
  /**
    * @param addSeries Fires when a series is added to the chart after load time, using the <code>addSeries</code> method. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. Through <code>event.options</code> you can access the series options that was passed to the <code>addSeries</code>  method. Returning false prevents the series from being added.
    * @param afterPrint Fires after a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @param beforePrint Fires before a chart is printed through the context menu item or the <code>Chart.print</code> method. Requires the exporting module.
    * @param click <p>Fires when clicking on the plot background. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p> <p>Information on the clicked spot can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' value at the clicked spot. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p>. <pre>click: function(e) {. 	console.log(. 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', e.xAxis[0].value), . 		e.yAxis[0].value. 	). }</pre>
    * @param drilldown <p>Fires when a drilldown point is clicked, before the new series is added. Event arguments include <code>point</code> for the originating point, <code>seriesOptions</code> for the new series and <code>category</code> to indicate whether a category label was clicked.</p>. <p>This event is also utilized for async drilldown, where the seriesOptions are not added by option, but rather loaded async.</p>
    * @param drillup Fires when drilling up from a drilldown series.
    * @param load <p>Fires when the chart is finished loading. Since v4.2.2, it also waits for images to be loaded, for example from point markers. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.</p>. . <p>There is also a second parameter to the chart constructor where a callback function can be passed to be executed on chart.load.</p>
    * @param redraw Fires when the chart is redrawn, either after a call to chart.redraw() or after an axis, series or point is modified with the <code>redraw</code> option set to true. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts.
    * @param selection <p>Fires when an area of the chart has been selected. Selection is enabled by setting the chart's zoomType. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on  which library is used as the base for Highcharts. The default action for the  selection event is to zoom the  chart to the selected area. It can be prevented by calling  <code>event.preventDefault()</code>.</p> <p>Information on the selected area can be found through <code>event.xAxis</code> and  <code>event.yAxis</code>, which are arrays containing the axes of each dimension and each axis' min and max values. The primary axes are <code>event.xAxis[0]</code> and <code>event.yAxis[0]</code>. Remember the unit of a datetime axis is milliseconds since 1970-01-01 00:00:00.</p> . <pre>selection: function(event) {. 	// log the min and max of the primary, datetime x-axis. 	console.log(. 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].min),. 		Highcharts.dateFormat('%Y-%m-%d %H:%M:%S', event.xAxis[0].max). 	);. 	// log the min and max of the y axis. 	console.log(event.yAxis[0].min, event.yAxis[0].max);. }</pre>
    */
  def apply(addSeries: js.UndefOr[js.Function] = js.undefined, afterPrint: js.UndefOr[js.Function] = js.undefined, beforePrint: js.UndefOr[js.Function] = js.undefined, click: js.UndefOr[js.Function] = js.undefined, drilldown: js.UndefOr[js.Function] = js.undefined, drillup: js.UndefOr[js.Function] = js.undefined, load: js.UndefOr[js.Function] = js.undefined, redraw: js.UndefOr[js.Function] = js.undefined, selection: js.UndefOr[js.Function] = js.undefined): ChartEvents = {
    val addSeriesOuter: js.UndefOr[js.Function] = addSeries
    val afterPrintOuter: js.UndefOr[js.Function] = afterPrint
    val beforePrintOuter: js.UndefOr[js.Function] = beforePrint
    val clickOuter: js.UndefOr[js.Function] = click
    val drilldownOuter: js.UndefOr[js.Function] = drilldown
    val drillupOuter: js.UndefOr[js.Function] = drillup
    val loadOuter: js.UndefOr[js.Function] = load
    val redrawOuter: js.UndefOr[js.Function] = redraw
    val selectionOuter: js.UndefOr[js.Function] = selection
    new ChartEvents {
      override val addSeries: js.UndefOr[js.Function] = addSeriesOuter
      override val afterPrint: js.UndefOr[js.Function] = afterPrintOuter
      override val beforePrint: js.UndefOr[js.Function] = beforePrintOuter
      override val click: js.UndefOr[js.Function] = clickOuter
      override val drilldown: js.UndefOr[js.Function] = drilldownOuter
      override val drillup: js.UndefOr[js.Function] = drillupOuter
      override val load: js.UndefOr[js.Function] = loadOuter
      override val redraw: js.UndefOr[js.Function] = redrawOuter
      override val selection: js.UndefOr[js.Function] = selectionOuter
    }
  }
}
