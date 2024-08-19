README
========
# Inroduction
Deisgn Principles are listed from reading the book - `Head
First Design Patterns`.

# Design Principles

## Identify the aspects of your application that vary and seperate them from what stays the same.  
   
- This implies `encapsulate` that varies so that the varying
  part does not affect the rest of the code. 
- The outcome of this principle is that there are fewer
  unintended consequences from code changes and more
  flexibility in the systems built.
- Every pattern is an extension of this idea - to let some
  part of the system vary independently of all other parts.
- Therefore, seperate what changes and what stays the same.
     
## Program to an interface (not java interface) and not to an implementation.  
- Program to a supertype so that the actual runtime object
  is not locked into the code.  
- The declared type of the variable should be a supertype --
  an abstract class or interface in Java -- so that the
  objects assigned to those variables can be of any concrete
  implementation of the supertype.  
- This means the class declaring the supertype need not know
  the actual object type.  

## Prefer `<has a>` over `<is a>`
- Favor composition over inheritance  
- Composition provides more flexibility over inheritance  
- Composition lets encapsulate a family of algorithms into a
  set of classes.  
- Composition lets change behaviour at runtime, provided the
  objects being composed implement the correct behavior
  interface.  

## The power of loose coupling
- When two objects are loosely coupled, they can interect
  but have very little knowledge of each other.  
- 
