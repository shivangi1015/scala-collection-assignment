package com.assignment

import com.assignment.models.{ScoreCard, Student}

import scala.collection.immutable

object q1 extends App {

  /*
  Write a method which takes no parameter and generates a Map with key student name
   and value as ScoreCard. As there can be more than one student with same name,
    the logic we have to follow is that, if two or more student has same name the
     key should be the name of the student and the values (ScoreCards) should be
     in a List, otherwise the key should be the student name and value should be
      the case class ScoreCard. e.g. Map should be Map[String, AnyRef].
   */
  def generateScore(): String = {

    val students = List(
      Student(1, "Mahesh"),
      Student(2, "Shiva"),
      Student(3, "Shiva")

    )
    val scoreCards = List(
      ScoreCard(1, Map(101 -> 79, 102 -> 90, 103 -> 86, 104 -> 74, 105 -> 99), 86),
      ScoreCard(2, marks = Map(101 -> 89, 102 -> 95, 103 -> 83, 104 -> 71, 105 -> 95), 86),
      ScoreCard(3, marks = Map(101 -> 89, 102 -> 95, 103 -> 83, 104 -> 71, 105 -> 95), 86)

    )

    val studentMarks: List[(String, ScoreCard)] = for{
      student <- students
      scoreCard <- scoreCards
      if student.id == scoreCard.studentId
    } yield student.name -> scoreCard

    val studentNames: List[String] = studentMarks.map(s => s._1)

    println(studentMarks)
    studentMarks.foreach(s1 => println(s1))

    /*def inn(list: List[(String, ScoreCard)]): List[(String, List[ScoreCard])] = {
      list match
    }*/

  /*  if(studentNames.distinct.lengthCompare(studentNames.size) == 0) {
      // No student has same name
      println("inside if")
      val re: List[Map[String, ScoreCard]] =  for{
        student <- students
        scoreCard <- scoreCards
        if student.id == scoreCard.studentId
      } yield Map(student.name -> scoreCard)

      println(re)
      re
    } else {
      //student has same name
      println("inside else")

    }*/
""
  }



  val r = generateScore()
  println(r)
}
