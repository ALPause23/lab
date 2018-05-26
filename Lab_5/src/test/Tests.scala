package Tests

import org.scalatest._
/*
class RestSpec extends FunSpec with Matchers{

}*/
class Tests extends FlatSpec with Matchers{


  "it" should "definite integral of a function" in {
    val res0 = Main.integralRec(5 * x * x - 3 * x + 5, 0.02, 1, 2)
    val res1 = Main.integralTailRec(x => 5 * x * x - 3 * x + 5, 0.02, 1, 2)

    assert(res0 === 12.167 +- 0.02)
    assert(res1 === 12.167 +- 0.02)
  }

}
