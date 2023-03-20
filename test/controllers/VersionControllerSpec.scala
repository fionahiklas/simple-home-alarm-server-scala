package controllers

import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest
//import play.api.test.Helpers.{GET, stubControllerComponents}
//import play.api.test.{FakeRequest, Injecting }
import play.api.test._
import play.api.test.Helpers._
import org.scalatestplus.play._

class VersionControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "VersionController GET" should {
    val versionController = new VersionController(stubControllerComponents())
    val version = versionController.index().apply(FakeRequest(GET, "/version"))


    status(version)
  }

}
