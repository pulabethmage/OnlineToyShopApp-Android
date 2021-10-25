package com.appbrewery.giftscape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.GridView
import android.widget.SearchView

class FavoritesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorites)


        //// Burger Menu
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Gifts for and who"
        //set back button
        //actionbar.setHomeAsUpIndicator(R.drawable.ic_baseline_burger);
        actionbar.setDisplayHomeAsUpEnabled(true)
        //// Burger Menu End


        /////////// Grid View ///////////

        var gridview = findViewById<GridView>(R.id.GridFavorites)
        var list = mutableListOf<GridViewModel>()

        list.add(GridViewModel("Magnetic Sketch Book","$19.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection","$49.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro","$39.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book 2","$59.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection 2","$29.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro","$79.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book 3","$49.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection 3","$29.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro","$29.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book","$19.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection","$49.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro","$39.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book 2","$59.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection 2","$29.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro","$79.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book 3","$49.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection 3","$29.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro 3","$29.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book","$19.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection","$49.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro","$39.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book 2","$59.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection 2","$29.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro 2","$79.99",R.drawable.hoverboard))
        list.add(GridViewModel("Magnetic Sketch Book 3","$49.99",R.drawable.magneticscketch))
        list.add(GridViewModel("Hot Wheels Collection 3","$29.99",R.drawable.hotwheelcollection))
        list.add(GridViewModel("Hoverboard Pro 3","$29.99",R.drawable.hoverboard))

        gridview.adapter = GridViewAdapter(this,R.layout.custom_autosuggest_item_view,list)


        /////////// Grid View ///////////


    }


    override fun onSupportNavigateUp(): Boolean {
        /// if you press the burger menu this is what happned
        onBackPressed()
        return true
    }

    /// Search View
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.nav_menu,menu)

        val search: MenuItem? = menu?.findItem(R.id.nav_search)
        val searchView : SearchView = search?.actionView as SearchView
        searchView.queryHint = "Search gifts for your loved ones"


        return super.onCreateOptionsMenu(menu)
    }
    /// Search View End

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.action_menu1 -> btnHomePressed()
            R.id.action_menu2 -> btnLoginPressed()
        }
        return super.onOptionsItemSelected(item);

    }

    fun btnHomePressed()
    {
        val intent = Intent(this, MainActivityHome::class.java)
        startActivity(intent)
    }

    fun btnLoginPressed()
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}