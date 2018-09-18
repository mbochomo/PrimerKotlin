package cum.unex.es.primerkotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cum.unex.es.primerkotlin.R.string.welcome
import kotlinx.android.synthetic.main.activity_pantalla2.*

class pantalla2 : AppCompatActivity() {

    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        val bundle = intent.extras
        val name = bundle.get("name")
        textView.text = getString(welcome, name)
    }
}
