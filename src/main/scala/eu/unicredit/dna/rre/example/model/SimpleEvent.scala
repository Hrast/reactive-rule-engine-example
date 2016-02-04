package eu.unicredit.dna.rre.example.model

import eu.unicredit.dna.rre.{Reaction, DroolsMessage}

/**
  * Created by IntelliJ IDEA.
  * User: frico
  * Date: 4/2/16
  * Time: 17:04
  */
case class SimpleEvent(id:String) extends DroolsMessage with Reaction
