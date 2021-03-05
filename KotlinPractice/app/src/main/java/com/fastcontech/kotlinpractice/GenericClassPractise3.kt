package com.fastcontech.kotlinpractice


interface Production<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(item: T)

}

interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}


open class Food
open class FastFood : Food()
class Burger : FastFood()

class FoodStore : Production<Food> {
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}

class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood {
        println("Produce fast food")
        return FastFood()
    }
}

class InOutBurger : Production<Burger> {
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}


class WhoIsProducerConsumer : ProductionConsumer<Food> {
    override fun produce(): Food {
        return Food()
    }

    override fun consume(item: Food) {
        println(item)
    }

}

class WhoIsProducerConsumer2 : ProductionConsumer<FastFood> {
    override fun produce(): FastFood {
        return FastFood()
    }

    override fun consume(item: FastFood) {
        println(item)
    }

}

class WhoIsProducerConsumer3 : ProductionConsumer<Burger> {
    override fun produce(): Burger {
        return Burger()
    }

    override fun consume(item: Burger) {
        println(item)
    }

}


class Everybody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food")
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat fast food")
    }
}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat burger")
    }
}



fun main() {

    val production1: Production<Food> = FoodStore()
    val production2: Production<Food> = FastFoodStore()
    val production3: Production<Food> = InOutBurger()

    val consumer1: Consumer<Burger> = Everybody()
    val consumer2: Consumer<Burger> = ModernPeople()
    val consumer3: Consumer<Burger> = American()

    val production1consumer1: WhoIsProducerConsumer = WhoIsProducerConsumer()
    val production2consumer2: WhoIsProducerConsumer2 = WhoIsProducerConsumer2()
    val production3consumer3: WhoIsProducerConsumer3 = WhoIsProducerConsumer3()
}
