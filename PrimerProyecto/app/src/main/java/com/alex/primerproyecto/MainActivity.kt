package com.alex.primerproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.RadioButton
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var check1: CheckBox
    private lateinit var check2: CheckBox
    private lateinit var check3: CheckBox
    private lateinit var check4: CheckBox
    private lateinit var check5: CheckBox

    //private lateinit var textGenero  : TextView
    private lateinit var radioTerror: RadioButton
    private lateinit var radioComedia: RadioButton
    private lateinit var radioSuspenso: RadioButton
    //private lateinit var textRadioB  : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check1 = findViewById<CheckBox>(R.id.ch1)
        check2 = findViewById<CheckBox>(R.id.ch2)
        check3 = findViewById<CheckBox>(R.id.ch3)
        check4 = findViewById<CheckBox>(R.id.ch4)
        check5 = findViewById<CheckBox>(R.id.ch5)

        check1.setOnCheckedChangeListener(changeChecked)
        check2.setOnCheckedChangeListener(changeChecked)
        check3.setOnCheckedChangeListener(changeChecked)
        check4.setOnCheckedChangeListener(changeChecked)
        check5.setOnCheckedChangeListener(changeChecked)

        radioTerror = findViewById<RadioButton>(R.id.rbTerror)
        radioComedia = findViewById<RadioButton>(R.id.rbComedia)
        radioSuspenso = findViewById<RadioButton>(R.id.rbSuspenso)

        radioTerror.setOnCheckedChangeListener(radioChecked)
        radioComedia.setOnCheckedChangeListener(radioChecked)
        radioSuspenso.setOnCheckedChangeListener(radioChecked)

        val fabAction= findViewById<FloatingActionButton>(R.id.fbInfo)
        fabAction.setOnClickListener(fabClick)


    }

    private val changeChecked = CompoundButton.OnCheckedChangeListener { button, checked ->
        val recycle_view = findViewById<RecyclerView>(R.id.recycleView)
        var listaElementos: MutableList<card_class> = arrayListOf()
        var elemento : card_class
        var plcAdaptador = PlcAdaptador(listaElementos)
        recycle_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

            if(radioTerror.isChecked && check1.isChecked ){
                elemento=  createCards().get(0)
                listaElementos.add(elemento)

            }

            if(radioTerror.isChecked && check2.isChecked ){
                elemento=  createCards().get(1)
                listaElementos.add(elemento)

            }

            if(radioTerror.isChecked && check3.isChecked ){
                elemento=  createCards().get(2)
                listaElementos.add(elemento)

            }

            if(radioTerror.isChecked && check4.isChecked ){
                elemento=  createCards().get(3)
                listaElementos.add(elemento)

            }

            if(radioTerror.isChecked && check5.isChecked ){
                elemento=  createCards().get(4)
                listaElementos.add(elemento)

            }

        if(radioComedia.isChecked && check1.isChecked ){
            elemento=  createCards().get(5)
            listaElementos.add(elemento)

        }

        if(radioComedia.isChecked && check2.isChecked ){
            elemento=  createCards().get(6)
            listaElementos.add(elemento)

        }

        if(radioComedia.isChecked && check3.isChecked ){
            elemento=  createCards().get(7)
            listaElementos.add(elemento)

        }

        if(radioComedia.isChecked && check4.isChecked ){
            elemento=  createCards().get(8)
            listaElementos.add(elemento)

        }

        if(radioComedia.isChecked && check5.isChecked ){
            elemento=  createCards().get(9)
            listaElementos.add(elemento)

        }

        if(radioSuspenso.isChecked && check1.isChecked ){
            elemento=  createCards().get(10)
            listaElementos.add(elemento)

        }

        if(radioSuspenso.isChecked && check2.isChecked ){
            elemento=  createCards().get(11)
            listaElementos.add(elemento)

        }

        if(radioSuspenso.isChecked && check3.isChecked ){
            elemento=  createCards().get(12)
            listaElementos.add(elemento)

        }

        if(radioSuspenso.isChecked && check4.isChecked ){
            elemento=  createCards().get(13)
            listaElementos.add(elemento)

        }

        if(radioSuspenso.isChecked && check5.isChecked ){
            elemento=  createCards().get(14)
            listaElementos.add(elemento)

        }

        recycle_view.adapter= plcAdaptador

        plcAdaptador.notifyDataSetChanged()

    }

    private val radioChecked = CompoundButton.OnCheckedChangeListener { button, checked ->

        if (radioTerror.isChecked) {
            check1.isChecked=false;
            check2.isChecked=false;
            check3.isChecked=false;
            check4.isChecked=false;
            check5.isChecked=false;

            check1.text = "Masacre en Texas"
            check2.text = "El conjuro"
            check3.text = "Actividad Paranormal"
            check4.text = "Exorcismo de Emily Rose"
            check5.text = "Saw"

        }
        if (radioComedia.isChecked) {
           check1.isChecked=false;
            check2.isChecked=false;
            check3.isChecked=false;
            check4.isChecked=false;
            check5.isChecked=false;

            check1.text = "Scary Movie"
            check2.text = "Todo Poderoso"
            check3.text = "SuperCool"
            check4.text = "KickAss"
            check5.text = "Ted"

        }
        if (radioSuspenso.isChecked) {

            check1.isChecked=false;
            check2.isChecked=false;
            check3.isChecked=false;
            check4.isChecked=false;
            check5.isChecked=false;

            check1.text = "Hush"
            check2.text = "Psicosis "
            check3.text = "La casa de cera"
            check4.text = "Bird Box"
            check5.text = "Estación Zombie"

        }
    }

    fun createCards(): List<card_class> {
        val cards = mutableListOf<card_class>()
        cards.add(
            card_class(
                R.drawable.ic_masacre_texas1,
                "Masacre en Texas"

                )
        )

        cards.add(
            card_class(
                R.drawable.ic_conjuro,
                "El Conjuro"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_actividadparanormal,
                "Actividad Paranormal"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_el_exorcismo_de_emily_rose,
                "Excorcismo de Emily Rose"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_saw,
                "SAW"

            )
        )

        cards.add(
            card_class(
                R.drawable.ic_scarymovie,
                "Scary Movie"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_todo_poderoso,
                "Todo Poderoso"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_supercool,
                "Super Cool"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_kickass,
                "Kick Ass"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_ted,
                "Ted"

            )
        )

        cards.add(
            card_class(
                R.drawable.ic_hush,
                "Hush"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_psicosis,
                "Psicosis"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_casadecera,
                "La Casa de cera"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_birdbox,
                "Bird Box"

            )
        )
        cards.add(
            card_class(
                R.drawable.ic_estacion_zombie,
                "Estación Zombie"

            )
        )
        return cards
    }

    private val fabClick = View.OnClickListener { fab ->
        var generoSeleccionado: String=""
        var peliculasSeleccionadas: String=""
        if(radioTerror.isChecked){
            generoSeleccionado+=radioTerror.text
        }
        if(radioComedia.isChecked){
            generoSeleccionado+=radioComedia.text
        }
        if(radioSuspenso.isChecked){
            generoSeleccionado+=radioSuspenso.text
        }

        if(check1.isChecked){
        peliculasSeleccionadas+=("\n-"+check1.text)
        }
        if(check2.isChecked){
            peliculasSeleccionadas+=("\n-"+check2.text)
        }
        if(check3.isChecked){
            peliculasSeleccionadas+=("\n-"+check3.text)
        }
        if(check4.isChecked){
            peliculasSeleccionadas+=("\n-"+check4.text)
        }
        if(check5.isChecked){
            peliculasSeleccionadas+=("\n-"+check5.text)
        }

        var texto: String = ("NOMBRE DEL USUARIO\n"+ editTextNombre.text+"\n"+"\nCORREO\n"+ editTextCorreo.text+"\n"+"\nTELÉFONO\n"+editTextTelefono.text
                +"\n"+"\nGÉNERO DE PELICULA\n"+generoSeleccionado+"\n"+"\nPELICULAS SELECCIONADAS\n"+ peliculasSeleccionadas)


        val alertDialog=  AlertDialog.Builder(fab.context)

            .setTitle("Información Registrada")
            .setMessage(texto)
            .setPositiveButton("OK", null)
            .create()
            alertDialog.show()
    }


}