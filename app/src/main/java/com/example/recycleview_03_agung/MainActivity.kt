package com.example.recycleview_03_agung

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newplayerslist = listOf<Players>(
            Players(R.drawable.dodo,
                namePlayers = "Cristiano Ronaldo",
                descPlayer = "5 Balon Do`or, 5 UCL"
            ), Players(
                R.drawable.heaton,
                namePlayers = "Tom Heaton",
                descPlayer = "Alumni MU"
            ), Players(
                R.drawable.sancho,
                namePlayers = "Jadon Sancho",
                descPlayer = "1 Dfb Pokal"
            ), Players(
                R.drawable.varane,
                namePlayers = "Raphael Varane",
                descPlayer = "4 UCL"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_player)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PlayersAdapter(this, newplayerslist){
            val intent = Intent (this,DetailplayersActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}