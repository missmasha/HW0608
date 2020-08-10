object FoodCalculator extends App {
  val food = "potatoes"
  val price = 0.37
  val quantity = 20

  print("It will cost " + price * quantity)
  println(s" eur to buy $quantity kilos of $food")


  println(s"We got ${args.length} arguments")
  println(s"The first argument is ${args(0)}")
  println(s"The second argument is ${args(1)}")
  println(s"The third argument is ${args(2)}")
  val cost = args(0).toFloat * args(1).toInt
  println(s"It will cost $cost eur to buy ${args(1)} kilos of ${args(2)}")


  //TODO make this Calculator more generatic
  //FIXME fix this mistake
}
