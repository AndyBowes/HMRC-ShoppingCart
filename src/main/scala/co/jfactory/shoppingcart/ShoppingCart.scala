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

  def value = contents.foldLeft(0.0){ (total, item) => total + priceItem(item)}

  def priceItem(item: Product) = item match {
    case _ :Apple => 0.60
    case _ :Orange => 0.25
    case _ => throw new IllegalArgumentException("Unexpected Item in Bagging Area")
  }

}
