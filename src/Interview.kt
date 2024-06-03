/**
write a funtion that takes a string and an int as input and return a string
Output will be:
a string that does not have any vowels
the out put length should be same as int parameter
the letters in out put should not repeat
if it is not possible to return such an output return "NO"
 */

//Abcde 2
//
fun omitVowels(input: String, size: Int): String {

    val output = ""
    val inputArray = input.toCharArray()

    inputArray.forEachIndexed { index, c ->
      if(!isVowel(c) && !output.contains(c))
          output.plus(c)
    }

    return if(output.length>=size)
        output.substring(0,size-1)
    else
        "NO"
}

fun isVowel(inputCharToCheck: Char): Boolean {
    return when (inputCharToCheck) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
        else -> false
    }
}