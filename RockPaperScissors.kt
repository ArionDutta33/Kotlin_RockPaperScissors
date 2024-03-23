package com.example.rockpaperscissors

fun main(){
    var playerChoice=""//initially the no choice
    var computerChoice=""//initially the no choice
    println("Rock,Paper or Scissors? Enter your choice!")
    playerChoice= readln()//taking the input from the player

    val randomNumber=(1..3).random()//generating a random choice from the computer
    //assigning the choices to the computer
  when(randomNumber){
      1->{
          computerChoice="Rock"
      }
      2->{
          computerChoice="Papers"
      }
      3->{
          computerChoice="Scissors"
      }
  }

    //defining when does the player wins for all other choices the computer wins
    val winner=when{
        playerChoice==computerChoice->"Tie"
        playerChoice=="Rock"&&computerChoice=="Scissors"->"Player"
        playerChoice=="Paper"&&computerChoice=="Rock"->"Player"
        playerChoice=="Scissors"&&computerChoice=="Paper"->"Player"
        else->"Computer"
    }

    //checking the winner and displaying it
    if(winner=="Tie")
        println("THe match was tied")
else if(winner=="Player")
println("The player won the match")
    else
        println("Computer won the match")
}
