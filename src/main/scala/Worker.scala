package pps

import pps.worker.Worker

object Workers {
  private[this] val friends = List("corina", "gorini", "angelini", "maldini")
  val workers: Set[Worker] = (friends map { SimpleWorker(_) }).toSet
}

case class SimpleWorker(val name: String) extends Worker {
  override def work(): Unit = println(s"${name} is working...")
}