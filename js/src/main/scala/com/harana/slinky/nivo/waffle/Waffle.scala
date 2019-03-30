package com.harana.slinky.nivo.waffle

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Waffle")
object ReactWaffle extends js.Object

@react object Waffle extends ExternalComponent {

  case class Props(data: Seq[WaffleData],
                   total: Int,
                   rows: Int,
                   columns: Int,
                   padding: Int,
                   width: Int,
                   height: Int,
                   fillDirection: Option[String] = None,
                   cellComponent: Option[Unit => HTMLElement] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String | WaffleData => String] = None,
                   emptyColor: Option[String] = None,
                   emptyOpacity: Option[Int] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | Unit => String] = None,
                   defs: Option[Seq[js.Object]] = None,
                   fill: Option[Seq[js.Object]] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   onClick: Option[(WaffleData, SyntheticMouseEvent) => Unit] = None,
                   tooltip: Option[Tooltip => HTMLElement] = None,
                   legends: Option[Seq[js.Object]] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactWaffle
}