package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        val sadArrayFixed = sadArray.toMutableList()
        var isDeletedElementOfMassive = false

        for (i in 1..sadArray.lastIndex - 1){
            if (sadArrayFixed[i - 1] + sadArrayFixed[i + 1] < sadArrayFixed[i]) {
                isDeletedElementOfMassive = true
                sadArrayFixed.removeAt(i)
                break
            }
        }

        if (isDeletedElementOfMassive)
            return convertToHappy(sadArrayFixed.toIntArray())
        else
            return sadArrayFixed.toIntArray()
    }
}

