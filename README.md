# Real-time bidding agent
1) The  small piece of code   of file "Actor-Bidding-Agent.scala"  defines two message types, one for commanding the Actor to greet the Bidding Agent and one that the Actor will use to confirm that it has done so. The Greet type contains not only the information of whom to greet, it also holds an ActorRef that the sender of the message supplies so that the HelloBiddingAgent Actor can send back the confirmation message.
https://github.com/tayssirmlaiki/tay/blob/main/Actor-Bidding-Agent.scala

2) The  small piece of code   of file "Akka-HTTP-server.scala"  defines web server that welcomes you when you try to access it. When you run it and hit curl http://localhost:8080 on your command line it will return “Welcome to messaging service.
Now that we have a working server.
https://github.com/tayssirmlaiki/tay/blob/main/Akka-HTTP-server.scala

Code of "HttpRequest.scala" : 
An HttpRequest consists of
            a method (GET, POST, etc.)
            a URI (see URI model for more information)
            a seq of headers
            an entity (body data)
            a protocol
-All parameters of HttpRequest.apply have default values set, so headers for example don’t need to be specified if there are none. Many of the parameters types (like HttpEntity and Uri) define implicit conversions for common use cases to simplify the creation of request and response instances.
https://github.com/tayssirmlaiki/tay/blob/main/HttpRequest.scala

3)
