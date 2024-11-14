package com.example.quizapp

class QuestionLists {

     val capitalQuestions = listOf(
        Question("What is the capital of Sweden?", listOf("Stockholm","Warsaw","Lisbon","Moscow"), 0),

        Question("What is the capital of Russia?", listOf("Stockholm","Warsaw","Lisbon","Moscow"), 3),

        Question("What is the capital of Norway?", listOf("Stockholm","Warsaw","Oslo","Moscow"), 2),

        Question("What is the capital of France?", listOf("Paris","Tokyo","Lyon","Moscow"), 0),

        Question("What is the capital of Japan?", listOf("Seoul","Beijing","Tokyo","Bangkok"), 2),

        Question("What is the capital of Australia?",listOf("Stockholm","Canberra","Sydney","Melbourne"), 0),

        Question("What is the capital of Canada?", listOf("Toronto","Ottawa","Montreal","Vancouver"), 1),

        )

    val historyQuestions = listOf(
        Question(
            questionText = "Who was the first president of the United States?",

            options = listOf("George Washington", "Thomas Jefferson", "Abraham Lincoln", "John Adams"),

            correctAnswerIndex = 0
        ),
        Question(
            questionText = "In which year did World War II end?",
            options = listOf("1940", "1943", "1945", "1950"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "Who discovered America in 1492?",
            options = listOf("Christopher Columbus", "Marco Polo", "Leif Erikson", "Vasco da Gama"),
            correctAnswerIndex = 0
        ),
        Question(
            questionText = "Where was the first democracy established?",
            options = listOf("Rome", "Sparta", "Athens", "Carthage"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "Who was the British Prime Minister during most of World War II?",
            options = listOf("Winston Churchill", "Neville Chamberlain", "Clement Attlee", "Margaret Thatcher"),
            correctAnswerIndex = 0
        ),
        Question(
            questionText = "Which empire was ruled by Genghis Khan?",
            options = listOf("Ottoman Empire", "Mongol Empire", "Roman Empire", "Persian Empire"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "The fall of the Berlin Wall happened in which year?",
            options = listOf("2004", "1989", "2024", "105:BC"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "Who was known as the 'Maid of Orléans'?",
            options = listOf("Marie Antoinette", "Joan of Arc", "Catherine the Great", "Elizabeth I"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "What was the name of the ship that transported the Pilgrims to America in 1620?",
            options = listOf("Santa Maria", "Mayflower", "Endeavour", "Victoria"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "Which ancient civilization built the Machu Picchu?",
            options = listOf("Aztec", "Inca", "Maya", "Olmec"),
            correctAnswerIndex = 1
        )
    )
    val scienceAndTechQuestions = listOf(
        Question(
            questionText = "What planet is known as the Red Planet?",
            options = listOf("Earth", "Mars", "Jupiter", "Venus"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "What is the chemical symbol for water?",
            options = listOf("O2", "H2O", "CO2", "HO"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "Who developed the theory of relativity?",
            options = listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei", "Nikola Tesla"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "What is the largest organ in the human body?",
            options = listOf("Heart", "Liver", "Skin", "Lungs"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "Which planet has the most moons?",
            options = listOf("Earth", "Mars", "Saturn", "Jupiter"),
            correctAnswerIndex = 3
        ),
        Question(
            questionText = "What type of animal is a Komodo dragon?",
            options = listOf("Mammal", "Bird", "Reptile", "Amphibian"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "What is the powerhouse of the cell?",
            options = listOf("Nucleus", "Ribosome", "Mitochondrion", "Golgi apparatus"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "What does DNA stand for?",
            options = listOf("Deoxyribonucleic Acid", "Dynamic Nucleic Acid", "Double Nitrogen Acid", "Deoxynitric Acid"),
            correctAnswerIndex = 0
        ),
        Question(
            questionText = "Who invented the telephone?",
            options = listOf("Thomas Edison", "Alexander Graham Bell", "Nikola Tesla", "Guglielmo Marconi"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "Which element has the atomic number 1?",
            options = listOf("Oxygen", "Carbon", "Hydrogen", "Helium"),
            correctAnswerIndex = 2
        )
    )
    val generalKnowledgeQuestions = listOf(
        Question(
            questionText = "How many days are there in a leap year?",
            options = listOf("364", "365", "366", "367"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "What is the tallest animal in the world?",
            options = listOf("Elephant", "Giraffe", "Blue Whale", "Lion"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "Which country is famous for the Eiffel Tower?",
            options = listOf("Italy", "France", "Germany", "Spain"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "What color is the sky on a clear day?",
            options = listOf("Red", "Blue", "Green", "Yellow"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "Which fruit is known to keep the doctor away?",
            options = listOf("Banana", "Orange", "Apple", "Grape"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "What is the main ingredient in a traditional Italian pizza?",
            options = listOf("Rice", "Pasta", "Tomato Sauce", "Bread"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "Which planet is closest to the sun?",
            options = listOf("Earth", "Mars", "Mercury", "Venus"),
            correctAnswerIndex = 2
        ),
        Question(
            questionText = "What is the largest continent by area?",
            options = listOf("Africa", "Asia", "Europe", "South America"),
            correctAnswerIndex = 1
        ),
        Question(
            questionText = "What is the common term for sodium chloride?",
            options = listOf("Salt", "Sugar", "Vinegar", "Pepper"),
            correctAnswerIndex = 0
        ),
        Question(
            questionText = "Which ocean is the largest?",
            options = listOf("Atlantic", "Indian", "Arctic", "Pacific"),
            correctAnswerIndex = 3
        )
    )
}