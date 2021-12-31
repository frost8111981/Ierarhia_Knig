package com.company;

import com.company.Genre.Genre;

public class Book {
    private String title;
    private Genre[] genres;

    public Book(String title, Genre[] genres) {
        this.title = title;
        this.genres = genres;
    }

    public Book(String title) {            //for creating new Book
        this.title = title;
    }

    public Genre[] getGenres() {
        return genres;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return this.title;
    }

}
