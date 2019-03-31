package com.harana.slinky.nivo.scatter_plot

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "ScatterPlot")
@js.native
object ReactScatterPlot extends js.Object

@react object ScatterPlot extends ExternalComponent {

  case class Props(data: Seq[ScatterPlotData],
                   xScale: Option[js.Object] = None,
                   yScale: Option[js.Object] = None,
                   width: Int,
                   height: Int,
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
                   onClick: Option[(ScatterPlotData, SyntheticMouseEvent) => Unit] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactScatterPlot
}


