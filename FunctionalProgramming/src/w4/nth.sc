package w4

import w4._

object nth{
    def nth[T](n: Int, xs: List[T]): T =
        if (xs.isEmpty) throw new IndexOutOfBoundsException
        else if (n == 0) xs.head
        else nth(n-1, xs.tail)                    //> nth: [T](n: Int, xs: w4.List[T])T
     
     val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : w4.Cons[Int] = w4.Cons@6108b2d7
     
     nth(2, list)                                 //> res0: Int = 3
     nth(-1, list)                                //> java.lang.IndexOutOfBoundsException
                                                  //| 	at w4.nth$$anonfun$main$1.nth$1(w4.nth.scala:7)
                                                  //| 	at w4.nth$$anonfun$main$1.apply$mcV$sp(w4.nth.scala:14)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at w4.nth$.main(w4.nth.scala:5)
                                                  //| 	at w4.nth.main(w4.nth.scala)
}