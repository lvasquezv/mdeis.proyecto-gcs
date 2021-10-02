import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test._
import models.Person

/**
 * add your integration spec here.
 * An integration test will fire up a whole play application in a real (or headless) browser
 */
@RunWith(classOf[JUnitRunner])
class PersonSpec extends Specification {

  "Person.wasBorn" should {

    "compute the year correctly" in {
      val p = Person(1, "Juan", 36)
      p.wasBorn(2021) must beEqualTo(1985)
    }
  }
}

