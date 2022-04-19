package com.example.finalapp.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.finalapp.R

//{
//    "id_kinopoisk": 915196,
//    "type": "tv-series",
//    "title": "Очень странные дела",
//    "title_alternative": "Stranger Things",
//    "poster": "https://cdn.kinopoisk.dev/images/posters/tv-series/poster_id_915196.jpg",
//    "directors": [
//    "Мэтт Даффер",
//    "Росс Даффер",
//    "Шон Леви"
//    ],
//    "actors": [
//    "Дэвид Харбор",
//    "Финн Вулфард",
//    "Милли Бобби Браун",
//    "Гейтен Матараццо",
//    "Наталия Дайер",
//    "Чарли Хитон",
//    "Джо Кири",
//    "Вайнона Райдер",
//    "Калеб Маклафлин",
//    "Кара Буоно",
//    "Денис Беспалый",
//    "Тихон Ефименко",
//    "Алиса Ефименко",
//    "Прохор Тесленко",
//    "Лина Иванова"
//    ],
//    "screenwriters": [
//    "Мэтт Даффер",
//    "Росс Даффер",
//    "Пол Дихтер"
//    ],
//    "producers": [
//    "Дэн Коэн",
//    "Мэтт Даффер",
//    "Росс Даффер"
//    ],
//    "operators": [
//    "Тим Айвз",
//    "Тод Кэмпбелл",
//    "Лачлан Милн"
//    ],
//    "composers": [
//    "Кайл Диксон",
//    "Майкл Стейн"
//    ],
//    "painters": [
//    "Крис Трухильо",
//    "Шон Бреннан",
//    "Уильям Дж. Дэвис"
//    ],
//    "editors": [
//    "Дин Зиммерман",
//    "Кевин Д. Росс",
//    "Нэт Фуллер"
//    ],
//    "genres": [
//    "Ужасы",
//    "Фантастика",
//    "Фэнтези",
//    "Триллер",
//    "Драма",
//    "Детектив"
//    ],
//    "countries": [
//    "США"
//    ],
//    "year": 2016,
//    "description": "1980-е годы, тихий провинциальный американский городок. Благоприятное течение местной жизни нарушает загадочное исчезновение подростка по имени Уилл.
//    Выяснить обстоятельства дела полны решимости родные мальчика и местный шериф, также события затрагивают лучшего друга Уилла  Майка. Он начинает собственное расследование.
//    Майк уверен, что близок к разгадке, и теперь ему предстоит оказаться в эпицентре ожесточенной битвы потусторонних сил.",
//    "tagline": "«The world is turning upside down»",
//    "age": null,
//    "budget": null,
//    "rating_kinopoisk": "8.457",
//    "kinopoisk_votes": "108829",
//    "rating_imdb": "8.80",
//    "imdb_votes": "708933",
//    "fees_world": null,
//    "fees_russia": null,
//    "premiere_world": "11 июля 2016",
//    "premiere_russia": null,
//    "frames": [
//    "https://st.kp.yandex.net/im/kadr/3/4/1/kinopoisk.ru-Stranger-Things-3413471.jpg",
//    "https://st.kp.yandex.net/im/kadr/3/4/1/kinopoisk.ru-Stranger-Things-3413470.jpg"
//    ],
//    "screenshots": [
//    "https://st.kp.yandex.net/im/kadr/3/2/1/kinopoisk.ru-Stranger-Things-3216821.jpg",
//    "https://st.kp.yandex.net/im/kadr/3/2/1/kinopoisk.ru-Stranger-Things-3216820.jpg"
//    ],
//    "seasons": "4"
//}
class MovieFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.movie_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val descriptionView = view.findViewById<TextView>(R.id.description)
        descriptionView.setOnClickListener {
            descriptionView.setMaxLines(Int.MAX_VALUE)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MovieFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = MovieFragment()
    }
}