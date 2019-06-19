# java-exercises Part 2

I'm solving the exercises inspired from the MOOC from the second part of the University of Helsinki's java course. 

In solving this exercises I'm using JDK 11.0.3, Maven 3.6.0 (in order to get used to it once I'll learn to build bigger projects) and VS Code as an IDE (planning to switch to NetBeans or Intellij in a couple of weeks).

To run an App navigate to its target/classes folder then run java com.vanny96.App

e.g. for linux:

    $ cd java-exercises
    $ cd name/target/classes
    $ java com.vanny96.App
    
## Exercises

* Airplane: this app is divided in 2 sections
  * Airport Panel: let's you add planes and flights to the airport
  * Flight Service: gives informations about the flights and planes you have previously added to the airport

  this exercise was aimed to practice the basics of OOP already gained. (MOOC part 2, exercise 8)

* Car Registration: this exercise let me practice on declaring customized equals() and hashCode() methods for my custom classes, in order to override the default ones inherithed from the Object class. Running the App only shows that the app is working as supposed.