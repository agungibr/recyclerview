package com.example.recycleview_03_agung

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import java.util.*

class PlayersAdapter(private val context: Context, private val players: List<Players>, val listeners: (Players) -> Unit)
    : RecyclerView.Adapter<PlayersAdapter.Playersviewholder>(){

    class Playersviewholder(view: View): RecyclerView.ViewHolder(view) {

        val imgPlayers = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePlayers = view.findViewById<TextView>(R.id.tv_item_description)
        val descPlayer = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview(players: Players, listeners: (Players) -> Unit){
            imgPlayers.setImageResource(players.imgPlayers)
            namePlayers.text = players.namePlayers
            descPlayer.text = players.descPlayer
            itemView.setOnClickListener {
                listeners(players)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Playersviewholder {
        return Playersviewholder(
            LayoutInflater.from(context).inflate(R.layout.new_players, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Playersviewholder, position: Int) {
        holder.bindview(players[position], listeners)
    }

    override fun getItemCount(): Int = players.size
    }
