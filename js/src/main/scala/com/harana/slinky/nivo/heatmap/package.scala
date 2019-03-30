package com.harana.slinky.nivo.heatmap

import scala.scalajs.js.|

case class CellShape(value: Int,
                     x: Int,
                     y: Int,
                     width: Int,
                     height: Int,
                     color: String,
                     opacity: Int,
                     borderWidth: Int,
                     borderColor: String,
                     textColor: String)

case class HeatMapData(key: String,
                   value: Int,
                   x: Int,
                   xKey: String | Int,
                   y: Int,
                   yKey: String | Int,
                   width: Int,
                   height: Int,
                   opacity: Int)