package com.calivera.andriod.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll_dice.setOnClickListener {
            diceroll()
        }
    }

    private fun diceroll() {
        var num = Random().nextInt(6) + 1
        var diceResult = when(num){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else ->  R.drawable.dice_6
        }
        dice_result.setImageResource(diceResult)
    }
}