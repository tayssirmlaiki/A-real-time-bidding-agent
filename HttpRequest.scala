//simple GET requests:
HttpRequest(uri = "https://...")

// or:
import akka.http.scaladsl.client.RequestBuilding.Get
Get("https://...")

// with query params
Get("https://...")



//Or complicated POST requests:
HttpRequest(
  method = HttpMethods.POST,
  uri = "https://...",
  entity = HttpEntity(ContentTypes.`text/plain(UTF-8)`, "data")
)

// or:
import akka.http.scaladsl.client.RequestBuilding.Post
Post("https://...", "data")


//convert the response entity into an object:
import akka.http.scaladsl.unmarshalling.Unmarshal
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json.DefaultJsonProtocol._

case class Pet(name: String)
implicit val petFormat = jsonFormat1(Pet)

val pet: Future[Pet] = Unmarshal(response).to[Pet]
