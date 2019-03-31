package com.harana.slinky.nivo.scatter_plot

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "ScatterPlotCanvas")
@js.native
object ReactScatterPlotCanvas extends js.Object

@react object ScatterPlotCanvas extends ExternalComponent {

  case class Props(data: Seq[ScatterPlotData],
                   xScale: Option[js.Object] = None,
                   yScale: Option[js.Object] = None,
                   width: Int,
                   height: Int,
                   pixelRation: Option[Int] = None,
                   layers: Option[String] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String | ScatterPlotData => String] = None,
                   symbolSize: Option[Int] = None,
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
                   debugMesh: Option[Boolean] = None,
                   tooltip: Option[Tooltip => HTMLElement] = None,
                   onMouseEnter: Option[(ScatterPlotData, SyntheticMouseEvent) => Unit] = None,
                   onMouseMove: Option[(ScatterPlotData, SyntheticMouseEvent) => Unit] = None,
                   onMouseLeave: Option[(ScatterPlotData, SyntheticMouseEvent) => Unit] = None,
                   onClick: Option[(ScatterPlotData, SyntheticMouseEvent) => Unit] = None)

  override val component = ReactScatterPlotCanvas
}