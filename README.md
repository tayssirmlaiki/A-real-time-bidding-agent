# Real-time bidding agent
Actor-Bidding-Agent.scala => 
This small piece of code defines two message types, one for commanding the Actor to greet the Bidding Agent and one that the Actor will use to confirm that it has done so. The Greet type contains not only the information of whom to greet, it also holds an ActorRef that the sender of the message supplies so that the HelloBiddingAgent Actor can send back the confirmation message.
