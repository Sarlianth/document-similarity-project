# A JEE Application for Measuring Document Similarity

This assignment will constitute 50% of the total marks for this module.

## Overview
You are required to develop a Java web application that enables two or more text documents to
be compared for similarity. An overview of the system is given below:

![1](https://user-images.githubusercontent.com/10263556/34650667-c82ce04a-f3bc-11e7-91d7-1e0b969c3d9e.jpg)

## Minimum Requirements
Your implementation should include the following features:
**1.** A document or URL should be specified or selected from a web browser and then dispatched to a servlet instance running under Apache Tomcat.
**2.** Each submitted document should be parsed into its set of constituent shingles and then compared against the existing document(s) in an object-oriented database (db4O) and then stored in the database.
**3.** The similarity of the submitted document to the set of documents stored in the database should be returned and presented to the session user. You are also required to provide a UML diagram of your design and to JavaDoc your code. Note that the whole point of this assignment is for you to demonstrate an understanding of the principles of object-oriented design by using abstraction, encapsulation, composition, inheritance and polymorphism WELL throughout the application. You should carefully consider how design patterns can be applied throughout your design. For example, patterns such as façade, chain of responsibility, command and proxy have obvious applications as mechanisms for handling incoming HTTP requests. Please pay particular attention to how your application must be packaged and submitted. Marks will be deducted if you deviate from the requirements. Finally, as 4th year software students, you should appreciate that, if your code does not compile you cannot pass the assignment..
