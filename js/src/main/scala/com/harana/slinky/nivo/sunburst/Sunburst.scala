package com.harana.slinky.nivo.sunburst

import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Sunburst")
object ReactSunburst extends js.Object

@react object Sunburst extends ExternalComponent {

  case class Props(data: SunburstData,
                   width: Int,
                   height: Int,
                   identity: Option[String | SunburstData => String] = None,
                   value: Option[String | SunburstData => String] = None,
                   colors: Option[String | Unit => String | Seq[String]] = None,
                   colorBy: Option[String | SunburstData => String] = None,
                   childColor: Option[String | SunburstData => String] = None,
                   borderWidth: Option[Int] = None,
                   cornerRadius: Option[Int] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   isInteractive: Option[Boolean] = None)

  override val component = ReactSunburst
}

case class SunburstData(name: String, color: String, children: Seq[SunburstData])