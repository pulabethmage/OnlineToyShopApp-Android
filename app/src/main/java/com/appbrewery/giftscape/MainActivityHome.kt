package com.appbrewery.giftscape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class MainActivityHome : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)


        /////////// Grid View ///////////

        var gridview = findViewById<GridView>(R.id.GViewSuggestedItems)
        var list = mutableListOf<GridViewModel>()

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





        val btnkidLinearLayout: LinearLayout = findViewById(R.id.btnKidLinear) as LinearLayout
        val btnteenLinearLayout: LinearLayout = findViewById(R.id.btnTeenLinear) as LinearLayout
        val btnadultLinearLayout: LinearLayout = findViewById(R.id.btnAdultLinear) as LinearLayout

        val btnMaleLinearLayout: LinearLayout = findViewById(R.id.btnMaleLinear) as LinearLayout
        val btnFemaleLinearLayout: LinearLayout = findViewById(R.id.btnFemaleLinear) as LinearLayout


        //// Burger Menu
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Gifts for and who"
        //set back button
        //actionbar.setHomeAsUpIndicator(R.drawable.ic_baseline_burger);
        actionbar.setDisplayHomeAsUpEnabled(true)
        //// Burger Menu End

        // access the items of the list
        val languages = resources.getStringArray(R.array.Spinnreitems)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinnerhome)
        if (spinner != null) {
            val adapter = ArrayAdapter(this, R.layout.spinner_item, languages)
            spinner.adapter = adapter
        }


        btnkidLinearLayout.setOnClickListener{

            btnkidLinearLayout.setBackgroundResource(R.drawable.button_clicked_back)
            btnteenLinearLayout.setBackgroundResource(R.drawable.icon_background)
            btnadultLinearLayout.setBackgroundResource(R.drawable.icon_background)

        }

        btnteenLinearLayout.setOnClickListener{

            btnkidLinearLayout.setBackgroundResource(R.drawable.icon_background)
            btnteenLinearLayout.setBackgroundResource(R.drawable.button_clicked_back)
            btnadultLinearLayout.setBackgroundResource(R.drawable.icon_background)

        }

        btnadultLinearLayout.setOnClickListener{

            btnkidLinearLayout.setBackgroundResource(R.drawable.icon_background)
            btnteenLinearLayout.setBackgroundResource(R.drawable.icon_background)
            btnadultLinearLayout.setBackgroundResource(R.drawable.button_clicked_back)

        }

        ///Gender

        btnMaleLinearLayout.setOnClickListener{

            btnMaleLinearLayout.setBackgroundResource(R.drawable.button_clicked_back)
            btnFemaleLinearLayout.setBackgroundResource(R.drawable.icon_background)


        }

        btnFemaleLinearLayout.setOnClickListener{

            btnMaleLinearLayout.setBackgroundResource(R.drawable.icon_background)
            btnFemaleLinearLayout.setBackgroundResource(R.drawable.button_clicked_back)


        }



    }


    fun btnGo(view: View) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
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