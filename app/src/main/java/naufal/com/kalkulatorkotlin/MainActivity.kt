package naufal.com.kalkulatorkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val result = {op : Char, a : Int, b : Int ->
        when (op) {
            '+' -> a + b
            '-' -> a - b
            'X' -> a * b
            ':' -> a / b
            else -> {
                print("Tidak ada")
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener({
            if (isInputValid()) {
                val op = '+'
                val hasil = result(op, et_bil1.text.toString().toInt(), et_bil2.text.toString().toInt())
                tv_hasil.text = hasil.toString()
            }
        })

        btnMin.setOnClickListener({
            if (isInputValid()) {
                val op = '-'
                val hasil = result(op, et_bil1.text.toString().toInt(), et_bil2.text.toString().toInt())
                tv_hasil.text = hasil.toString()
            }
        })

        btnKali.setOnClickListener({
            if (isInputValid()) {
                val op = 'X'
                val hasil = result(op, et_bil1.text.toString().toInt(), et_bil2.text.toString().toInt())
                tv_hasil.text = hasil.toString()
            }
        })

        btnBagi.setOnClickListener({
            if (isInputValid()) {
                val op = ':'
                val hasil = result(op, et_bil1.text.toString().toInt(), et_bil2.text.toString().toInt())
                tv_hasil.text = hasil.toString()
            }
        })
    }

    fun isInputValid() : Boolean {
        if (et_bil1.text.isNullOrEmpty() || et_bil2.text.isNullOrEmpty()) {
            Toast.makeText(this, "Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }
}
