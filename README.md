
[//]: # (start-user-text)

<a href="https://www.lexakai.org">
<img src="https://www.lexakai.org/images/web-32.png" srcset="https://www.lexakai.org/images/web-32-2x.png 2x"/>
</a>
&nbsp;
<a href="https://twitter.com/openlexakai">
<img src="https://www.lexakai.org/images/twitter-32.png" srcset="https://www.lexakai.org/images/twitter-32-2x.png 2x"/>
</a>
&nbsp;
<a href="https://lexakai.zulipchat.com">
<img src="https://www.lexakai.org/images/zulip-32.png" srcset="https://www.lexakai.org/images/zulip-32-2x.png 2x"/>
</a>

<p></p>

<img src="https://www.lexakai.org/images/lexakai-backgroung-1024.png" srcset="https://www.lexakai.org/images/lexakai-background-1024-2x.png 2x"/>

[//]: # (end-user-text)

# Lexakai - Annotations &nbsp;&nbsp; <img src="https://www.kivakit.org/images/annotation-32.png" srcset="https://www.kivakit.org/images/annotation-32-2x.png 2x"/>

This project contains annotations for use in code to be processed by Lexakai.

<img src="https://www.kivakit.org/images/horizontal-line-512.png" srcset="https://www.kivakit.org/images/horizontal-line-512-2x.png 2x"/>

### Index

[**Summary**](#summary)  
[**Annotations**](#annotations)  

[**Dependencies**](#dependencies) | [**Class Diagrams**](#class-diagrams) | [**Package Diagrams**](#package-diagrams) | [**Javadoc**](#javadoc)

<img src="https://www.kivakit.org/images/horizontal-line-512.png" srcset="https://www.kivakit.org/images/horizontal-line-512-2x.png 2x"/>

### Dependencies <a name="dependencies"></a> &nbsp;&nbsp; <img src="https://www.kivakit.org/images/dependencies-32.png" srcset="https://www.kivakit.org/images/dependencies-32-2x.png 2x"/>

[*Dependency Diagram*](https://www.lexakai.org/lexakai/lexakai-annotations/documentation/diagrams/dependencies.svg)

#### Maven Dependency

    <dependency>
        <groupId>com.telenav.lexakai</groupId>
        <artifactId>lexakai-annotations</artifactId>
        <version>0.9.4</version>
    </dependency>


<img src="https://www.kivakit.org/images/horizontal-line-128.png" srcset="https://www.kivakit.org/images/horizontal-line-128-2x.png 2x"/>

[//]: # (start-user-text)

### Summary <a name = "summary"></a>

This module provides annotations for creating custom UML diagrams directly from source code.
For details, run Lexakai with no command line arguments to see the Lexakai command line help,
or view the [Lexakai markdown documentation](https://github.com/Telenav/lexakai).

<img src="https://www.kivakit.org/images/horizontal-line-128.png" srcset="https://www.kivakit.org/images/horizontal-line-128-2x.png 2x"/>

### Annotations <a name = "annotations"></a>&nbsp;&nbsp; <img src="https://www.kivakit.org/images/tag-32.png" srcset="https://www.kivakit.org/images/tag-32-2x.png 2x"/>

    Diagrams:

           @UmlClassDiagram - declares the diagram(s) that the annotated type should be included in
            @UmlMethodGroup - includes the annotated method in a labeled method group in the diagram
                   @UmlNote - adds a callout note to a type or method

    Visibility:

      @UmlExcludeSuperTypes - excludes the listed supertypes from all diagrams
          @UmlExcludeMember - excludes the annotated member
          @UmlIncludeMember - includes the annotated member, even if it wouldn't normally be included
           @UmlNotPublicApi - marks the annotated type or member as private even if it is not

    Associations:

               @UmlRelation - adds a labeled UML relation from the enclosing type to the annotated member type
            @UmlAggregation - adds a UML aggregation association from the enclosing type to the annotated field type
            @UmlComposition - adds a UML composition association from the enclosing type to the annotated field type

[//]: # (end-user-text)

<img src="https://www.kivakit.org/images/horizontal-line-128.png" srcset="https://www.kivakit.org/images/horizontal-line-128-2x.png 2x"/>

### Class Diagrams <a name="class-diagrams"></a> &nbsp; &nbsp; <img src="https://www.kivakit.org/images/diagram-40.png" srcset="https://www.kivakit.org/images/diagram-40-2x.png 2x"/>

None

<img src="https://www.kivakit.org/images/horizontal-line-128.png" srcset="https://www.kivakit.org/images/horizontal-line-128-2x.png 2x"/>

### Package Diagrams <a name="package-diagrams"></a> &nbsp;&nbsp; <img src="https://www.kivakit.org/images/box-32.png" srcset="https://www.kivakit.org/images/box-32-2x.png 2x"/>

[*com.telenav.lexakai.annotations*](https://www.lexakai.org/lexakai/lexakai-annotations/documentation/diagrams/com.telenav.lexakai.annotations.svg)  
[*com.telenav.lexakai.annotations.associations*](https://www.lexakai.org/lexakai/lexakai-annotations/documentation/diagrams/com.telenav.lexakai.annotations.associations.svg)  
[*com.telenav.lexakai.annotations.diagrams*](https://www.lexakai.org/lexakai/lexakai-annotations/documentation/diagrams/com.telenav.lexakai.annotations.diagrams.svg)  
[*com.telenav.lexakai.annotations.repeaters*](https://www.lexakai.org/lexakai/lexakai-annotations/documentation/diagrams/com.telenav.lexakai.annotations.repeaters.svg)  
[*com.telenav.lexakai.annotations.visibility*](https://www.lexakai.org/lexakai/lexakai-annotations/documentation/diagrams/com.telenav.lexakai.annotations.visibility.svg)

<img src="https://www.kivakit.org/images/horizontal-line-128.png" srcset="https://www.kivakit.org/images/horizontal-line-128-2x.png 2x"/>

### Javadoc <a name="javadoc"></a> &nbsp;&nbsp; <img src="https://www.kivakit.org/images/books-32.png" srcset="https://www.kivakit.org/images/books-32-2x.png 2x"/>

Javadoc coverage for this project is 100.0%.  
  
&nbsp; &nbsp; <img src="https://www.kivakit.org/images/meter-100-96.png" srcset="https://www.kivakit.org/images/meter-100-96-2x.png 2x"/>




| Class | Documentation Sections |
|---|---|
| [*AllDiagrams*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/diagrams/AllDiagrams.html) |  |  
| [*LexakaiJavadoc*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/LexakaiJavadoc.html) |  |  
| [*UmlAggregation*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/associations/UmlAggregation.html) |  |  
| [*UmlClassDiagram*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/UmlClassDiagram.html) | Inclusion and Exclusion |  
| | Automatic Method Groups |  
| | Explicit Relations |  
| | Diagram Name |  
| [*UmlComposition*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/associations/UmlComposition.html) |  |  
| [*UmlDiagramIdentifier*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/diagrams/UmlDiagramIdentifier.html) |  |  
| [*UmlDiagramRepeater*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/repeaters/UmlDiagramRepeater.html) |  |  
| [*UmlExcludeMember*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlExcludeMember.html) |  |  
| [*UmlExcludeSuperTypes*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlExcludeSuperTypes.html) |  |  
| [*UmlIncludeMember*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlIncludeMember.html) |  |  
| [*UmlMethodGroup*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/UmlMethodGroup.html) |  |  
| [*UmlMethodGroupRepeater*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/repeaters/UmlMethodGroupRepeater.html) |  |  
| [*UmlNotPublicApi*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/visibility/UmlNotPublicApi.html) |  |  
| [*UmlNote*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/UmlNote.html) |  |  
| [*UmlNote.Align*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/UmlNote.Align.html) |  |  
| [*UmlRelation*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/associations/UmlRelation.html) |  |  
| [*UmlRelationRepeater*](https://www.lexakai.org/javadoc/lexakai-annotations/lexakai.annotations/com/telenav/lexakai/annotations/repeaters/UmlRelationRepeater.html) |  |  

[//]: # (start-user-text)



[//]: # (end-user-text)

<img src="https://www.kivakit.org/images/horizontal-line-512.png" srcset="https://www.kivakit.org/images/horizontal-line-512-2x.png 2x"/>

<sub>Copyright &#169; 2011-2021 [Telenav](http://telenav.com), Inc. Distributed under [Apache License, Version 2.0](LICENSE)</sub>  
<sub>This documentation was generated by [Lexakai](https://github.com/Telenav/lexakai). UML diagrams courtesy
of [PlantUML](http://plantuml.com).</sub>

