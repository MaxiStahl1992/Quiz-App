package de.example.quizapp

import com.example.quizapp.R

object Constants{

    const val USERNAME: String = "username"
    const val TOTALQUESTIONS: String = "totalQuestions"
    const val CORRECTANSWERS: String = "correctAnswers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question( 1, "Wer war zu Beginn des 2. Weltkriegs US Präsident",
        R.drawable.usa,
            "Franklin Delano Roosevelt",
            "Theodor Roosevelt",
            "Dwight. D. Eisenhower",
            "Woodrow Wilson",
            1)

        val que2 = Question( 2, "Wie heißt die Hauptstadt von Burkina Faso?",
            R.drawable.burkinafaso,
            "Gaborone",
            "Addis Abeba",
            "Ouagadougou",
            "Malabo",
            3)

        val que3 = Question( 3, "Aus wievielen Kräutern und Pflanzen wird Ramazotti gemacht?",
            R.drawable.rama,
            "55",
            "33",
            "44",
            "66",
            2)

        val que4 = Question( 4, "Wie hoch hängt ein Basketballkorb?",
            R.drawable.basketball,
            "3.03m",
            "3.10m",
            "3.05m",
            "3.07m",
            3)

        val que5 = Question( 5, "Wie lange hat Goethe an seinem Faust geschrieben?",
            R.drawable.faust,
            "52 Jahre",
            "5 Jahre",
            "64 Jahre",
            "18 Jahre",
            3)

        val que6 = Question( 6, "Wie lange dauerte der 30 Jährige Krieg?",
            R.drawable.krieg,
            "28 Jahre",
            "30 Jahre",
            "29 Jahre",
            "31 Jahre",
            2)

        val que7 = Question( 7, "Welcher Schweizer bekam 1901 den ersten Friedensnobelpreis?",
            R.drawable.nobel,
            "Antonio Abetti",
            "Henry Dunant",
            "Max Aub",
            "Ernst Abbe",
            2)

        val que8 = Question( 8, "Welche Ordnungszahl hat Kupfer im Periodensystem der Elemente?",
            R.drawable.chemie,
            "35",
            "41",
            "16",
            "29",
            4)

        val que9 = Question( 9, "Welcher Schauspieler verkörperte 1965 James Bond?",
            R.drawable.bond,
            "Sean Connery",
            "Timothy Dalton",
            "Roger Moore",
            "George Lazenby",
            1)

        val que10 = Question( 10, "Wieviele Jahre dauert es bis der Jupiter die Sonne umrundet hat?",
            R.drawable.jupiter,
            "24",
            "12",
            "10",
            "8",
            3)

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)
        return questionsList
    }


}