package com.company.Genre.Form;

import com.company.GenreEnum;

public class VerseGenre extends GenreByForm {
    @Override
    public String getGenreName() {
        return GenreEnum.VERSE.name();
    }
}
