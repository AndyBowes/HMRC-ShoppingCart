package co.jfactory.shoppingcart

import scala.collection.mutable.ListBuffer

sealed trait Product

class Apple extends Product

class Orange extends Product

class ShoppingCart() {

  val contents = new ListBuffer[Product]()

  def add(item: Product) {
    contents += item
  }

  def size = contents.length

  def value = {
    val groups: Map[Product, Int] = contents.groupBy[Product](p => p).map(g => Pair(g._1, g._2.size))
    groups.foldLeft(0.0){ (total, items) => total + applyDiscount(items._1,items._2)}
  }

  def priceItem(item: Product) = item match {
    case _ :Apple => 0.60
    case _ :Orange => 0.25
    case _ => throw new IllegalArgumentException("Unexpected Item in Bagging Area")
  }

  def applyDiscount(item: Product, count: Int) = item match {
    case _: Apple => priceItem(item) * (count/2 + count%2)
    case _: Orange => priceItem(item) * (2*count/3 + count%3)
    case _ => throw new IllegalArgumentException("Unexpected Item in Bagging Area")
  }

}
gst