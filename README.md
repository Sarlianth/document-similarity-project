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

## Technologies
#### Java
**Java** is a programming language and computing platform first released by Sun Microsystems in 1995. There are lots of applications and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!

#### Db40
**db4o** (database for objects) was an embeddable open source object database for Java and .NET developers. It was developed, commercially licensed and supported by Actian. In October 2014, Actian declined to continue to actively pursue and promote the commercial db4o product offering for new customers.

#### Tomcat
The **Apache Tomcat®** software is an open source implementation of the Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket technologies. The Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket specifications are developed under the Java Community Process.

#### Eclipse
**Eclipse** is an integrated development environment (IDE) used in computer programming, and is the most widely used Java IDE. It contains a base workspace and an extensible plug-in system for customizing the environment. Eclipse is written mostly in Java and its primary use is for developing Java applications, but it may also be used to develop applications in other programming languages via plug-ins, including Ada, ABAP, C, C++, C#, COBOL, D, Fortran, Haskell, JavaScript, Julia, Lasso, Lua, NATURAL, Perl, PHP, Prolog, Python, R, Ruby (including Ruby on Rails framework), Rust, Scala, Clojure, Groovy, Scheme, and Erlang. It can also be used to develop documents with LaTeX (via a TeXlipse plug-in) and packages for the software Mathematica. Development environments include the Eclipse Java development tools (JDT) for Java and Scala, Eclipse CDT for C/C++, and Eclipse PDT for PHP, among others.

## UML Design
![UML](https://github.com/Sarlianth/document-similarity-project/blob/master/UML.jpg)

## References
* https://www.java.com/en/download/faq/whatis_java.xml
* https://en.wikipedia.org/wiki/Db4o
* https://en.wikipedia.org/wiki/Eclipse_(software)
* http://tomcat.apache.org/
* https://www.programcreek.com/java-api-examples/index.php?source_dir=StatusParser-master/com/statusParser/Shingle.java
* https://www.programcreek.com/java-api-examples/index.php?source_dir=libsim-master/java/libsim/src/main/java/com/simmachines/libsim/enc/string/Jaccard.java
* http://shirleyisnotageek.blogspot.ie/2015/03/min-hash.html
