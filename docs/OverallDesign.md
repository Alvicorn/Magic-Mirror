# Magic Mirror Overall Design


## Part 1: Introduction

Magic Mirror is a software program designed for everyday day users as a daily use tool. 
Several tools and widgets will be available for the user to select, choose and modify the overall layout.
This tools may include:

- Display live weather
- Calendar of the user and upcoming events
- Interact with home assistant devices such as Google Home or Amazon Alexa
- Wireless pairing with external devices to play audio
- Open other web applications within the program such as Instagram and Facebook


## Part 2: Guidelines

Magic Mirror will be developed predominantly using OpenJDK 18 in Intellij IDE. The UI will be constructed
with Java Swing and the AWT (Abstract Window Toolkit) package. This project will follow the MVC
(Model, View, Control) design pattern. For locally saved data, a local webserver will be created using 
Spring Boot. 