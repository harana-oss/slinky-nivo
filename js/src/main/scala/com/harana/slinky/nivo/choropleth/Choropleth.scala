package com.harana.slinky.nivo.choropleth

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Choropleth")
object ReactChoropleth extends js.Object

@react object Choropleth extends ExternalComponent {

  case class Props(data: Seq[ChoroplethData],
                   width: Int,
                   height: Int,
                   projectionType: Option[String] = None,
                   projectionScale: Option[Int] = None,
                   projectionTranslation: Option[(Double, Double)] = None,
                   projectionRotation: Option[(Int, Int, Int)] = None,
                   layers: Option[Seq[String]] = None,
                   label: Option[String | ChoroplethData => String] = None,
                   value: Option[String | ChoroplethData => String] = None,
                   valueFormat: Option[String | ChoroplethData => String] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   unknownColor: Option[String] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | Unit => String] = None,
                   enableGraticule: Option[Boolean] = None,
                   graticuleLineWidth: Option[Double] = None,
                   graticuleLineColor: Option[String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   isInteractive: Option[Boolean] = None,
                   onClick: Option[(ChoroplethData, SyntheticMouseEvent) => HTMLElement] = None,
                   tooltip: Option[ChoroplethData => HTMLElement] = None)

  override val component = ReactChoropleth
}