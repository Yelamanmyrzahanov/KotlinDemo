package classes

class MoviesList(val genre: String){
    val movies = ArrayList<String>()

    fun printMovies(){
        println("Movie List: $genre")
        for (movie in movies){
            print(movie+" ")
        }
        println()
    }
}

class MovieGear{
    var moviesList = HashMap<String,MoviesList>()

    fun addList(list: MoviesList){
        moviesList[list.genre] = list
    }

    fun movieListFor(genre: String): MoviesList?{
        return moviesList[genre]
    }

    fun addMovie(genre: String, movie:String){
        moviesList[genre]?.movies?.add(movie)
    }
}

fun main(args: Array<String>) {
    
}