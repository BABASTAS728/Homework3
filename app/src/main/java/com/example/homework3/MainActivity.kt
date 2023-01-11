package com.example.homework3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val images: Array<String> = arrayOf("https://static.wikia.nocookie.net/harrypotter/images/c/cf/PromoHP7_Harry.jpg/revision/latest?cb=20150312181426&path-prefix=ru"
            ,"https://upload.wikimedia.org/wikipedia/ru/thumb/3/32/Grint-Weasley.png/222px-Grint-Weasley.png"
            ,"https://upload.wikimedia.org/wikipedia/ru/thumb/a/ac/Emma_Watson_as_Hermione_Granger.jpg/250px-Emma_Watson_as_Hermione_Granger.jpg"
            ,"https://www.vokrug.tv/pic/person/a/c/e/1/ace11c1fca0706403058c5133bc34298.jpeg"
            ,"https://upload.wikimedia.org/wikipedia/ru/thumb/a/ad/Lucius_Malfoy.jpg/200px-Lucius_Malfoy.jpg"
            , "https://upload.wikimedia.org/wikipedia/ru/8/82/Draco_Malfoy.jpg"
            , "https://upload.wikimedia.org/wikipedia/ru/thumb/b/b9/%D0%93%D1%8D%D0%BC%D0%B1%D0%BE%D0%BD_-_%D0%94%D0%B0%D0%BC%D0%B1%D0%BB%D0%BE%D1%80.jpg/290px-%D0%93%D1%8D%D0%BC%D0%B1%D0%BE%D0%BD_-_%D0%94%D0%B0%D0%BC%D0%B1%D0%BB%D0%BE%D1%80.jpg"
            , "https://upload.wikimedia.org/wikipedia/ru/thumb/a/a3/Severus_Snape.jpg/250px-Severus_Snape.jpg"
            , "https://static.wikia.nocookie.net/harrypotter/images/3/32/Rubeus.jpg/revision/latest?cb=20080207002912&path-prefix=ru"
            , "https://static.wikia.nocookie.net/harrypotter/images/1/16/%D0%9C%D0%B0%D0%BA%D0%B3%D0%BE%D0%BD%D0%B0%D0%B3%D0%B0%D0%BB%D0%BB.jpg/revision/latest?cb=20190601162214&path-prefix=ru")

        var selectedImage = 0;
        val imageView = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            Glide
                .with(this)
                .load(images[selectedImage++])
                .into(imageView)
            if (selectedImage == 10) selectedImage=0
        }
    }
}