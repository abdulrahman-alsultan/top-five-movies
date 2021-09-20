fun main(){
    var movies = arrayOf("", "", "", "", "")

    for(i in 0..4){
        print("Please enter movie number ${i + 1}: ")
        movies[i] = readLine().toString()
    }
    println("Your movies: ")
    for(i in 0..4){
        println(movies[i])
    }
}