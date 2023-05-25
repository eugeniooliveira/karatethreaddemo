Feature: PolyglotMap thread error and fix

  Scenario Outline: Create new map -> <createNewMap>
    * json map = {a: "b", c: "d"}
    * def ClassThatCreatesThread = Java.type('karate.ClassThatCreatesThread')
    * def instance = new ClassThatCreatesThread(map, <createNewMap>)
    * def mapValue = instance.readMap()
    * print mapValue
    * match 1 == 1
    Examples:
      | createNewMap |
      | false        |
      | true         |