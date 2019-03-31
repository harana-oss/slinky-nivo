package com.harana.slinky.nivo.parallel_coordinates

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "ParallelCoordinates")
@js.native
object ReactParallelCoordinates extends js.Object

@react object ParallelCoordinates extends ExternalComponent {

  case class Props(data: Seq[js.Object],
                   variables: Seq[js.Object],
                   width: Int,
                   height: Int,
                   layout: Option[String] = None,
                   curve: Option[String] = None,
                   axesPlan: Option[String] = None,
                   axesTicksPosition: Option[String] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String] = None,
                   strokeWidth: Option[Int] = None,
                   lineOpacity: Option[Double] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactParallelCoordinates
}