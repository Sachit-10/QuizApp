package com.example.quiz

object mathsconstants {


    fun getques():ArrayList<questions>{

        var queslist = arrayListOf<questions>()

        val quesone = questions(

            1,"What is three fifth of 100? " ,R.drawable.greentick,
            "3","5","20","60",4,false,false
        )

        queslist.add(quesone)

        val questwo =questions(
            2,"If David’s age is 27 years old in 2011. What was his age in 2003? " ,R.drawable.greentick,
            "17 years","37 years","20 years","19 years",4,false,false
        )
        queslist.add(questwo)



        val questhree =questions(
            3," I am a number. I have 7 in the ones place. I am less than 80 but greater than 70. What is my number? " ,R.drawable.greentick,
            "71","73","75","77",4,false,false
        )
        queslist.add(questhree)



        val quesfour =questions(
            4,"How many years are there in a decade?o " ,R.drawable.greentick,
            "5","10","15","20",2,false,false
        )
        queslist.add(quesfour)



        val quesfive =questions(
            5,"In a century how many months are there? " ,R.drawable.greentick,
            "12","120n","1200","1200",3,false,false
        )
        queslist.add(quesfive)

        return queslist


    }
}