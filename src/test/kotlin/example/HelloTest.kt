package example

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class HelloTest : StringSpec({

    "length should return the size of string" {
        println("Running test")
        RuntimeException().printStackTrace()
        hello("KotlinTest") shouldBe "Hello, KotlinTest!"
    }

    "length should return the size of string 2" {
        println("Running test")
        RuntimeException().printStackTrace()
        hello("KotlinTest") shouldBe "Hello, KotlinTest 2!"
    }
})