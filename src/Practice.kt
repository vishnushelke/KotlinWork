class Practice {
    fun printPermutn(str: String, ans: String) { // If string is empty
        if (str.length == 0) {
            print("$ans ")
            return
        }
        for (i in 0 until str.length) {
            // ith character of str
            val ch = str[i]
            // Rest of the string after excluding
            // the ith character
            val ros = str.substring(0, i) +
                    str.substring(i + 1)
            // Recurvise call
            printPermutn(ros, ans + ch)
        }
    }

}