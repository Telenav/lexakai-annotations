# Lexakai - Annotations &nbsp;&nbsp;![](https://kivakit.org/images/annotation-40.png)

This project contains annotations for use in code to be processed by Lexakai.

![](https://kivakit.org/images/horizontal-line.png)

### Index

[**Dependencies**](#dependencies)  
[**Summary**](#summary)  
[**Annotations**](#annotations)  
[**Class Diagrams**](#class-diagrams)  
[**Package Diagrams**](#package-diagrams)  
[**Javadoc**](#javadoc)

### Dependencies &nbsp;&nbsp; ![](https://kivakit.org/images/dependencies-40.png)

[*Dependency Diagram*](documentation/diagrams/dependencies.svg)

#### Maven Dependency

    <dependency>
        <groupId>com.telenav.lexakai</groupId>
        <artifactId>lexakai-annotations</artifactId>
        <version>0.9.3</version>
    </dependency>

![](https://kivakit.org/images/horizontal-line.png)

[//]: # (start-user-text)

### Summary <a name = "summary"></a>

This module provides annotations for creating custom UML diagrams directly from source code.  
For details, run Lexakai with no command line arguments to see the Lexakai command line help,  
or view the [Lexakai markdown documentation](https://github.com/Telenav/lexakai).

### Annotations <a name = "annotations"></a>&nbsp;&nbsp; ![](https://kivakit.org/images/tag-32.png)

#### Diagrams

* *@UmlClassDiagram* - declares the diagram(s) that the annotated type should be included in
* *@UmlMethodGroup* - includes the annotated method in a labeled method group in the diagram
* *@UmlNote* - adds a callout note to a type or method

#### Visibility

* *@UmlExcludeSuperTypes* - excludes the listed supertypes from all diagrams
* *@UmlExcludeMember* - excludes the annotated member
* *@UmlIncludeMember* - includes the annotated member, even if it wouldn't normally be included
* *@UmlNotPublicApi* - marks the annotated type or member as private even if it is not

#### Associations

* *@UmlRelation* - adds a labeled UML relation from the enclosing type to the annotated member type
* *@UmlAggregation* - adds a UML aggregation association from the enclosing type to the annotated field type
* *@UmlComposition* - adds a UML composition association from the enclosing type to the annotated field type

[//]: # (end-user-text)

### Class Diagrams &nbsp; &nbsp;![](https://kivakit.org/images/diagram-48.png)

None

### Package Diagrams &nbsp;&nbsp;![](https://kivakit.org/images/box-40.png)

[*com.telenav.lexakai.annotations*](documentation/diagrams/com.telenav.lexakai.annotations.svg)  
[*com.telenav.lexakai.annotations.associations*](documentation/diagrams/com.telenav.lexakai.annotations.associations.svg)  
[*com.telenav.lexakai.annotations.diagrams*](documentation/diagrams/com.telenav.lexakai.annotations.diagrams.svg)  
[*com.telenav.lexakai.annotations.repeaters*](documentation/diagrams/com.telenav.lexakai.annotations.repeaters.svg)  
[*com.telenav.lexakai.annotations.visibility*](documentation/diagrams/com.telenav.lexakai.annotations.visibility.svg)  

### Javadoc &nbsp;&nbsp;![](https://kivakit.org/images/books-40.png)

Javadoc coverage for this project is 100.0%.  
  
&nbsp; &nbsp;  ![](https://kivakit.org/images/meter-100-12.png).



| Class | Documentation Sections |
|---|---|
| [*AllDiagrams*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/diagrams/AllDiagrams.html) |  |  
| [*LexakaiJavadoc*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/LexakaiJavadoc.html) |  |  
| [*UmlAggregation*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/associations/UmlAggregation.html) |  |  
| [*UmlClassDiagram*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/UmlClassDiagram.html) | Inclusion and Exclusion |  
| | Automatic Method Groups |  
| | Explicit Relations |  
| | Diagram Name |  
| [*UmlComposition*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/associations/UmlComposition.html) |  |  
| [*UmlDiagramIdentifier*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/diagrams/UmlDiagramIdentifier.html) |  |  
| [*UmlDiagramRepeater*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/repeaters/UmlDiagramRepeater.html) |  |  
| [*UmlExcludeMember*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlExcludeMember.html) |  |  
| [*UmlExcludeSuperTypes*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlExcludeSuperTypes.html) |  |  
| [*UmlIncludeMember*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlIncludeMember.html) |  |  
| [*UmlMethodGroup*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/UmlMethodGroup.html) |  |  
| [*UmlMethodGroupRepeater*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/repeaters/UmlMethodGroupRepeater.html) |  |  
| [*UmlNotPublicApi*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlNotPublicApi.html) |  |  
| [*UmlNote*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/UmlNote.html) |  |  
| [*UmlNote.Align*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/UmlNote.Align.html) |  |  
| [*UmlRelation*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/associations/UmlRelation.html) |  |  
| [*UmlRelationRepeater*](https://telenav.github.io/lexakai-annotations/javadoc/lexakai.annotations/com/telenav/lexakai/annotations/repeaters/UmlRelationRepeater.html) |  |  

[//]: # (start-user-text)



[//]: # (end-user-text)

<br/>

![](https://kivakit.org/images/horizontal-line.png)

<sub>Copyright &#169; 2011-2021 [Telenav](http://telenav.com), Inc. Distributed under [Apache License, Version 2.0](LICENSE)</sub>  
<sub>This documentation was generated by [Lexakai](https://github.com/Telenav/lexakai) on 2021.04.09. UML diagrams courtesy
of [PlantUML](http://plantuml.com).</sub>

