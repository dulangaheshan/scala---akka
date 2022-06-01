package org.d5han
package playground

import akka.actor.{ActorSelection, ActorSystem}

object Playground extends App {

  val actorSystem =ActorSystem("HelloAkka")
  println(actorSystem.name)

}
