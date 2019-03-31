package com.harana.slinky.nivo.calendar

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Calendar")
@js.native
object ReactCalendar extends js.Object

@react object Calendar extends ExternalComponent {

  case class Props(data: Seq[CalendarData],
                   from: String | js.Date,
                   width: Int,
                   height: Int,
                   domain: Option[String | Seq[Int]] = None,
                   direction: Option[String] = None,
                   colors: Option[Seq[String]] = None,
                   emptyColor: Option[String] = None,
                   yearLegend: Option[Int => String | Int] = None,
                   yearSpacing: Option[Int] = None,
                   monthBorderWidth: Option[Int] = None,
                   monthLegendOffset: Option[Int] = None,
                   monthBorderColor: Option[String] = None,
                   daySpacing: Option[Int] = None,
                   dayBorderWidth: Option[Int] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   isInteractive: Option[Boolean] = None,
                   onClick: Option[(CalendarData, SyntheticMouseEvent) => HTMLElement] = None,
                   tooltip: Option[Tooltip => HTMLElement] = None)

  override val component = ReactCalendar
}

case class CalendarData(day: String, value: Int)

case class Tooltip(day: String,
                   date: js.Date,
                   value: Int,
                   color: String,
                   x: Int,
                   y: Int,
                   size: Int)