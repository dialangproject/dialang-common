package org.dialang.common.model

case class Basket(id: Int, basketType: String, skill: String, items: List[ImmutableItem])
