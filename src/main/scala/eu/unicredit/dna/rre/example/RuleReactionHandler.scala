package eu.unicredit.dna.rre.example

import akka.actor.{ActorLogging, Props, UntypedActor}

/**
  * Created by IntelliJ IDEA.
  * User: frico
  * Date: 4/2/16
  * Time: 10:57
  */
class RuleReactionHandler extends UntypedActor with ActorLogging {

  @throws[Exception](classOf[Exception])
  override def onReceive(message: Any): Unit = {
    log.debug(s"Reacting on: $message")
  }

}

object RuleReactionHandler {
  def props() = Props(new RuleReactionHandler())
}
