package com.harana.slinky.nivo.line

import org.scalajs.dom.raw.SVGElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Line")
object ReactLine extends js.Object

@react object Line extends ExternalComponent {

  case class Props(data: Seq[LineData],
                   width: Int,
                   height: Int,
                   layers: Option[Seq[String]] = None,
                   curve: Option[String] = None,
                   xScale: Option[js.Object] = None,
                   yScale: Option[js.Object] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String] = None,
                   lineWidth: Option[Int] = None,
                   enableArea: Option[Boolean] = None,
                   areaBaselineValue: Option[Int | String | js.Date] = None,
                   areaOpacity: Option[Double] = None,
                   areaBlendMode: Option[String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableDots: Option[Boolean] = None,
                   dotSymbol: Option[DotSymbol => SVGElement] = None,
                   dotSize: Option[Int] = None,
                   dotColor: Option[String | Unit => String] = None,
                   dotBorderWidth: Option[Int]  = None,
                   dotBorderColor: Option[String | Unit => String] = None,
                   enableDotLabel: Option[Boolean] = None,
                   dotLabel: Option[String] = None,
                   dotLabelYOffset: Option[Int] = None,
                   enableGridX: Option[Boolean] = None,
                   gridXValue: Option[Seq[Int | Double | String]] = None,
                   enableGridY: Option[Boolean] = None,
                   gridYValue: Option[Seq[Int | Double | String]] = None,
                   axisTop: Option[js.Object] = None,
                   axisRight: Option[js.Object] = None,
                   axisBottom: Option[js.Object] = None,
                   axisLeft: Option[js.Object] = None,
                   isInteractive: Option[Boolean] = None,
                   enableStackTooltip: Option[Boolean] = None,
                   tooltip: Option[Unit => String] = None,
                   legends: Option[Seq[js.Object]] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactLine
}


case class LineData(id: String | Double | Int, data: Seq[LineDataData])
case class LineDataData(x: String | Double | Int | js.Date, y: String | Double | Int | js.Date)
case class DotSymbol(size: String, color: String, borderWidth: String, borderColor: String)