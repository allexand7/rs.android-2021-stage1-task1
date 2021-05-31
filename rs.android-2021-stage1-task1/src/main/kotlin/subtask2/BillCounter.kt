package subtask2

import java.lang.Math.abs

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val billHalf = bill.sum().minus(bill[k]).div(2)

        if (billHalf.equals(b)) {
            return "Bon Appetit"
        } else {
            return abs(billHalf-b).toString()
        }
    }
}
