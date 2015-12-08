package org.dialang.common.model

import java.sql.ResultSet

class Answer(rs: ResultSet) {

  val id = rs.getInt("id")
  val itemId = rs.getInt("item_id")
  val text = rs.getString("text")
  val correct = if (rs.getInt("correct") == 1) true else false
}
