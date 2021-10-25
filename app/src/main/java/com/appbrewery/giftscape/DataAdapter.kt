package com.appbrewery.giftscape

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity


class DataAdapter (var mCntx : Context, var resources : Int, var items:List<DataModel>):ArrayAdapter<DataModel>(mCntx,resources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCntx)
        val view:View = layoutInflater.inflate(resources,null)

        val imageView:ImageView = view.findViewById(R.id.lvImage)
        val titleTextView:TextView = view.findViewById(R.id.lvTitle)
        val descButton:ImageView = view.findViewById(R.id.btnDesc)

        var mItem:DataModel = items[position]
        imageView.setImageDrawable(mCntx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title

        descButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
               // Toast.makeText(mCntx, "Its toast!", Toast.LENGTH_SHORT).show()

                val intent =Intent(mCntx,ActivityDescription::class.java)
                mCntx.startActivity(intent)

            }

        })

        return view
    }

}

