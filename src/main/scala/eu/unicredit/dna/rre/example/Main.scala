package eu.unicredit.dna.rre.example

import akka.actor.{ActorSystem, Props}
import eu.unicredit.dna.rre.RulesProcessor
import eu.unicredit.dna.rre.example.model.SimpleEvent

/**
  * Created by IntelliJ IDEA.
  * User: frico
  * Date: 29/1/16
  * Time: 18:06
  */
object Main {

  def main(args: Array[String]) {

    val system = ActorSystem("ReactiveRuleEngineExample")
    val reactionHandler = system.actorOf(Props(new RuleReactionHandler()))
    val processor = system.actorOf(Props(new RulesProcessor(reactionHandler, "DnaKIEexample")))


    processor ! new SimpleEvent("AAA")
  }

}
