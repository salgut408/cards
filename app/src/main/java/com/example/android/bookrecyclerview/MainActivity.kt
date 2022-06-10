package com.example.android.bookrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.android.bookrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BookListListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = StaggeredGridLayoutManager(3, 1)
            adapter = CardAdapter(bookList, mainActivity)
        }


    }

    private fun populateBooks() {

        val book1 = Book(
            R.drawable.beast,
            "R.L Stine",
            "The Beast from the East",
            "A Beast hunts campers in New England"
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.brown_can_moo,
            "Dr. Seuss",
            "Mr Brown can moo, can you?",
            "Classic children's book"
        )
        bookList.add(book2)

        val book3 = Book(
            R.drawable.bumps,
            "R.L Stine",
            "Bump Nights",
            "Classic Horror"
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.camp_lake,
            "R.L Stine",
            "Murder at Camp Lake",
            "Classic Horror"
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.cat_in_the_hat,
            "Dr. Seuss",
            "The cat in the hat",
            "Classic children's book"
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.deadhouse,
            "R.L Stine",
            "Dead House",
            "Classic Horror"
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.footbook,
            "Dr. Seuss",
            "The Foot Book",
            "Classic children's book"
        )
        bookList.add(book7)

        val book8 = Book(
            R.drawable.green,
            "R.L Stine",
            "Green monsters",
            "Classic Horror"
        )
        bookList.add(book8)

        val book9 = Book(
            R.drawable.grinch,
            "Dr. Seuss",
            "How the grinch stole xmas",
            "Classic children's book"
        )
        bookList.add(book9)


    }

    override fun onClick(book: Book) {
        val intent = Intent(applicationContext, detailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA, book.id)
        startActivity(intent)
    }
}












































