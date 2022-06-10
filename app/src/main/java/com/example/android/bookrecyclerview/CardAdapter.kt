package com.example.android.bookrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.bookrecyclerview.databinding.ActivityDetailBinding.inflate
import com.example.android.bookrecyclerview.databinding.ActivityMainBinding.inflate
import com.example.android.bookrecyclerview.databinding.CardCellBinding

class CardAdapter(private val books: List<Book>,
private val clickListener: BookListListener): RecyclerView.Adapter<CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindBook(books[position])
    }

    override fun getItemCount(): Int = books.size
}