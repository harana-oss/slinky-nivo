package com.harana.slinky.nivo.heatmap

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.{HTMLElement, SVGElement}
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "HeatMapCanvas")
@js.native
object ReactHeatMapCanvas extends js.Object

@react object HeatMapCanvas extends ExternalComponent {

  case class Props(data: Seq[HeatMapData],
                   indexBy: Option[String | Unit => String] = None,
                   keys: Option[Seq[String]] = None,
                   width: Int,
                   height: Int,
                   pixelRatio: Option[Int] = None,
                   minValue: Option[Int | String] = None,
                   maxValue: Option[Int | String] = None,
                   forceSquare: Option[Boolean] = None,
                   sizeVariation: Option[Int] = None,
                   padding: Option[Int] = None,
                   cellShape: Option[String | CellShape => SVGElement] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   cellOpacity: Option[Double] = None,
                   cellBorderWidth: Option[Int] = None,
                   cellBorderColor: Option[String | Unit => String] = None,
                   enableLabels: Option[Boolean] = None,
                   labelTextColor: Option[String | Unit => String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableGridX: Option[Boolean] = None,
                   enableGridY: Option[Boolean] = None,
                   axisTop: Option[js.Object] = None,
                   axisRight: Option[js.Object] = None,
                   axisBottom: Option[js.Object] = None,
                   axisLeft: Option[js.Object] = None,
                   isInteractive: Option[Boolean] = None,
                   onClick: Option[(HeatMapData, SyntheticMouseEvent) => HTMLElement] = None,
                   hoverTarget: Option[String] = None,
                   cellHoverOpacity: Option[Double] = None,
                   cellHoverOthersOpacity: Option[Double] = None)

  override val component = ReactHeatMapCanvas
}