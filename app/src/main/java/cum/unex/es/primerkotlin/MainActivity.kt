package cum.unex.es.primerkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton1.setOnClickListener(){
            accionboton()
        }
    }

    fun accionboton() {
        if (editText.text.toString().isEmpty()){
            Toast.makeText(this, "Pon el puto nombre", Toast.LENGTH_SHORT).show()
        }
        else{
            //Se crea el intent
            val intent = Intent(this, pantalla2::class.java)
            //Se añade el extra
            intent.putExtra("name", editText.text.toString())
            //Se inicia
            startActivity(intent)
        }
    }

}
