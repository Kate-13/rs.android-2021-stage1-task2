package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var result = ""
        var reg = ""
        a.forEach { i ->
            if (i.isUpperCase()){
                reg += i
            } else {
                reg += i.toUpperCase() +"?"
            }
        }
        val regex = reg.toRegex()
        if ( regex.matchEntire(b) != null) result = "YES"
        else result = "NO"

        return result
    }
}
