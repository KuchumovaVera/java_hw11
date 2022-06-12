package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    void shouldFindAll() {

        MovieManager manager = new MovieManager();
        Movie[] actual = manager.findAll();
        Movie[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldAddMovies() {

        MovieManager manager = new MovieManager();
        int arraySize = 17;
        Movie[] expectedMovies = new Movie[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movie newMovie = new Movie(i, "Movie" + number, "style" + number);
            manager.add(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movie[] actual = manager.findAll();
        Movie[] expected = expectedMovies;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLastMoviesIfSizeMoreTen() {

        MovieManager manager = new MovieManager();
        int arraySize = 12;
        Movie[] expectedMovies = new Movie[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movie newMovie = new Movie(i, "Movie" + number, "style" + number);
            manager.add(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movie[] actual = manager.findLast();
        Movie[] expected = {expectedMovies[11], expectedMovies[10], expectedMovies[9], expectedMovies[8], expectedMovies[7], expectedMovies[6], expectedMovies[5], expectedMovies[4], expectedMovies[3], expectedMovies[2]};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLastMoviesIfNumberMoreSize() {

        MovieManager manager = new MovieManager(9);
        int arraySize = 5;
        Movie[] expectedMovies = new Movie[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movie newMovie = new Movie(i, "Movie" + number, "style" + number);
            manager.add(newMovie);
            expectedMovies[i] = newMovie;
        }

        Movie[] actual = manager.findLast();
        Movie[] expected = {expectedMovies[4], expectedMovies[3], expectedMovies[2], expectedMovies[1], expectedMovies[0]};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLastMoviesIfNumberLessSize() {

        MovieManager manager = new MovieManager(4);
        int arraySize = 6;
        Movie[] expectedMovies = new Movie[arraySize];

        for (int i = 0; i < arraySize; i++) {
            String number = Integer.toString(i);
            Movie newMovie = new Movie(i, "Movie" + number, "style" + number);
            manager.add(newMovie);
            expectedMovies[i] = newMovie;
        }
        Movie[] actual = manager.findLast();
        Movie[] expected = {expectedMovies[5], expectedMovies[4], expectedMovies[3], expectedMovies[2]};

        Assertions.assertArrayEquals(expected, actual);
    }
}
