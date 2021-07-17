object Permutations {
  def main(args: Array[String]): Unit = {
    val s = "abc"
    generatePermutations(s, 0, s.length-1)
  }

  def swap(s: String, i: Int, k: Int): String = {
    val arr = s.toCharArray
    arr(i) = s.charAt(k)
    arr(k) = s.charAt(i)
    arr.mkString("")
  }

  def generatePermutations(s: String, left: Int, right: Int): Unit = {
    if (left == right) {
      println(s)
    } else {
      for (i <- left to right) {
        val swapped_s = swap(s, left, i)
        generatePermutations(swapped_s, left+1, right)
      }
    }
  }
}