import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }

object ActorBiddingAgent {
  final case class Bid(whom: String, replyTo: ActorRef[Bidding])
  final case class Bidding(whom: String, from: ActorRef[Bid])

  def apply(): Behavior[Bid] = Behaviors.receive { (context, message) =>
    context.log.info("Bidding Agent {}!", message.whom)
    message.replyTo ! Bidding(message.whom, context.self)
    Behaviors.same
  }
}
