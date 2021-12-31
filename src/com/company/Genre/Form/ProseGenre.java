package com.company.Genre.Form;

import com.company.GenreEnum;

public class ProseGenre extends GenreByForm{
    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.name();
    }
}
