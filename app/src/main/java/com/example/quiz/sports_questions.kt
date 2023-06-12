package com.example.quiz

object sports_questions {

    fun getques():ArrayList<questions>{

        var queslist = arrayListOf<questions>()

        val quesone = questions(

            1,"What are the small pieces of wood on top of the stumps called? " ,R.drawable.fastract,
            "Bails","Sticks","Stumpettes","Toothpicks",1,false,false
        )

        queslist.add(quesone)

        val questwo =questions(
            2,"What does LBW stand for?" ,R.drawable.sbilogo,
            "Long Ball wide","Leg Before Wicket","Leg Beyond Wicket","Lol Bout To Win",2,false,false
        )
        queslist.add(questwo)



        val questhree =questions(
            3,"How high is a full-size goal post?" ,R.drawable.hindustan,
            "5 feet","6 feet","7 feet","8 feet",4,false,false
        )
        queslist.add(questhree)



        val quesfour =questions(
            4,"How long is a game of professional football? " ,R.drawable.lays,
            "60 minutes","90 minutes","45 minutes","70 minutes",2,false,false
        )
        queslist.add(quesfour)



        val quesfive =questions(
            5,"Who has hit most Sixes in Cricket after Chris Gayle" ,R.drawable.cooper,
            "Rohit Sharma","Sachin Tendulkar","AB de Villiers","MS Dhoni",1,false,false
        )
        queslist.add(quesfive)

        return queslist


    }




}