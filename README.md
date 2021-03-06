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

* Car Registration: this exercise let me practice on declaring customized equals() and hashCode() methods for my custom classes, in order to override the default ones inherithed from the Object class. Running the App only shows that the app is working as supposed. (MOOC part 2, exercise 9)

* Storehouse: this app let's you purchase from an hypothetical store. This was aimed to practice the use of Java default interfaces like Map and Set. (MOOC part 2, exercise 12)

* Comparable: simple exercise to test the implementation of the Comparable interface. (MOOC part 2, exercise 13)

* Ski Jumping: this little app simulates a ski jumping simulator. First you'll enter the name of the jumpers, then you'll make them compete by typing "jump" when prompted to do so. Once you've had enough it will display all the ranking (Sorted using the comparable interface). (MOOC part 2, exercise 16) 

* Sensors: in this exercises I practiced again the interfaces, and put to use the newly acquired knowledge about exceptions and how to throw them. (MOOC part 2, exercise 20)

* Word Inspection: this exercise is aimed to practice File reading adn File writing. (MOOC part 2, exercise 23)

* Phone Register: with this app I created a phone register capable of saving multiple numbers for the same user (By using an HashMap<String, List<String>>) and his address. It has multiple functions to look up the stored informations. (MOOC part 2, exercise 26)

* Farm Simulator: strange exercise, its purpouse was to teach that even tough we had just learnt how to implement inheritance and interfaces, it would be hard to know when to implement them, and that most problems will be first resolved without using these tools and then the solution of said problem will be improved.
Anyway this exercise simulates a farm where cows produce milk... make of this what you want.