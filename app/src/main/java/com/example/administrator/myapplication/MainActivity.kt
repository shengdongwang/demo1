package com.example.administrator.myapplication

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList

/**
 * Created by Administrator on 2017/12/29.
 */
class MainActivity : Activity() {
    private var tv_test:TextView? = null
    private var tv_kk:TextView? = null
    private var acc:MutableList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        acc!!.add("1")
        acc!!.add("2")
        acc.add("3")

        tv_test=findViewById(R.id.tv_test) as TextView
        tv_kk=findViewById(R.id.tv_kk)as TextView
        tv_test!!.setText("123456")
        tv_test!!.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"hello",Toast.LENGTH_LONG).show()
            for (i in 0 ..acc.size-1){
                var ap:String
                ap=tv_kk!!.text.toString()
                tv_kk!!.setText(ap+acc.get(i)+"ppppp")
            }
        })
    }
}