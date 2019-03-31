package com.harana.slinky.nivo.bubble

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "BubbleCanvas")
@js.native
object ReactBubbleCanvas extends js.Object

@react object BubbleCanvas extends ExternalComponent {

  case class Props(root: BubbleData,
                   identity: Option[String | BubbleData => String] = None,
                   value: Option[String | BubbleData => String] = None,
                   width: Int,
                   height: Int,
                   pixelRatio: Option[Int] = None,
                   leavesOnly: Option[Boolean] = None,
                   padding: Option[Int] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | BubbleData => String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableLabel: Option[Boolean] = None,
                   label: Option[String | BubbleData => String] = None,
                   labelFormat: Option[String | BubbleData => String] = None,
                   labelSkipWidth: Option[Int] = None,
                   labelSkipHeight: Option[Int] = None,
                   labelTextColor: Option[String | BubbleData => String] = None,
                   labelSkipRadius: Option[Int] = None)

  override val component = ReactBubbleCanvas
}