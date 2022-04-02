package com.example.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var numberOne: Float = 0.0f
    var numberTwo: Float = 0.0f
    var isAddition: Boolean = false
    var number: String = ""
    var isDiv: Boolean = false
    var isSub: Boolean = false
    var isMul: Boolean = false
    var isMod: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationfun(view: View) {
        var editext: EditText? = findViewById(R.id.edit_text)

        when (view.id) {
            R.id.one -> {
                number = number + "1"
                editext?.setText(number)
            }
            R.id.two -> {
                number = number + "2"
                editext?.setText(number)
            }
            R.id.three -> {
                number = number + "3"
                editext?.setText(number)
            }
            R.id.four -> {
                number = number + "4"
                editext?.setText(number)
            }
            R.id.five -> {
                number = number + "5"
                editext?.setText(number)
            }
            R.id.six -> {
                number = number + "6"
                editext?.setText(number)
            }
            R.id.seven -> {
                number = number + "7"
                editext?.setText(number)
            }
            R.id.eight -> {
                number = number + "8"
                editext?.setText(number)
            }
            R.id.nine -> {
                number = number + "9"
                editext?.setText(number)
            }
            R.id.zero -> {
                number = number + "0"
                editext?.setText(number)
            }
            R.id.clear -> {
                number = ""
                editext?.setText("")
            }
            R.id.dot -> {
                number = number + "."
                editext?.setText(number)
            }

            R.id.plus -> {
                if (number.isNullOrBlank()) {
                    editext?.setText("")
                } else {
                    numberOne = number.toFloat()
                    number = number+ "+"
                    editext?.setText(number)
                    number = ""
                    isAddition = true

                }
            }
            R.id.sub -> {
                if (number.isNullOrBlank()) {
                    editext?.setText("")
                } else {
                    numberOne = number.toFloat()
                    number = number+ "-"
                    editext?.setText(number)
                    number = ""
                    isSub = true

                }
            }
            R.id.div -> {
                if (number.isNullOrBlank()) {
                    editext?.setText("")
                } else {
                    numberOne = number.toFloat()
                    number = number+ "/"
                    editext?.setText(number)
                    number = ""
                    isDiv = true

                }
            }
            R.id.mul -> {
                if (number.isNullOrBlank()) {
                    editext?.setText("")
                } else {
                    numberOne = number.toFloat()
                    number = number+ "*"
                    editext?.setText(number)
                    number = ""
                    isMul = true

                }
            }
            R.id.modulo -> {
                if (number.isNullOrBlank()) {
                    editext?.setText("")
                } else {
                    numberOne = number.toFloat()
                    number = number+ "%"
                    editext?.setText(number)
                    number = ""
                    isMod = true

                }
            }
            R.id.result -> {
                if (isAddition == true) {
                    numberTwo = number.toFloat()
                    editext?.setText((numberOne + numberTwo).toString())
                    number = (numberOne + numberTwo).toString()
                    isAddition = false
                } else if (isDiv) {
                    numberTwo = number.toFloat()
                    editext?.setText((numberOne/numberTwo).toString())
                    number = (numberOne/numberTwo).toString()
                    isDiv = false

                } else if (isSub) {
                    numberTwo = number.toFloat()
                    editext?.setText((numberOne - numberTwo).toString())
                    number = (numberOne - numberTwo).toString()
                    isSub = false
                } else if (isMul) {
                    numberTwo = number.toFloat()
                    editext?.setText((numberOne * numberTwo).toString())
                    number = (numberOne * numberTwo).toString()
                    isMul = false
                }else if (isMod) {
                    numberTwo = number.toFloat()
                    editext?.setText((numberOne%numberTwo).toString())
                    number = (numberOne %numberTwo).toString()
                    isMod = false
                }

            }
        }
    }
}