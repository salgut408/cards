package com.example.android.bookrecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.android.bookrecyclerview.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookListListener
) : RecyclerView.ViewHolder(cardCellBinding.root) {

    fun bindBook(book: Book) {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.author.text=book.author
        cardCellBinding.title.text=book.title

        cardCellBinding.cardView.setOnClickListener {
            clickListener.onClick(book)
        }

    }

}