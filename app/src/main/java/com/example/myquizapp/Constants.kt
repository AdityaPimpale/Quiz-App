package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does the flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Austria","Afghanistan",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does the flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Australia","Austria","Afghanistan",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does the flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina","Australia","Austria","Belgium",
            4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "What country does the flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina","Brazil","Austria","New Zealand",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5, "What country does the flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina","Australia","Denmark","Afghanistan",
            3
        )
        questionsList.add(que5)

        val que6 = Question(
            6, "What country does the flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","Australia","Austria","Afghanistan",
            1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does the flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina","Australia","Germany","Afghanistan",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8, "What country does the flag belong to?",
            R.drawable.ic_flag_of_india,
            "India","Australia","Austria","Afghanistan",
            1
        )
        questionsList.add(que8)

        val que9 = Question(
            9, "What country does the flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina","Australia","Austria","Kuwait",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10, "What country does the flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina","New Zealand","Austria","Afghanistan",
            2
        )
        questionsList.add(que10)

        return questionsList
    }
}