package org.dialang.common.model

import java.sql.ResultSet

class Item(rs:ResultSet) extends Serializable {

  val id = rs.getInt("id")
  val itemType = rs.getString("type")
  val skill = rs.getString("skill")
  val subskill = rs.getString("subskill").toLowerCase
  val text = rs.getString("text")
  val weight = rs.getInt("weight")

  override def toString = {
    s"ID: $id\nTYPE: $itemType\nSKILL: $skill\nSUBSKILL: $subskill\nTEXT: $text\nWEIGHT: $weight"
  }
}
