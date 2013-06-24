package org.dialang.common.model

import java.sql.ResultSet

class Item(rs:ResultSet) extends Serializable {

  val id = rs.getInt("id")
  val itemType = rs.getString("type")
  val skill = rs.getString("skill")
  val subskill = rs.getString("subskill").toLowerCase
  val text = rs.getString("text")
  val weight = rs.getInt("weight")

  var score = 0
  var correct = false
  var basketId = 0
  var positionInBasket = 0
  var positionInTest = 0
  var responseId = 0
  var responseText = ""
  var answers = List[Answer]()

  override def toString = {
    s"ID: $id\nTYPE: $itemType\nSKILL: $skill\nSUBSKILL: $subskill\nTEXT: $text\nWEIGHT: $weight\nSCORE: $score\nCORRECT: $correct\n"
  }

  def toCase:ImmutableItem = {
    val immutableAnswers = answers.map(a => ImmutableAnswer(a.id,a.itemId,a.text,a.correct))
    ImmutableItem(id,itemType,skill,subskill,text,weight,score,correct,basketId,positionInBasket,positionInTest,responseId,responseText,immutableAnswers)
  }
}
