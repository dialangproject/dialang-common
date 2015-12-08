package org.dialang.common.model

case class ImmutableItem(id: Int, itemType: String, skill: String, subskill: String, text: String,
                      weight: Int, score: Int, correct: Boolean, basketId: Int, positionInBasket: Int,
                      positionInTest: Int, responseId: Int, responseText: String, answers: List[ImmutableAnswer])
