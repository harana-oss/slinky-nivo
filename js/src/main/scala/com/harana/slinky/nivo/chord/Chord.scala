package com.harana.slinky.nivo.chord

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Chord")
@js.native
object ReactChord extends js.Object

@react object Chord extends ExternalComponent {

  case class Props(matrix: Seq[Seq[Int]],
                   keys: Seq[String],
                   width: Int,
                   height: Int,
                   padAngle: Option[Int] = None,
                   innerRadiusRatio: Option[Int] = None,
                   innerRadiusOffset: Option[Int] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   arcOpacity: Option[Double] = None,
                   arcBorderWidth: Option[Int] = None,
                   arcBorderColor: Option[String | Unit => String] = None,
                   ribbonOpacity: Option[Double] = None,
                   ribbonBorderWidth: Option[Int] = None,
                   ribbonBorderColor: Option[String | Unit => String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableLabel: Option[Boolean] = None,
                   label: Option[String | Unit => String] = None,
                   labelOffset: Option[Int] = None,
                   labelRotation: Option[Int] = None,
                   labelTextColor: Option[String | Unit => String] = None,
                   isInteractive: Option[Boolean] = None,
                   arcHoverOpacity: Option[Double] = None,
                   arcHoverOthersOpacity: Option[Double] = None,
                   ribbonHoverOpacity: Option[Double] = None,
                   ribbonHoverOthersOpacity: Option[Double] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactChord
}