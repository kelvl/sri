package chandu0101.scalajs.sri.mobile.components

import chandu0101.macros.tojs.JSMacro

import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.{UndefOr, undefined}

/**
 * Created by chandrasekharkode on 4/1/15.
 */
case class EdgeInsets(top: UndefOr[Double] = undefined,
                      left: UndefOr[Double] = undefined,
                      bottom: UndefOr[Double] = undefined,
                      right: UndefOr[Double] = undefined) {

  val toJS = JSMacro[EdgeInsets](this)

}
