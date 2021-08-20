// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/kotlin
// This time no story, no theory. The examples below show you how to write function accum:
// Examples:

// accum("abcd") -> "A-Bb-Ccc-Dddd"
// accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
// accum("cwAt") -> "C-Ww-Aaa-Tttt"



class Mumbling {

    fun getString( word: String): String{
        var finalWord : String = ""
        var charsRepeat : String = ""

        if (word.length == 1)
        return word

        for(i in 0..word.length-1) {
            for(j in 0..i){
                charsRepeat +="${word[i]}"
            }
            finalWord += "${charsRepeat}-"
            charsRepeat = ""
        }
            return finalWord
    }
}