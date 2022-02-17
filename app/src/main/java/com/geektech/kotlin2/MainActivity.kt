package com.geektech.kotlin2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.geektech.kotlin2.databinding.ActivityMainBinding
import com.geektech.kotlin2.extensions.glide
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
     private val url = mutableListOf(
         "https://www.google.kg/imgres?imgurl=https%3A%2F%2Fe1.edimdoma.ru%2Fdata%2Fingredients%2F0000%2F8999%2F8999-ed4_wide.jpg%3F1528468634&imgrefurl=https%3A%2F%2Fwww.edimdoma.ru%2Fencyclopedia%2Fingredients%2F8999-dorada&tbnid=eQXf1W23FZjf_M&vet=12ahUKEwiDy6mFpYf2AhWPLOwKHcOYDG0QMygDegUIARDZAQ..i&docid=3_beh8eiKLbvZM&w=580&h=450&q=%D0%B4%D0%BE%D1%80%D0%B0%D0%B4%D0%BE&ved=2ahUKEwiDy6mFpYf2AhWPLOwKHcOYDG0QMygDegUIARDZAQ",
         "https://www.google.kg/url?sa=i&url=https%3A%2F%2Fwww.gastronom.ru%2Frecipe%2F43261%2Fdorada-na-grile-s-limonnym-maslom&psig=AOvVaw0zZ_GbCt7voa3XwOy46kDm&ust=1645206256600000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJDrgMilh_YCFQAAAAAdAAAAABAD",
         "https://www.google.kg/imgres?imgurl=https%3A%2F%2Fm.dom-eda.com%2Fuploads%2Fimages%2Fcatalog%2Fitem%2Fffee497a9d%2F15196f46d2_1000.jpg&imgrefurl=https%3A%2F%2Fm.dom-eda.com%2Fingridient%2Fitem%2Fdorado.html&tbnid=zOCw-u9zZqT0zM&vet=12ahUKEwiamafapYf2AhUyRuUKHYdjDxsQMygBegUIARDJAQ..i&docid=nPDx7AilwqmmEM&w=800&h=800&q=%D0%B4%D0%BE%D1%80%D0%B0%D0%B4%D0%BE%20jpg%20photo&ved=2ahUKEwiamafapYf2AhUyRuUKHYdjDxsQMygBegUIARDJAQ",
         "https://www.google.kg/imgres?imgurl=https%3A%2F%2Fwww.patee.ru%2Fr%2Fx6%2F19%2Ffc%2Fed%2F960m.jpg&imgrefurl=https%3A%2F%2Fwww.patee.ru%2Frecipes%2Ffish%2Fview%2F%3Fid%3D1703148&tbnid=EkwtJw2TC2c4nM&vet=12ahUKEwiamafapYf2AhUyRuUKHYdjDxsQMygSegUIARDsAQ..i&docid=d8h1WocCAZSFBM&w=960&h=758&q=%D0%B4%D0%BE%D1%80%D0%B0%D0%B4%D0%BE%20jpg%20photo&ved=2ahUKEwiamafapYf2AhUyRuUKHYdjDxsQMygSegUIARDsAQ",
         "https://www.google.kg/imgres?imgurl=https%3A%2F%2Fedaplus.info%2Ffood_pictures%2Fdorado.jpg&imgrefurl=https%3A%2F%2Fedaplus.info%2Fproduce%2Fdorado.html&tbnid=0sYWQpY1d5UkJM&vet=12ahUKEwiamafapYf2AhUyRuUKHYdjDxsQMygkegUIARCbAg..i&docid=xB6xjayt6sUy-M&w=608&h=250&q=%D0%B4%D0%BE%D1%80%D0%B0%D0%B4%D0%BE%20jpg%20photo&ved=2ahUKEwiamafapYf2AhUyRuUKHYdjDxsQMygkegUIARCbAg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener{
            url.add(binding.editText.text.toString())
        }

        binding.btnRandom.setOnClickListener{
            val randomUrl = Random.nextInt(url.size)
            val randomElement = url[randomUrl]
            Log.e("ololo", randomElement)
            binding.imageView.glide(randomElement)
        }
    }


}