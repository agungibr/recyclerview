package com.example.recycleview_03_agung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailplayersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailplayers)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val players = intent.getParcelableExtra<Players>(MainActivity.INTENT_PARCELABLE)

        val imgPlayers = findViewById<ImageView>(R.id.img_item_photo)
        val namePlayers = findViewById<TextView>(R.id.tv_item_name)
        val descPlayer = findViewById<TextView>(R.id.tv_item_description)

        imgPlayers.setImageResource(players?.imgPlayers!!)
        namePlayers.text = players.namePlayers
        descPlayer.text = players.descPlayer

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}