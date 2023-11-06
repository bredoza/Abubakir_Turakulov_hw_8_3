package com.example.abubakir_turakulov_hw_8_3.model

import androidx.lifecycle.ViewModel

class CharacterModel : ViewModel() {
    val characters = mutableListOf(
        Character(
            "Alive",
            "Rick Sanchez",
            "https://static.wikia.nocookie.net/rickandmorty/images/f/f6/%D0%A0%D0%B8%D0%BA_%D0%A1%D0%B0%D0%BD%D1%87%D0%B5%D0%B7_004.jpg/revision/latest?cb=20190714103849&path-prefix=ru"
        ),
        Character(
            "Alive",
            "Morty Smith",
            "https://static.wikia.nocookie.net/rickandmorty/images/d/d3/%D0%9C%D0%BE%D1%80%D1%82%D0%B8_%D0%A1%D0%BC%D0%B8%D1%82_001.jpg/revision/latest?cb=20190714105326&path-prefix=ru"
        ),
        Character(
            "Dead",
            "Davin",
            "https://static.wikia.nocookie.net/rickandmorty/images/b/b0/%D0%94%D1%8D%D0%B2%D0%B8%D0%BD_001.jpg/revision/latest?cb=20191028140151&path-prefix=ru"
        ),
        Character(
            "Alive",
            "Jerry Smith",
            "https://static.wikia.nocookie.net/rickandmorty/images/2/27/%D0%94%D0%B6%D0%B5%D1%80%D1%80%D0%B8_%D0%A1%D0%BC%D0%B8%D1%82_002.jpg/revision/latest?cb=20230425124526&path-prefix=ru"
        ),
        Character(
            "Alive",
            "Summer Smith",
            "https://static.wikia.nocookie.net/rickandmorty/images/3/31/%D0%A1%D0%B0%D0%BC%D0%BC%D0%B5%D1%80_%D0%A1%D0%BC%D0%B8%D1%82_001.jpg/revision/latest?cb=20190714103010&path-prefix=ru"
        ),
        Character(
            "Alive",
            "Beth Smith",
            "https://static.wikia.nocookie.net/rickandmorty/images/e/e3/%D0%91%D0%B5%D1%82_%D0%A1%D0%BC%D0%B8%D1%82_002.jpg/revision/latest?cb=20200111100425&path-prefix=ru"
        )
    )
}