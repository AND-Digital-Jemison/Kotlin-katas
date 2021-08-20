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
                charsRepeat += "${word[i]}"
            }
            finalWord += "${charsRepeat}-"
            charsRepeat = ""
        }
        return finalWord
    }

    fun getStringCapital( word: String): String{
        var finalWord : String = ""
        var charsRepeat : String = ""

        for(i in 0..word.length-1) {
            for(j in 0..i){
                charsRepeat += if(j==0) "${word[i].uppercaseChar()}" else "${word[i].lowercaseChar()}"
            }
            finalWord += "${charsRepeat}-"
            charsRepeat = ""
        }
            return finalWord
    }


    fun getStringCapitalRemoveLastDash( word: String): String{
        var finalWord : String = ""
        var charsRepeat : String = ""

        for(i in 0..word.length-1) {
            for(j in 0..i){
                charsRepeat += if(j==0) "${word[i].uppercaseChar()}" else "${word[i].lowercaseChar()}"
            }
            finalWord += if(i==word.length-1) "${charsRepeat}" else "${charsRepeat}-"
            charsRepeat = ""
        }
        return finalWord
    }
}