package com.harana.slinky.nivo.pie

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Pie")
object ReactPie extends js.Object

@react object Pie extends ExternalComponent {

  case class Props(data: Seq[PieData],
                   width: Int,
                   height: Int,
                   startAngle: Option[Int] = None,
                   endAngle: Option[Int] = None,
                   fit: Option[Boolean] = None,
                   innerRadius: Option[Int] = None,
                   padAngle: Option[Int] = None,
                   cornerRadius: Option[Int] = None,
                   sortByValue: Option[Boolean] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String | PieData => String] = None,
                   defs: Option[Seq[js.Object]] = None,
                   fill: Option[Seq[js.Object]] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | Unit => String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableRadialLabels: Option[Boolean] = None,
                   radialLabel: Option[String | Unit => String] = None,
                   radialLabelsSkipAngle: Option[Int] = None,
                   radialLabelsLinkOffset: Option[Int] = None,
                   radialLabelsLinkDiagonalLength: Option[Int] = None,
                   radialLabelsLinkHorizontalLength: Option[Int] = None,
                   radialLabelsTextXOffset: Option[Int] = None,
                   radialLabelsLinkStrokeWidth: Option[Int] = None,
                   radialLabelsTextColor: Option[String | Unit => String] = None,
                   radialLabelsLinkColor: Option[String | Unit => String] = None,
                   enableSlicesLabels: Option[Boolean] = None,
                   sliceLabel: Option[String | Unit => String] = None,
                   slicesLabelsSkipAngle: Option[Int] = None,
                   slicesLabelsTextColor: Option[String | Unit => String] = None,
                   isInteractive: Option[Boolean] = None,
                   onClick: Option[(PieData, SyntheticMouseEvent) => HTMLElement] = None,
                   tooltip: Option[Tooltip => HTMLElement])

  override val component = ReactPie
}