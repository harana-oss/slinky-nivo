package com.harana.slinky.nivo.bar

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "BarCanvas")
object ReactBarCanvas extends js.Object

@react object BarCanvas extends ExternalComponent {

  case class Props(data: Seq[js.Object],
                   indexBy: Option[String | Unit => String] = None,
                   keys: Option[Seq[String]] = None,
                   width: Int,
                   height: Int,
                   layers: Option[Seq[String]] = None,
                   groupMode: Option[String] = None,
                   layout: Option[String] = None,
                   reverse: Option[Boolean] = None,
                   minValue: Option[Int | String] = None,
                   maxValue: Option[Int | String] = None,
                   padding: Option[Int] = None,
                   innerPadding: Option[Int] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String] = None,
                   borderRadius: Option[Int] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | Unit => String] = None,
                   defs: Option[Seq[js.Object]] = None,
                   fill: Option[Seq[js.Object]] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableLabel: Option[Boolean] = None,
                   label: Option[String | Unit => String] = None,
                   labelFormat: Option[String | Unit => String] = None,
                   labelSkipWidth: Option[Int] = None,
                   labelSkipHeight: Option[Int] = None,
                   labelTextColor: Option[String | Unit => String] = None,
                   enableGridX: Option[Boolean] = None,
                   gridXValues: Option[Seq[Int | String]] = None,
                   enableGridY: Option[Boolean] = None,
                   gridYValues: Option[Seq[Int | String]] = None,
                   axisTop: Option[js.Object] = None,
                   axisRight: Option[js.Object] = None,
                   axisBottom: Option[js.Object] = None,
                   axisLeft: Option[js.Object] = None,
                   isInteractive: Option[Boolean] = None,
                   tooltip: Option[Tooltip => HTMLElement] = None,
                   onClick: Option[(OnClick, SyntheticMouseEvent) => HTMLElement] = None,
                   legends: Option[Seq[js.Object]] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactBarCanvas
}