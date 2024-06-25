object Mains extends App{

  var a = 2
  var b = 3
  var c = 4
  var d = 5;
  var k = 4.3f;

  var g = a

  println(b * a + c * d)
  println({ val temp = a; a += 1; temp })
  println(-2 * (g - k) + c)
  println({ val temp = c; c += 1; temp })
  println({ c += 1; c = c * a; a += 1; c })
}
