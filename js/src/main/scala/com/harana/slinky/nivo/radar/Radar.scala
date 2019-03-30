package com.harana.slinky.nivo.radar

import org.scalajs.dom.raw.SVGElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Radar")
object ReactRadar extends js.Object

@react object Radar extends ExternalComponent {

  case class Props(data: RadarData,
                   indexBy: Option[String | Int] = None,
                   keys: Option[Seq[String | Int]] = None,
                   maxValue: Option[Double | Int | String] = None,
                   width: Int,
                   height: Int,
                   curve: Option[String] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String | RadarData => String] = None,
                   fillOpacity: Option[Int] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | Unit => String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   gridLevels: Option[Int] = None,
                   gridShape: Option[String] = None,
                   gridLabel: Option[GridLabel => SVGElement] = None,
                   gridLabelOffset: Option[Int] = None,
                   enableDots: Option[Boolean] = None,
                   dotSymbol: Option[DotSymbol => SVGElement] = None,
                   dotSize: Option[Int] = None,
                   dotColor: Option[String | Unit => String] = None,
                   dotBorderWidth: Option[Int]  = None,
                   dotBorderColor: Option[String | Unit => String] = None,
                   enableDotLabel: Option[Boolean] = None,
                   dotLabel: Option[String] = None,
                   dotLabelYOffset: Option[Int] = None,
                   isInteractive: Option[Boolean] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactRadar
}

case class RadarData(language: Seq[js.Object], keys: Seq[Int | String], indexBy: String)
case class DotSymbol(size: String, color: String, borderWidth: String, borderColor: String)
case class GridLabel(id: String, anchor: String, angle: Double | Int)