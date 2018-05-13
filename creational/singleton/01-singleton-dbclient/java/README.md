# Singleton

> JAVA implementation

## Usage
`javac Demo.java`

`java Demo`

## References

1. [Singleton class in JAVA](https://stackoverflow.com/questions/2111768/singleton-class-in-java)

2. [When is the static block of a class executed?](https://stackoverflow.com/questions/9130461/when-is-the-static-block-of-a-class-executed)

3. [static member methods](https://www.csee.umbc.edu/courses/undergraduate/202/spring11/lectures/static-members-methods.pdf)

    * The declaration of a static defined constant must include the modifier `final`, indicates that its value cannot be changed.

    * Static constants belong to the class as a whole, not to each object. There is only one copy of a static constant.

4. [Java static class](https://www.caveofprogramming.com/java/java-static-class-tutorial.html)

    * The static inner class acts like an entirely separate class, which just happens to be accessed via the outer class.
    * Without instantiating the inner class, we still can visit its inner static members.
    * If we want to trigger the constructor of the inner class, just create an instance.