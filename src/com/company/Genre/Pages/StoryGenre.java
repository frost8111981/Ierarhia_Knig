package com.company.Genre.Pages;

import com.company.GenreEnum;

public class StoryGenre extends GenreByNumberOfPages{
    @Override
    public String getGenreName() {
        return GenreEnum.STORY.name();
    }
}
