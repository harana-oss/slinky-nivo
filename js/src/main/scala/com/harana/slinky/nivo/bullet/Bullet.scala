package com.harana.slinky.nivo.bullet

import com.harana.slinky.bootstrap.{ReactNode, SyntheticMouseEvent}
import slinky.core.ExternalComponent
import slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@JSImport("react-nivo", "Bullet")
object ReactBullet extends js.Object

@react object Bullet extends ExternalComponent {

  case class Props(root: Seq[BulletData],
                   width: Int,
                   height: Int,
                   layout: Option[String] = None,
                   reverse: Option[Boolean] = None,
                   spacing: Option[Int] = None,
                   measureSize: Option[Int] = None,
                   markerSize: Option[Int] = None,
                   marginTop: Option[Int] = None,
                   marginRight: Option[Int] = None,
                   marginBottom: Option[Int] = None,
                   marginLeft: Option[Int] = None,
                   rangeComponent: Option[ReactNode] = None,
                   rangeColors: Option[String | Unit => String | Seq[String]] = None,
                   measureComponent: Option[ReactNode] = None,
                   measureColors: Option[String | Unit => String | Seq[String]] = None,
                   markerComponent: Option[ReactNode] = None,
                   markerColors: Option[String | Unit => String | Seq[String]] = None,
                   axisPosition: Option[String] = None,
                   titlePosition: Option[String] = None,
                   titleAlign: Option[String] = None,
                   titleOffsetX: Option[Int] = None,
                   titleOffsetY: Option[Int] = None,
                   titleRotation: Option[Int] = None,
                   onRangeClick: Option[(OnRangeClick, SyntheticMouseEvent) => Unit] = None,
                   onMeasureClick: Option[(OnMeasureClick, SyntheticMouseEvent) => Unit] = None,
                   animate: Option[Boolean] = None,
                   motionStiffness: Option[Int] = None,
                   motionDamping: Option[Int] = None)

  override val component = ReactBullet
}

case class BulletData(id: String | Int,
                      title: Option[ReactNode],
                      subtitle: Option[ReactNode],
                      data: Option[BulletDataData])

case class BulletDataData(ranges: Seq[Int],
                          measures: Seq[Int],
                          markers: Seq[Int])

case class OnRangeClick(id: String,
                        v0: Int,
                        v1: Int,
                        index: Int,
                        color: String)

case class OnMeasureClick(id: String,
                          v0: Int,
                          v1: Int,
                          index: Int,
                          color: String)