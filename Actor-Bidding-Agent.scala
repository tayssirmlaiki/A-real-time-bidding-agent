package multithreading
import akka.actor.ActorSystem
import akka.actor.Actor
import akka.actor.Props

object ActorBiddingAgent extends App{
  class ActorAgent extends Actor{
    def receive={
      case s:String => println("The "+s)
      case i:Int => println(" in "+i)
    }
    def foo = println("Normal Method")
  }
  val system =ActorSystem ("ActorAgent")
  val actor = system.actorOf(Props[ActorAgent],"ActorAgent")
  
  actor! "Bidding Agent"
  actor! 2021
  system.terminate[]
}
