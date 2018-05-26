/**
  * This is main object with all function for all tasks.*/
object main {
  /*def main(args: Array[String]): Unit = {
    val listForOneTask = {mutable.MutableList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)}

    println("Первая задача:")
    println("createNewListFilter:")
    println("Наш список:" + listForOneTask)
    println("Список результатов:" + createNewListFilter(listForOneTask))
    println("createNewListRec:")
    println("нАШ СПИСОК:" + listForOneTask)
    println("Список результатов" + createNewListRec(listForOneTask))
    println("\nSecond task:")



  }*/

  /*first task with tail recursion.*/
  def createNewListRec(oldList: mutable.MutableList[Int]): mutable.MutableList[Int] = {
    def checksValueForAdd(newList: mutable.MutableList[Int], value: Int): Unit = {
      if (value % 2 == 0) {
        newList += value
      }
    }

    @tailrec
    def createList(newList: mutable.MutableList[Int], oldList: mutable.MutableList[Int], index: Int): mutable.MutableList[Int] = {
      if (index < oldList.size) {
        checksValueForAdd(newList, oldList(index))
        createList(newList, oldList, index + 1)
      }
      else {
        newList
      }
    }

    createList(mutable.MutableList(), oldList, 0)
  }

  /*The method is for solution first task with subexpression. is input list.*/
  def createNewListFilter(oldList: mutable.MutableList[Int]): mutable.MutableList[Int] =
    oldList.filter((value: Int) => value % 2 == 0)


    // Вариант 11:  Найти определённый интеграл методом трапеций
    def integralTailRec(f: Double => Double, delta: Double, a: Double, b: Double): Double = {

      @tailrec
      def find(a: Double, acc: Double): Double = {
        if (a <= b)
          find(a + delta, acc + f(a) * delta + (f(a + delta) - f(a)) * delta / 2)
        else
          acc
      }

      find(a, 0)
    }

    def integralRec(f: Double => Double, delta: Double, a: Double, b: Double): Double = {
      def find(a: Double): Double = {
        if (a <= b)
          f(a) * delta + (f(a + delta) - f(a)) * delta / 2 + find(a + delta)
        else
          0
      }

      find(a)
    }

}
