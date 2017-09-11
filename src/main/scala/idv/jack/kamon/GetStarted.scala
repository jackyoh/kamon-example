package idv.jack.kamon

import kamon.Kamon

object GetStarted {

  def main(args: Array[String]): Unit = {
    Kamon.start()

    val someHistogram = Kamon.metrics.histogram("some-histogram")
    val someCounter = Kamon.metrics.counter("some-counter")

    someHistogram.record(42)
    someHistogram.record(50)
    someCounter.increment()

    Thread.sleep(1000)
      
    //Kamon.shutdown()
  }
}
