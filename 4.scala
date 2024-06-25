object Main extends App{
  def Cost(p: Int): Int = 500 + Attendence(p)*3
  def Attendence(p: Int): Int = 120 +(15-p)*4
  def Revenue(p: Int): Int = Attendence(p)*p
  def Profit(p: Int): Int = Revenue(p) - Cost(p)



  println("Ticket Price")
  println(s"10 => ${Profit(10)}")
  println(s"15 => ${Profit(15)}")
  println(s"20 => ${Profit(20)}")
  println(s"25 => ${Profit(25)}")
 }
