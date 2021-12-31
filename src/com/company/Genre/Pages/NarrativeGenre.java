package com.company.Genre.Pages;

import com.company.GenreEnum;

public class NarrativeGenre extends GenreByNumberOfPages{
    @Override
    public String getGenreName() {
        return GenreEnum.NARRATIVE.name();
    }
}
