package com.example.quiz

object constants {

    fun getques():ArrayList<questions>{

        var queslist = arrayListOf<questions>()

        val quesone = questions(

            1,"Identify the company with it's logo " ,R.drawable.fastract,
            "Titan","Fastrack","Casico","Timex",2,false,false
        )

        queslist.add(quesone)

        val questwo =questions(
            2,"Identify the company with it's logo " ,R.drawable.sbilogo,
            "Axis Bank","Bank of Baroda","State Bank Of India","Indusland Bank",3,false,false
        )
        queslist.add(questwo)



        val questhree =questions(
            3,"Identify the company with it's logo " ,R.drawable.hindustan,
            "Indian Oil","Hindustan Petroleum","Reliance Petroleum","Bharat Petroleum",2,false,false
        )
        queslist.add(questhree)



        val quesfour =questions(
            4,"Identify the company with it's logo " ,R.drawable.lays,
            "Pringles","Parle G","Lay's","Britannia",3,false,false
        )
        queslist.add(quesfour)



        val quesfive =questions(
            5,"Identify the company with it's logo " ,R.drawable.cooper,
            "Mini Cooper","Aston Martin","Bentley","Mazda",1,false,false
        )
        queslist.add(quesfive)

        return queslist


    }




}