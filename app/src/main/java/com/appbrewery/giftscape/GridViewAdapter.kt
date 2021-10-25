package com.appbrewery.giftscape

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class GridViewAdapter (var mCntx : Context, var resources : Int, var items:List<GridViewModel>): ArrayAdapter<GridViewModel>(mCntx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCntx)
        val view: View = layoutInflater.inflate(resources,null)

        val imageView: ImageView = view.findViewById(R.id.GriCusImage)
        val titleTextView: TextView = view.findViewById(R.id.GriCusTitle)
        val priceTextView: TextView = view.findViewById(R.id.GriCusPrice)
        val addImageView: ImageView = view.findViewById(R.id.GriCusAddImageBtn)
        val favImageView: ImageView = view.findViewById(R.id.GriCusFavImageBtn)

        var mItem:GridViewModel = items[position]
        imageView.setImageDrawable(mCntx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        priceTextView.text = mItem.price


        var FavVariable = 0

        addImageView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Toast.makeText(mCntx, "Its toast!", Toast.LENGTH_SHORT).show()

                val intent = Intent(mCntx,ActivityDescription::class.java)
                mCntx.startActivity(intent)

            }

        })

        favImageView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Toast.makeText(mCntx, "Its toast!", Toast.LENGTH_SHORT).show()

                if(FavVariable==0)
                {
                    FavVariable=1
                    favImageView.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
                }
                else
                {
                    FavVariable=0
                    favImageView.setBackgroundResource(R.drawable.ic_baseline_outlined_heart_24)

                }




//                val intent = Intent(mCntx,ActivityDescription::class.java)
//                mCntx.startActivity(intent)

            }

        })

        return view
    }

}