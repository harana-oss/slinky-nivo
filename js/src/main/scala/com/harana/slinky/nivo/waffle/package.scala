package com.harana.slinky.nivo.waffle

import scala.scalajs.js.|

case class WaffleData(id: String | Int,
                      value: Int | Double,
                      label: String | Int | Double,
                      color: String)

case class Tooltip(id: String | Int,
                   value: Int | Double,
                   label: String | Int | Double,
                   position: Int,
                   row: Int,
                   column: Int,
                   groupIndex: Int,
                   startAt: Int,
                   endAt: Int)