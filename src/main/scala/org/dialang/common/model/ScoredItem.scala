package org.dialang.common.model

class ScoredItem(item: Item) extends Serializable {

  val id = item.id
  val itemType = item.itemType
  val skill = item.skill
  val subskill = item.subskill
  val text = item.text
  val weight = item.weight

  var score = 0
  var correct = false
  var basketId = 0
  var positionInBasket = 0
  var positionInTest = 0
  var responseId = 0
  var responseText = ""
  var answers = List[Answer]()

  def toCase:ImmutableItem = {
    val immutableAnswers = answers.map(a => ImmutableAnswer(a.id,a.itemId,a.text,a.correct))
    ImmutableItem(id,itemType,skill,subskill,text,weight,score,correct,basketId,positionInBasket,positionInTest,responseId,responseText,immutableAnswers)
  }
}
