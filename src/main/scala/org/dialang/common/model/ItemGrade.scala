package org.dialang.common.model

class ItemGrade(val ppe:Float,val se:Float,val grade:Int) {

  override def toString = s"PPE: $ppe. SE: $se. GRADE: $grade"
}
