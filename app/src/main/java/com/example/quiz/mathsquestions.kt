package com.example.quiz

data class mathsquestions(
    var id:Int,
    var ques:String,
    var opiton1:String,
    var opiton2:String,
    var opiton3:String,
    var opiton4:String,
    var correctans:Int,
    var isselected:Boolean,
    var iscompleted:Boolean
)