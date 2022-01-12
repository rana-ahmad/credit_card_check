val test: Int = 3

test match {
  case 1 => println("1")
  case 2 => println("2")
  case 3 => println("3")
  case _ => println("else")
}