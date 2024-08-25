package org.ye
fun main() {
    unUn("111213")
}
fun unUn(source: String): String{
    var cnt: Int = 0
    var num: Int = 0
    var newstring = ""
        for(i:Int in 0..source.length-1){
            num = source[i].digitToInt()
            var nextIndex = i;
            if (i<source.length-1 && source[i] == source[nextIndex+1]\)
            {
                cnt++
            }
            else
            {
                newstring+="$cnt$num"
            }

    }
    return newstring
}

