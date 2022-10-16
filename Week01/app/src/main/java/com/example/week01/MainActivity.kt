package com.example.week01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInputNama : Button
    lateinit var btnHelp : Button
    lateinit var btnlinear : Button
    lateinit var btnconstraint : Button
    lateinit var btndutatani : Button
    lateinit var edInputNama : EditText
    lateinit var btnrv : Button
    lateinit var btncv : Button
    lateinit var btngetapi : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = getString(R.string.text_progmob_main)
        btnInputNama = findViewById(R.id.btn_ambil_nama)
        btnHelp = findViewById(R.id.btn_help)
        edInputNama = findViewById(R.id.ed_input_nama)
        btnInputNama.setOnClickListener(View.OnClickListener { view ->
            var strTmp = edInputNama.text.toString()
            tvMain.text = strTmp
        })
        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edInputNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(this@MainActivity,
                HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
            finish()
        })

        btnlinear = findViewById(R.id.btn_linear)
        btnlinear.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, LinearActivity::class.java)
            startActivity(intent)

    })
        btnconstraint = findViewById(R.id.btn_constraint)
        btnconstraint.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, ConstraintActivity::class.java)
            startActivity(intent)

        })
        btndutatani = findViewById(R.id.btn_dutatani)
        btndutatani.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, DutaTani::class.java)
            startActivity(intent)

        })
        btnrv = findViewById(R.id.btn_sampleRV)
        btnrv.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, SampleRecyclerView::class.java)
            startActivity(intent)

        })
        btncv = findViewById(R.id.btn_sampleCV)
        btncv.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, Sample_Card_View::class.java)
            startActivity(intent)

        })
        btngetapi = findViewById(R.id.btnGetAPI)
        btngetapi.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, GetAPIActivity::class.java)
            startActivity(intent)

        })
}}