package com.example.summativeapp1
import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.View.*
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import kotlinx.android.synthetic.main.layout_dialog.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        var red = false
        var blue = false
        var green = false
        var yellow = false
        var purple = false
        var orange = false
        var isTaken = false
        val layout = layoutInflater.inflate(R.layout.custom_toast,custom_toast)
        val dialog = layoutInflater.inflate(R.layout.layout_dialog,null)
        val myDialog = Dialog(this@MainActivity)
        myDialog.setContentView(dialog)
        myDialog.setCancelable(true)
//        myDialog.window!!.attributes.windowAnimations = R.style.dialogAnimation; this not working animation for dialog :/
        myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        myDialog.window!!.setGravity(Gravity.CENTER)
        myDialog.show()


        val btn_alert = dialog.findViewById<Button>(R.id.btnalert)
        btn_alert.setOnClickListener{
            myDialog.dismiss()
        }


        confirm_btn.setOnClickListener {
            if (blue && red) {
                result.setBackgroundColor(Color.rgb(191,64,191))
            }
            else if (blue && green) {
                result.setBackgroundColor(Color.rgb(13,152,186))
            }
            else if (blue && purple) {
                result.setBackgroundColor(Color.rgb(172,172,230))
            }
            else if (red && orange) {
                result.setBackgroundColor(Color.rgb(100,32,28))
            }
            else if (red && purple) {
                result.setBackgroundColor(Color.rgb(149,53,83))
            }
            else if (yellow && green) {
                result.setBackgroundColor(Color.rgb(154,205,50))
            }
            else if (yellow && orange) {
                result.setBackgroundColor(Color.rgb(255,174,66))
            }
            else if (blue && yellow) {
                result.setBackgroundColor(Color.GREEN)
            }
            else if (yellow && red) {
                result.setBackgroundColor(Color.rgb(255,165,0))
            }
            else if (purple && green) {
                result.setBackgroundColor(Color.rgb(150,75,0))
            }
            else if (purple && yellow) {
                result.setBackgroundColor(Color.rgb(181,101,29))
            }
            else if (orange && green) {
                result.setBackgroundColor(Color.rgb(150,75,0))
            }
            else if (orange && blue) {
                result.setBackgroundColor(Color.rgb(150,75,0))
            }
            else if (orange && purple) {
                result.setBackgroundColor(Color.rgb(150,75,0))
            }
            else if (red && green) {
                result.setBackgroundColor(Color.YELLOW)
            }

            else {
                result.setBackgroundColor(android.R.drawable.btn_default)
                Toast(this).apply{
                    duration = Toast.LENGTH_SHORT
                    setGravity(Gravity.TOP,0,20)
                    view = layout
                }.show()
            }
            red = false
            blue = false
            yellow = false
            green = false
            orange = false
            purple = false
            isTaken = false


        }
        clear_btn.setOnClickListener(object : OnClickListener {
            override fun onClick(p0: View?) {
                color_slot_1.setBackgroundColor(android.R.drawable.btn_default)
                color_slot_2.setBackgroundColor(android.R.drawable.btn_default)
                result.setBackgroundColor(android.R.drawable.btn_default)
                red = false
                blue = false
                yellow = false
                green = false
                orange = false
                purple = false
                isTaken = false
            }
        })

        blue_btn.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                blue = true
                if (!isTaken) {
                    color_slot_1.setBackgroundColor(Color.BLUE)
                    isTaken = true
                }
                else{
                    color_slot_2.setBackgroundColor(Color.BLUE)
                    isTaken = true
                }
            }
        })
        red_btn.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                red = true
                if (v != null) {
                    if (isTaken) {
                        color_slot_2.setBackgroundColor(Color.RED)
                        isTaken = true
                    }
                    else {
                        color_slot_1.setBackgroundColor(Color.RED )
                        isTaken = true
                    }

                }
            }
        })

        green_btn.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                green = true
                if (!isTaken) {
                    color_slot_1.setBackgroundColor(Color.GREEN)
                    isTaken = true
                }
                else{
                    color_slot_2.setBackgroundColor(Color.GREEN)
                    isTaken = true
                }
            }
        })
        yellow_btn.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                yellow = true
                if (isTaken) {
                    color_slot_2.setBackgroundColor(Color.YELLOW)
                    isTaken = true
                }
                else{
                    color_slot_1.setBackgroundColor(Color.YELLOW)
                    isTaken = true
                }
            }
        })

        orange_btn.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                orange = true
                if (!isTaken) {
                    color_slot_1.setBackgroundColor(Color.rgb(255, 165, 0))
                    isTaken = true
                }
                else{
                    color_slot_2.setBackgroundColor(Color.rgb(255, 165, 0))
                    isTaken = true
                }
            }
        })
        purple_btn.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
               purple = true
                if (isTaken) {
                    color_slot_2.setBackgroundColor(Color.rgb(191,64,191))
                    isTaken = true
                }
                else{
                    color_slot_1.setBackgroundColor(Color.rgb(191,64,191))
                    isTaken = true
                }
            }
        })








    }

}