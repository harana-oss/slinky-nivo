package com.harana.slinky.nivo.voronoi

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Voronoi")
@js.native
object ReactVoronoi extends js.Object

@react object Voronoi extends ExternalComponent {

  case class Props(data: Seq[VoronoiData],
                   xDomain: Option[(Int, Int)] = None,
                   yDomain: Option[(Int, Int)] = None,
                   width: Int,
                   height: Int,
                   layers: Option[Seq[String]] = None,
                   enableLinks: Option[Boolean] = None,
                   linkLineWidth: Option[Int] = None,
                   linkLineColor: Option[String] = None,
                   enableCells: Option[Boolean] = None,
                   cellLineWidth: Option[Int] = None,
                   cellLineColor: Option[String] = None,
                   enablePoints: Option[Boolean] = None,
                   pointSize: Option[Int] = None,
                   pointColor: Option[String] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None)

  override val component = ReactVoronoi
}

case class VoronoiData(id: String | Int, x: Int, y: Int)