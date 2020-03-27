# Exercise: Global Car Factory

Source: https://www.studocu.com/es/document/sir-syed-university-of-engineering-and-technology/engineering/practica/create-abstract-factory-design-pattern-in-java/1389729/view

## Description

First of all, we need car factories in each location specified in problem statement. i.e. USACarFactory, AsiaCarFactory and DefaultCarFactory. Now, our application should be smart enough to identify the location where is being used, so we should be able to use appropriate car factory without even knowing which car factory implementation will be used internally. This also saves us from someone calling wrong factory for a particular location.

So basically, we need another layer of abstraction which will identify the location and internally use correct car factory implementation without even giving a single hint to user. This is exactly the problem, which abstract factory pattern is used to solv