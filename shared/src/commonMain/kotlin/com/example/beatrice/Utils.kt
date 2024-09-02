package com.example.beatrice



data class UserData(
    val isMale: Boolean,
    val isFemale: Boolean,
    val age: Int,
    val height: Float,
    val weight: Int
)

sealed interface Status {

    data class Underweight(val value: String,  val message: String) : Status
    data class Normal(val value: String,val message: String) : Status
    data class Overweight(val value: String, val message: String) : Status
    data class Obese(val value: String,val message: String) : Status
}

data class BMIResult(
    val bmi: Double,
    val status: Status,
)

fun calculateBMI(data: UserData): BMIResult {
    val heightInMeters = data.height/100
    val bmi = data.weight.toDouble() / (heightInMeters * heightInMeters)

  return  if (bmi <= 18.4) {
        BMIResult(
            bmi = bmi,
            status = Status.Underweight(
                value = "UnderWeight",
                message = "Your Weight is a bit low! Consult a doctor/nutritionist for guidance")
        )
    }else if (bmi in 18.5..24.4){
        BMIResult(
            bmi = bmi,
            status = Status.Underweight(
                value = "Normal",
                message = "Good job! You're in great shape")
        )
    }else if (bmi in 24.5 ..29.4){
        BMIResult(
            bmi = bmi,
            status = Status.Underweight(
                value = "Overweight",
                message = "Your Weight is a bit high! Consult a doctor/nutritionist for guidance")
        )
    }else{
        BMIResult(
            bmi = bmi,
            status = Status.Underweight(
                value = "Obese",
                message = "Your Weight is tipping the scale! Consult a doctor/nutritionist for guidance")
        )
    }
}