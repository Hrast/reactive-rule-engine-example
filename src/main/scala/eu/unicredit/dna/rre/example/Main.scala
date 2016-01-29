package eu.unicredit.dna.rre.example

import akka.actor.{Props, ActorSystem}
import eu.unicredit.dna.rre.RulesProcessor

/**
  * Created by IntelliJ IDEA.
  * User: frico
  * Date: 29/1/16
  * Time: 18:06
  */
class Main {

  val system = ActorSystem("ReactiveRuleEngineExample")
  val processor = system.actorOf(Props(new RulesProcessor(???,"KieSample")))

}
