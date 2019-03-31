package com.harana.slinky.nivo.geomap

import com.harana.slinky.bootstrap.SyntheticMouseEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "GeoMapCanvas")
@js.native
object ReactGeoMapCanvas extends js.Object

@react object GeoMapCanvas extends ExternalComponent {

  case class Props(width: Int,
                   height: Int,
                   projectionType: Option[Int] = None,
                   projectionScale: Option[Int] = None,
                   projectionTranslation: Option[(Double, Double)] = None,
                   projectionRotation: Option[(Int, Int, Int)] = None,
                   borderWidth: Option[Int] = None,
                   borderColor: Option[String | Unit => String] = None,
                   enableGraticule: Option[Boolean] = None,
                   graticuleLineWidth: Option[Double] = None,
                   graticuleLineColor: Option[String] = None,
                   defs: Option[Seq[js.Object]] = None,
                   fill: Option[Seq[js.Object]] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   isInteractive: Option[Boolean] = None,
                   onClick: Option[(js.Object, SyntheticMouseEvent) => HTMLElement] = None)

  override val component = ReactGeoMapCanvas
}