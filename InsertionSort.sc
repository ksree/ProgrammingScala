
def insort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y :: ys => insert(y, insort(ys))
}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y :: ys => if(x <=y) x :: xs else y :: insert(x, ys)
}

insort(List(9,8,7,6,5)).map(x => println(x))
