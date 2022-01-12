def la(x: String): Boolean = {
  val checkNum = x.last.toString.toInt
  val transformedString = x.dropRight(1).reverse.toList.map(_.toString.toInt)
  val sumAcc: List[Long] =
    transformedString
      .zipWithIndex
      .map{
        case (n, idx) =>
          if (idx % 2 == 0) {
            val r = n * 2L
            if (r >= 10) r - 9 else r
          } else n
      }
  val lSum = if(sumAcc.sum % 10 != 0) 10-sumAcc.sum % 10 else 0
  val isValid: Boolean = checkNum==lSum
  isValid
}

val test = la("3594627386829770")