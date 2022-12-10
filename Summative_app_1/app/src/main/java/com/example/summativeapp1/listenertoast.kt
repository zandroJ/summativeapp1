package com.example.summativeapp1

import android.graphics.Color
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class listenertoast : View.OnClickListener{
    override fun onClick(p0: View?) {
        when(p0?.id){

            R.id.blue_btn -> {
                Toast.makeText(p0.context, "Color Blue is Selected", Toast.LENGTH_LONG).show()

            }
            R.id.red_btn ->
            {
                Toast.makeText(p0.context, "Color Red is Selected", Toast.LENGTH_LONG).show()
            }
            R.id.green_btn ->
            {
                Toast.makeText(p0.context, "Color Green is Selected", Toast.LENGTH_LONG).show()
            }
            R.id.yellow_btn ->
            {
                Toast.makeText(p0.context, "Color Yellow is Selected", Toast.LENGTH_LONG).show()
            }
            R.id.orange_btn ->
            {
                Toast.makeText(p0.context, "Color Orange is Selected", Toast.LENGTH_LONG).show()
            }
            R.id.purple_btn ->
            {
                Toast.makeText(p0.context, "Color Purple is Selected", Toast.LENGTH_LONG).show()
            }




        }
    }

}