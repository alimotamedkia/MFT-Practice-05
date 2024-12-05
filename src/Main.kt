import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1,100)
//    println(randomNumber)
    var i = 0
    var shouldGoOn = true
    println("لطفاً عدد مورد نظر خود را وارد کنید")
    while (shouldGoOn) {
        val number = readln().toInt()
        i++
        if (number>randomNumber)
            println("عدد شما بزرگتر از عدد انتخابی است، شما $i تلاش ناموفق داشته اید! عدد دیگری وارد کنید:")
        if (number<randomNumber)
            println("عدد شما کوچکتر از عدد انتخابی است، شما $i تلاش ناموفق داشته اید! عدد دیگری وارد کنید:")
            if(number==randomNumber) {
                println("آفرین عدد شما صحیح است، در مجموع $i بار تلاش کردید.")

                shouldGoOn = false
            }
    }

}