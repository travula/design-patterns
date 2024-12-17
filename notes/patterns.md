Patterns
========

# Inroduction
Patterns in succint are listed here.  These jottings are from
reading the book - `Head First Design Patterns`.

# Strategy Pattern
- Defines a set of algorightms
- Encapsulates each behavior or algorithm and makes them
  interchangeable.
- The pattern lets the behavior or the algorithm vary
  independently from the clients that use it.
- When is it used? 
  1. When inheritance is not the answer, that all the
     subclasses do not have the same behaviour that is
     supposed to be inherited.
  2. When interfaces are also not the solution. When there
     is a deluge of subclasses, by making implementation for
     all the subclasses, code reuse is lost.
     
 - [Reference Implementation](../src/com/dp/sp/DuckSimulator.java)
     
- The strategy is to use delegation.  Different behaviours
  are implemented and either during constructing an object
  or during the lifetime of a certain object, a certain
  behaviour is absorbed into the object by delegating the
  expression of the required beviour by creating an object
  the implemented behaviour.

# Observer Pattern
- In this pattern, the state is owned by the subject
  (Observable) and there are multiple observers that are
  intersted in this state.  
- Any observer that is interested in the state of the
  `Subject` registers to be notified of the state.  This is
  done by providing the notification mechanism to be used by
  the `Subject`.
- Whenever the state changes, all the registered observers
  are notified of the state change using each observer's
  notification mechanism.
- Apart from the interfaces to register, deregister and
  notify, an prior understanding between Observable and
  Observer is necessary with respect to the definition of
  the state. The `notify` interface depends on the
  definition of the state - what needs to be notified.
  

