package demo

import akka.actor.{ActorSystem, Props}
import spray.servlet.WebBoot

// this class is instantiated by the servlet initializer
// it needs to have a default constructor and implement
// the spray.servlet.WebBoot trait
class Boot extends WebBoot {
  // we need an ActorSystem to host our application in
  implicit val system = ActorSystem("SprayApiApp")
 
  //create apiActor
  val apiActor = system.actorOf(Props[DemoService], "apiActor")

  // the service actor replies to incoming HttpRequests
  val serviceActor = apiActor
}
