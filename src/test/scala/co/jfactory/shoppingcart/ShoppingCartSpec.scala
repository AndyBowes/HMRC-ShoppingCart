package co.jfactory.shoppingcart

import org.scalatest.FlatSpec

class ShoppingCartSpec extends FlatSpec {

  "Empty should cart" should " have size & value of zero" in {
    val shoppingCart = new ShoppingCart()
    assert(shoppingCart.size == 0)
    assert(shoppingCart.value == 0)
  }

  "Cart with 1 Apple" should " have size == 1 and value of 0.60" in {
    val shoppingCart = new ShoppingCart()
    shoppingCart.add(new Apple)
    assert(shoppingCart.size == 1)
    assert(shoppingCart.value == 0.60)

  }

  "Cart with 1 Orange" should " have size == 1 and value of 0.25" in {
    val shoppingCart = new ShoppingCart()
    shoppingCart.add(new Orange)
    assert(shoppingCart.size == 1)
    assert(shoppingCart.value == 0.25)
  }

  "Cart with 2 Oranges" should " have size == 2 and value of 0.50" in {
    val shoppingCart = new ShoppingCart()
    shoppingCart.add(new Orange)
    shoppingCart.add(new Orange)
    assert(shoppingCart.size == 2)
    assert(shoppingCart.value == 0.50)
  }

  "Cart with 2 Apples" should " have size == 2 and value of 1.20" in {
    val shoppingCart = new ShoppingCart()
    shoppingCart.add(new Apple)
    shoppingCart.add(new Apple)
    assert(shoppingCart.size == 2)
    assert(shoppingCart.value == 1.20)
  }

  "Cart with 3 Apples and 1 Orange" should " have size == 2 and value of 2.05" in {
    val shoppingCart = new ShoppingCart()
    shoppingCart.add(new Apple)
    shoppingCart.add(new Apple)
    shoppingCart.add(new Orange)
    shoppingCart.add(new Apple)
    assert(shoppingCart.size == 4)
    assert(shoppingCart.value == 2.05)
  }

  "Cart with 1 Orange and 1 Apple" should " have size == 2 and value of 0.85" in {
    val shoppingCart = new ShoppingCart()
    shoppingCart.add(new Orange)
    shoppingCart.add(new Apple)
    assert(shoppingCart.size == 2)
    assert(shoppingCart.value == 0.85)
  }

}
