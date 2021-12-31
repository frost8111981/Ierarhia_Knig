package com.company.Genre.Content;

import com.company.GenreEnum;

public class ProfessionalGenre extends GenreByContent {
    @Override
    public String getGenreName() {
        return GenreEnum.PROFESSIONAL.name();
    }
}
