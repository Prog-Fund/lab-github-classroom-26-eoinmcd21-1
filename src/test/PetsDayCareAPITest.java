
package test;

import controllers.PetsDayCareAPI;
import models.Dog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PetsDayCareAPITest {

    @Test
    void testAddPet() {
        PetsDayCareAPI api = new PetsDayCareAPI();
        api.addPet(new Dog("Buddy", 3));
        assertEquals(1, api.numberOfPets());
    }
}
//Name:
//
//Eoin
//
//Student Number:
//
//(20117747)
//
//Chronology of Implementation
//
//I began the project by setting up the basic structure in IntelliJ IDEA using the starter code provided through GitHub Classroom. I ensured the project compiled correctly before making any changes.
//
//First, I focused on implementing the inheritance hierarchy. I created the abstract Pet class and then extended it into Mammal and Bird, both also abstract. After that, I implemented the concrete classes Dog, Cat, and Parrot, ensuring they inherited correctly and implemented any required methods.
//
//Next, I moved on to the PetsDayCareAPI class, where I implemented the core CRUD functionality using an ArrayList to store pets. I added methods to add, remove, search, and list pets. I also implemented basic reporting methods such as counting pets by type.
//
//After completing the API, I worked on the Driver class, building a simple menu-driven console interface. This allowed the user to interact with the system by selecting options such as adding pets, viewing pets, and saving/loading data.
//
//Following this, I implemented XML persistence using the ISerializer interface. This allowed the system to save and load pet data to and from a file.
//
//Finally, I wrote JUnit tests, focusing on the Bird, Parrot, and PetsDayCareAPI classes to ensure functionality was correct and to increase test coverage.
//
//Main Difficulties and Solutions
//
//One of the main difficulties I encountered was understanding and correctly implementing the inheritance hierarchy, especially with abstract classes. Initially, I was unsure where to place shared attributes and methods. I resolved this by reviewing lecture notes and ensuring that common fields were placed in the Pet class, while more specific behaviour was implemented in subclasses.
//
//Another challenge was implementing the PetsDayCareAPI, particularly managing the ArrayList and ensuring all CRUD operations worked correctly. I solved this by breaking each method into smaller steps and testing them individually.
//
//I also found XML persistence difficult at first, especially understanding how the ISerializer interface worked. I referred to similar examples from class materials and adapted them to fit my project.
//
//Finally, writing JUnit tests was challenging because I had to think carefully about test cases. I improved this by testing both normal and edge cases, such as empty lists and invalid inputs.
//
//Bugs or Unfinished Elements
//
//There may still be minor bugs in edge cases, such as handling invalid user input in the menu. While basic validation is implemented it could be improved further.
//
//Some features such as more advanced reporting or improved menu usability could also be expanded if more time was available.
//
//Main Learnings
//
//From this assignment I gained a much better understanding of:
//
//
//How to design and implement a class hierarchy
//Managing collections using ArrayLists
//Writing a menu-driven console application
//Implementing file persistence using XML
//Writing and structuring JUnit tests
//
//I also improved my ability to debug code and break problems into smaller, manageable parts.
//
//References
//Lecture notes and lab materials provided in class
//Example projects such as SocialNetwork and Shop systems
//Oracle Java Documentation (https://docs.oracle.com/javase/
//)
//IntelliJ IDEA documentation
//
//For test case generation I created my own tests based on expected program behavior and edge cases discussed in classes and notes.
//
//I also used an AI tool (ChatGPT) to:
//
//Help structure the project correctly
//Explain concepts such as inheritance and APIs
//Assist in debugging and improving code clarity
//
//All AI-assisted content was reviewed and understood before inclusion.
//
//Declaration
//
//This is my work apart from the specific references noted above (and any code from class notes). I understand the code and can describe any parts of the solution if needed.
