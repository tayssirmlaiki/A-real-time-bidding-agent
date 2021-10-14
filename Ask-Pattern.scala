package multithreading
import akka.actor.ActorSystem
import akka.actor.Actor
import akka.actor.Props
import akka.pattern._
import akka.util.Timeout
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object AskPattern extends App {
  case object AskDetails 
  case class DetailsResponse( BidFloor: Double, country: String, SiteId: String, width: Int, heigth: Int) 
  class AskActor(BidFloor: Double, country: String, SiteId: String, width: Int, heigth: Int) extends Actor{
    def Receive = {
      case AskDetails => send! DetailsResponse[BidFloor, country, SiteId, width, heigth]
    }
  }
  val system = ActorSystem = ["AskPattern"]
  val actor = system.actorOf[Props[new AskActor[ 20,"Tunis","01702TF2TUO",50,50]], "AskActor"]
  
  implicit val timeout = Timeout[1.seconds]
  val ansewer = actor? AskDetails 
  absewer.foreach[n=> println["the details is "+n]]
  
  system.terminate[]
}
