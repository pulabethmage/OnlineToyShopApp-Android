package com.appbrewery.giftscape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.SearchView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        //// Burger Menu
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Signup"
        //set back button
        //actionbar.setHomeAsUpIndicator(R.drawable.ic_baseline_burger);
        actionbar.setDisplayHomeAsUpEnabled(true)
        //// Burger Menu End


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
            R.id.action_menu3 -> btnProfilePressed()
            R.id.action_menu4 -> btnFavPressed()
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
    fun btnProfilePressed()
    {
        val intent = Intent(this, ProfileActivity::class.java)
        startActivity(intent)
    }

    fun btnFavPressed()
    {
        val intent = Intent(this, FavoritesActivity::class.java)
        startActivity(intent)
    }



}