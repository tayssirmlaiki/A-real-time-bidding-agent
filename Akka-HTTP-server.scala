import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import scala.io.StdIn

object WebServer extends App {
		

    implicit val actorSystem = akka.actor.ActorSystem("messaging-actorsystem")
    implicit val materializer = ActorMaterializer()
    implicit val executionContext = actorSystem.dispatcher
		
    
    def helloRoute: Route = pathEndOrSingleSlash {
        complete("Welcome to messaging service")
    }
		
  
    val binding = Http().bindAndHandle(helloRoute, "localhost", 8080)
    println("Server running...")
		
   
    StdIn.readLine()
    binding.flatMap(_.unbind()).onComplete(_ => actorSystem.terminate())
    println("Server is shut down")
}
