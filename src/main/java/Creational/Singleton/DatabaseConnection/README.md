# Exercise: Shapes

Source: https://refactoring.guru/design-patterns/prototype

## Description

In this example, the Prototype pattern lets you produce exact copies of geometric objects, without coupling the code to their classes.

All shape classes follow the same interface, which provides a cloning method. A subclass may call the parent’s cloning method before copying its own field values to the resulting object.