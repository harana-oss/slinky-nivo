package com.harana.slinky.nivo.scatter_plot

import scala.scalajs.js
import scala.scalajs.js.|

case class ScatterPlotData(id: String | Int, data: Seq[ScatterPlotDataData])
case class ScatterPlotDataData(x: String | Int | js.Date, y: String | Int | js.Date)
case class Tooltip(id: String | Int, serie: String | Int, color: String, x: Int, y: Int)