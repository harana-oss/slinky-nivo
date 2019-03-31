package com.harana.slinky.nivo.sankey

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Sankey")
@js.native
object ReactSankey extends js.Object

@react object Sankey extends ExternalComponent {

  case class Props(data: Seq[SankeyData],
                   width: Int,
                   height: Int,
                   layout: Option[String] = None,
                   align: Option[String] = None,
                   sort: Option[String | Unit => String | (SankeyDataNode, SankeyDataNode) => String] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   nodeThickness: Option[Int] = None,
                   nodeOpacity: Option[Double] = None,
                   nodeHoverOpacity: Option[Double] = None,
                   nodeSpacing: Option[Int] = None,
                   nodeInnerPadding: Option[Int] = None,
                   nodeBorderWidth: Option[Int] = None,
                   nodeBorderColor: Option[String | Unit => String] = None,
                   linkOpacity: Option[Double] = None,
                   linkHoverOpacity: Option[Double] = None,
                   linkContract: Option[Int] = None,
                   linkBlendMode: Option[String] = None,
                   enableLinkGradient: Option[Boolean] = None,
                   enableLabels: Option[Boolean] = None,
                   labelPosition: Option[String] = None,
                   labelPadding: Option[Int] = None,
                   labelTextColor: Option[String | Unit => String] = None,
                   labelOrientation: Option[String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   isInteractive: Option[Boolean] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactSankey
}

case class SankeyData(nodes: Seq[SankeyDataNode], links: Seq[SankeyDataLink])
case class SankeyDataNode(id: String | Int)
case class SankeyDataLink(source: String | Int, target: String | Int, value: Double | Int)