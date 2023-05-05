fun main(args: Array<String>) {

println(introduction("Cynthia",56,"Rwanda"))
person("cynthia")
    println(lengthString("dog"))
    println(replace_vowels("school"))

}
//Write a function that takes in 3 parameters, name, age, and country, and
//returns a String with this structure “Hi, my name is x, I am y years old
//and I am from z.” Where x, y, and z are
//the provided name, age, and country respectively. (3 points)

fun introduction(name:String,age:Int,country:String):String{
    var me = "Hi my name is $name,I am $age,$country"
    return me
}
//Write a function that takes in a String and returns its length
fun lengthString(animal:String):Int{
    var newString = animal.length
    return newString

 }

//Write a function that takes in a name and prints out “That’s me!” when your name is passed to it,
//otherwise, it prints out “I don’t know who that is” (3 points)

 fun person(name:String){
     var anotherPerson= "juliet"
    if (name ==anotherPerson){
        println("that's me")
    }else{
        println("I don't know who that is")
    }

 }
//Write a Kotlin function that takes in a string will all the vowels replaces by the character ‘*’.
//Use string interpolation to generate the output.

fun replace_vowels(letters:String):String{
 var vowels = "aiuoe"
   var emptyString = ""
    for (i in letters){
        for (x in vowels){
            if (i ==x){
             emptyString +="*"
            }
        }

    }
    return " new output is $emptyString  "

}