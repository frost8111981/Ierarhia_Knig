package com.company.Genre.Content;

import com.company.GenreEnum;

public class DetectiveGenre extends GenreByContent {
    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }
}
