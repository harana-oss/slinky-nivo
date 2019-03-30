package com.harana.slinky.nivo.pie

import scala.scalajs.js.|

case class PieData(id: String | Double | Int, value: Double | Int)

case class Tooltip(id: String | Double | Int,
                   value: Double | Int,
                   label: String | Double | Int,
                   color: String)