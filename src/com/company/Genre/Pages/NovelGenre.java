package com.company.Genre.Pages;

import com.company.GenreEnum;

public class NovelGenre extends GenreByNumberOfPages {
    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }
}
