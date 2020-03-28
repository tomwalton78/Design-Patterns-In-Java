# Exercise: Database Connection

Source: https://refactoring.guru/design-patterns/singleton

## Description

In this example, the database connection class acts as a Singleton. This class doesn’t have a public constructor, so the only way to get its object is to call the getInstance method. This method caches the first created object and returns it in all subsequent calls.