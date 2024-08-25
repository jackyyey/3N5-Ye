package org.ye
fun main() {
    println(unUn("111213"))
}
fun unUn(source: String): String{
    var cnt: Int = 1
    var num: Int = 0
    var newstring = ""
        for(i:Int in 0 .. source.length-1){
            if (i!=0)
            {
                if (source[i].digitToInt() == source[i-1].digitToInt()){
                    cnt++
                }
                else
                {
                    newstring+="$cnt$num"
                    cnt = 1
                }
                num=source[i].digitToInt()
            }

        }
    return newstring
}


