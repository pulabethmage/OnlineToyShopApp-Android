package com.appbrewery.giftscape

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        //// Burger Menu
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Search Gifts"
        //set back button
        //actionbar.setHomeAsUpIndicator(R.drawable.ic_baseline_burger);
        actionbar.setDisplayHomeAsUpEnabled(true)
        //// Burger Menu End


    }


    fun showDialog(view: View) {
        val dialog = Dialog(view.context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_for_password)
        val etOldpass = dialog.findViewById(R.id.oldPass) as EditText
        val etNewpass = dialog.findViewById(R.id.newPass) as EditText
        val etConpass = dialog.findViewById(R.id.conPass) as EditText
        val yesBtn = dialog.findViewById(R.id.yesBtn) as Button
        val noBtn = dialog.findViewById(R.id.noBtn) as Button
        yesBtn.setOnClickListener {
            dialog.dismiss()
        }
        noBtn.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()

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