package ru.netology;
public class MovieManager {

        private Movie[] movies = new Movie[0];
        private int numberOfLastMovies;

        public MovieManager() {
            this.numberOfLastMovies = 10;
        }

        public MovieManager(int numberOfLastMovies) {
            this.numberOfLastMovies = numberOfLastMovies;
        }

        public void add(Movie newMovie) {
            int length = movies.length + 1;
            Movie[] tmp = new Movie[length];

            for (int i = 0; i < movies.length; i++) {
                tmp[i] = movies[i];
            }

            int lastIndex = tmp.length - 1;
            tmp[lastIndex] = newMovie;
            movies = tmp;
        }

        public Movie[] findAll() {
            return movies;
        }

        public Movie[] findLast() {
            if (numberOfLastMovies < movies.length) {
                Movie[] result = new Movie[numberOfLastMovies];

                for (int i = 0; i < numberOfLastMovies; i++) {
                    int index = movies.length - i - 1;
                    result[i] = movies[index];
                }
                return result;

            } else {

                Movie[] result = new Movie[movies.length];

                for (int i = 0; i < movies.length; i++) {
                    int index = movies.length - i - 1;
                    result[i] = movies[index];
                }
                return result;
            }
        }
}
