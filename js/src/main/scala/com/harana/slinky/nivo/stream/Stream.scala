package com.harana.slinky.nivo.stream

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Stream")
@js.native
object ReactStream extends js.Object

@react object Stream extends ExternalComponent {

  type StreamData = js.Object

  case class Props(data: Seq[StreamData],
                   width: Int,
                   height: Int,
                   offsetType: Option[String] = None,
                   order: Option[String] = None,
                   curve: Option[String] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   fillOpacity: Option[Double] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | Unit => String ] = None,
                   defs: Option[Seq[js.Object]] = None,
                   fill: Option[Seq[js.Object]] = None,
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
                   enableDots: Option[Boolean] = None,
                   renderDot: Option[Unit => Unit] = None,
                   dotSize: Option[Int | StreamData => Int] = None,
                   dotColor: Option[String | StreamData => String] = None,
                   dotBorderWidth: Option[Int | StreamData => Int] = None,
                   dotBorderColor: Option[String | StreamData => String] = None,
                   isInteractive: Option[Boolean] = None,
                   enableStackTooltip: Option[Boolean] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactStream
}