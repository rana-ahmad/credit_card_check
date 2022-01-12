val df : Array[Int] = Array(1, 5, 6, 3, 8, 5)
def fib (x: Int = 0): Array[Int] = {
  var countDown = 0
  var result = Array(0, 1)
  if (x <= 1) result = Array(1)
  else{
    while (countDown <= x){
      result = result.appended(result(countDown)+result(countDown+1))
      countDown += 1
    }
  }
  result
}

fib(7)

// filter numbers divisible by 3

def numList(x: Int): List[Int] = {
  var cDown = x
  var nums: List[Int] = List()
  while (cDown >= 0){
    nums = nums.appended(cDown)
    cDown -= 1
  }
  nums.sorted
}

val numListTest = numList(20)

numListTest.filter(_ % 3 == 0)
numListTest.map(_.%(3)==0)