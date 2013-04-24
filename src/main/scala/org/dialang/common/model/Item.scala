package org.dialang.common.model

import java.sql.ResultSet

class Item(rs:ResultSet) {

  var score = 0
  var correct = false

  val id = rs.getInt("id")
  val itemType = rs.getString("type")
  val skill = rs.getString("skill")
  val text = rs.getString("text")
  val weight = rs.getInt("weight")

  override def toString = {
    s"ID: $id\nTYPE: $itemType\nSKILL: $skill\nTEXT: $text\nWEIGHT: $weight\nSCORE: $score\nCORRECT: $correct\n"
  }
}
