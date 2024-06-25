object app{

    def salary(Wh:Int,Oth:Int) : Double = (250 * Wh + 85 * Oth) * (1-0.12); 

    def main(args: Array[String]): Unit = {
        println("Take Home salary of an employee : Rs " + salary(40,30));
    }

}
