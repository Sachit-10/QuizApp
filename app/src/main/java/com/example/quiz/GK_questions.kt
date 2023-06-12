package com.example.quiz

object GK_questions {

        fun getques():ArrayList<questions>{

            var queslist = arrayListOf<questions>()

            val quesone = questions(

                1,"Who was the first person who entered into space?" ,R.drawable.fastract,
                "Neil Armstrong","Yuri Gagarin","William Lundigan","Edward McCauley",2,false,false
            )

            queslist.add(quesone)

            val questwo =questions(
                2,"The racing area of Cycling is known as …" ,R.drawable.sbilogo,
                "Velodrome"," Track","Ring"," Range",1,false,false
            )
            queslist.add(questwo)



            val questhree =questions(
                3,"Tata Institute of Fundamental Research is located in …" ,R.drawable.hindustan,
                "New Delhi","Mumbai","Gulbarg","Lucknow",2,false,false
            )
            queslist.add(questhree)



            val quesfour =questions(
                4,"The world famous monument ‘the Imperial Palace’ is located in …" ,R.drawable.lays,
                "Italy","Japan","USA","Australia",2,false,false
            )
            queslist.add(quesfour)



            val quesfive =questions(
                5,"Who was the first Union Cabinet Minister who resigned." ,R.drawable.cooper,
                " Shyam Prasad Mu..kherjee","Lal Bahadur Shastri","Sachitanand","Jay Prakash Narayan",1,false,false
            )
            queslist.add(quesfive)

            return queslist


        }




    }
