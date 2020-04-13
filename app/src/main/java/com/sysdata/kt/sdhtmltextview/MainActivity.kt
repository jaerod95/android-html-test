package com.sysdata.kt.sdhtmltextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.htmlText = "<span style=\"font-size: 80px; line-height: 80px; font-family: Arial; color: #cccccc\">font-size: 80px line-height: 80px font-family: Arial Color: #cccccc</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 80px; font-family: Arial; color: red\">font-size: 25px line-height: 80px font-family: Arial Color: red</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 24px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 24px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 23px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 23px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 22px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 22px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 21px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 21px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 20px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 20px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 19px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 19px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 18px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 18px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 17px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 17px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 16px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 16px font-family: monospace Color: #fe85a2</span>" +
                "<br/><br/>" +
                "<span style=\"font-size: 25px; line-height: 15px; font-family: monospace; color: #fe85a2\">font-size: 25px line-height: 15px font-family: monospace Color: #fe85a2</span>"
    }
}
