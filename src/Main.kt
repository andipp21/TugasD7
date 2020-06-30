import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    println("=======Program Penjumlahan=======")
    print("Masukan Bilangan Pertama : ")
    val bilangan1: Int = input.nextInt()
    print("Masukan Bilangan Kedua   : ")
    val bilangan2 = input.nextInt()

    val jumlah = Penjumlahan(bilangan1, bilangan2)

    println("=================================")
    println("Hasil penjumlahan kedua bilangan tersebut adalah : ${jumlah.tambah()}")
}