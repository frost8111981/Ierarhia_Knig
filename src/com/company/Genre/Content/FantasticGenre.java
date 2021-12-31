package com.company.Genre.Content;

import com.company.GenreEnum;

public class FantasticGenre extends GenreByContent {
    @Override
    public String getGenreName() {
        return GenreEnum.FANTASTIC.name();
    }
}
