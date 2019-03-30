package com.harana.slinky.nivo.treemap

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "TreeMap")
object ReactTreeMap extends js.Object

@react object TreeMap extends ExternalComponent {

  case class Props(root: TreeData,
                   identity: Option[String | js.Object => String] = None,
                   value: Option[String | js.Object => String] = None,
                   width: Int,
                   height: Int,
                   tile: Option[String] = None,
                   leavesOnly: Option[Boolean] = None,
                   innerPadding: Option[Int] = None,
                   outerPadding: Option[Int] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String | TreeData => String] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | TreeData => String] = None,
                   defs: Option[Seq[js.Object]] = None,
                   fill: Option[Seq[js.Object]] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   enableLabel: Option[Boolean] = None,
                   label: Option[String | TreeData => String] = None,
                   labelSkipSize: Option[Int] = None,
                   orientLabel: Option[Boolean] = None,
                   labelTextColor: Option[String | TreeData => String] = None,
                   isInteractive: Option[Boolean] = None,
                   onClick: Option[(TreeData, SyntheticMouseEvent) => Unit] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactTreeMap
}