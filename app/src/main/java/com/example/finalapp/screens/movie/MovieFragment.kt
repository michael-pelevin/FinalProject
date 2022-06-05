package com.example.finalapp.screens.movie

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.finalapp.MainActivity
import com.example.finalapp.Movie
import com.example.finalapp.MovieViewModel
import com.example.finalapp.R
import com.example.finalapp.screens.bookmarks.BookmarksViewModel
import com.example.finalapp.screens.description.DescriptionFragment


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

    lateinit var viewModel: MovieViewModel

    lateinit var bookmarkModel: BookmarksViewModel

    private val movie = Movie.getMovies()[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[MovieViewModel::class.java]
        bookmarkModel = ViewModelProvider(this)[BookmarksViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val actionBar: androidx.appcompat.app.ActionBar? = (activity as MainActivity?)!!.supportActionBar
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true)
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.movie_fragment, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = view.findViewById<TextView>(R.id.title)
        val rating_kinopoisk = view.findViewById<TextView>(R.id.rating_kinopoisk)
        val title_alternative = view.findViewById<TextView>(R.id.title_alternative)
        val poster = view.findViewById<ImageView>(R.id.poster)
        val year_and_genres_seasons = view.findViewById<TextView>(R.id.year_and_genres_seasons)
        val countries_duration_age = view.findViewById<TextView>(R.id.countries_duration_age)
        val description = view.findViewById<TextView>(R.id.description)
        val kinopoisk_votes = view.findViewById<TextView>(R.id.kinopoisk_votes)
        val rating_kinopoisk_number = view.findViewById<TextView>(R.id.rating_kinopoisk_number)

        val btn = view.findViewById<Button>(R.id.descriptionBtn)

        val bookmark = view.findViewById<ImageView>(R.id.bookmark_btn)

        viewModel.setMovieData(movie)
        val data = viewModel.movieData

        title.text = data.value?.title.toString()
        rating_kinopoisk.text = data.value?.rating_kinopoisk.toString()
        year_and_genres_seasons.text = data.value?.year.toString()+ ", "+ data.value?.seasons.toString()+ " сезона"
        title_alternative.text = data.value?.title_alternative.toString()
        countries_duration_age.text = data.value?.countries.toString()
        description.text = data.value?.description.toString()
        kinopoisk_votes.text = data.value?.kinopoisk_votes.toString()+ " оценок"
        rating_kinopoisk_number.text = data.value?.rating_kinopoisk.toString()

        Glide.with(this).load("https://st.kp.yandex.net/im/kadr/3/4/1/kinopoisk.ru-Stranger-Things-3413471.jpg").centerCrop().into(poster)
        val descriptionFragment = DescriptionFragment.newInstance(data.value?.description.toString())
        btn.setOnClickListener {
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.content_container, descriptionFragment).addToBackStack(null)
            transaction.commit()
        }
        bookmark.setOnClickListener{
            bookmarkModel.addMovieToBookmarks(movie)
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MovieFragment()
    }
}