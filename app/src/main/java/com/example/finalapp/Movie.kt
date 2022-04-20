package com.example.finalapp

data class Movie(
    val id_kinopoisk: Long,
    val type: String,
    val title: String,
    val title_alternative: String?,
    val poster: String,
//    val directors: List<String>,
//    val actors: List<String>,
//    val screenwriters: List<String>,
//    val producers: List<String>,
//    val operators: List<String>,
//    val composers: List<String>,
//    val painters: List<String>,
//    val editors: List<String>,
    val genres: Array<String>,
    val countries: Array<String>,
    val year: Number,
    val description: String,
//    val tagline: String,
//    val age: String?,
//    val budget: String?,
    val rating_kinopoisk: String?,
    val kinopoisk_votes: String?,
//    val rating_imdb: String?,
//    val imdb_votes: String?,
//    val fees_world: String?,
//    val fees_russia: String?,
//    val premiere_world: String?,
//    val premiere_russia: String?,
//    val frames: List<String>,
//    val screenshots: List<String>,
    val seasons: String?
) {
    companion object {
        fun getMovies() = listOf(
            Movie(
                915196,
                "tv-series",
                "Очень странные дела",
                "Stranger Things",
                "https://st.kp.yandex.net/im/kadr/3/4/1/kinopoisk.ru-Stranger-Things-3413471.jpg",
                arrayOf("Ужасы", "Фантастика", "Фэнтези", "Триллер", "Драма", "Детектив"),
                arrayOf("США"),
                2016,
                "1980-е годы, тихий провинциальный американский городок. Благоприятное течение местной жизни нарушает загадочное исчезновение подростка по имени Уилл. Выяснить обстоятельства дела полны решимости родные мальчика и местный шериф, также события затрагивают лучшего друга Уилла  Майка. Он начинает собственное расследование. Майк уверен, что близок к разгадке, и теперь ему предстоит оказаться в эпицентре ожесточенной битвы потусторонних сил.",
                "8.457",
                "108829",
                "4"
            ),
            Movie(
                915197,
                "tv-series",
                "Очень странные дела",
                "Stranger Things",
                "https://st.kp.yandex.net/im/kadr/3/4/1/kinopoisk.ru-Stranger-Things-3413471.jpg",
                arrayOf("Ужасы", "Фантастика", "Фэнтези", "Триллер", "Драма", "Детектив"),
                arrayOf("США"),
                2016,
                "1980-е годы, тихий провинциальный американский городок. Благоприятное течение местной жизни нарушает загадочное исчезновение подростка по имени Уилл. Выяснить обстоятельства дела полны решимости родные мальчика и местный шериф, также события затрагивают лучшего друга Уилла  Майка. Он начинает собственное расследование. Майк уверен, что близок к разгадке, и теперь ему предстоит оказаться в эпицентре ожесточенной битвы потусторонних сил.",
                "8.457",
                "108829",
                "4"
            ),
            Movie(
                915198,
                "tv-series",
                "Очень странные дела",
                "Stranger Things",
                "https://st.kp.yandex.net/im/kadr/3/4/1/kinopoisk.ru-Stranger-Things-3413471.jpg",
                arrayOf("Ужасы", "Фантастика", "Фэнтези", "Триллер", "Драма", "Детектив"),
                arrayOf("США"),
                2016,
                "1980-е годы, тихий провинциальный американский городок. Благоприятное течение местной жизни нарушает загадочное исчезновение подростка по имени Уилл. Выяснить обстоятельства дела полны решимости родные мальчика и местный шериф, также события затрагивают лучшего друга Уилла  Майка. Он начинает собственное расследование. Майк уверен, что близок к разгадке, и теперь ему предстоит оказаться в эпицентре ожесточенной битвы потусторонних сил.",
                "8.457",
                "108829",
                "4"
            )
        )
    }
}
