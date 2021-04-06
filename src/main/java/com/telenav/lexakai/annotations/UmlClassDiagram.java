////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// © 2011-2021 Telenav, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.telenav.lexakai.annotations;

import com.telenav.lexakai.annotations.associations.UmlRelation;
import com.telenav.lexakai.annotations.diagrams.UmlDiagramIdentifier;
import com.telenav.lexakai.annotations.repeaters.UmlDiagramRepeater;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated type should be included in a diagram with the given name
 *
 * @author jonathanl (shibo)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Repeatable(UmlDiagramRepeater.class)
public @interface UmlClassDiagram
{
    /**
     * @return True if methods should be grouped automatically based on guesses about method names
     */
    boolean automaticMethodGroups() default true;

    /**
     * @return The name of this diagram
     */
    Class<? extends UmlDiagramIdentifier> diagram();

    /**
     * Documentation sections for the annotated type (used in updating the README.md index)
     */
    String[] documentationSections() default {};

    /**
     * @return Super types to exclude from inheritance in this diagram only
     */
    boolean excludeAllSuperTypes() default false;

    /**
     * @return Super types to exclude from inheritance in this diagram only
     */
    Class<?>[] excludeSuperTypes() default {};

    /**
     * @return True if this type should show no members in this diagram
     */
    boolean includeMembers() default true;

    /**
     * @return True if @Override methods from the annotated type should be included
     */
    boolean includeOverrides() default false;

    /**
     * @return True if protected methods from the annotated type should be included in this diagram
     */
    boolean includeProtectedMethods() default true;

    /**
     * @return Explicit UML relations for this diagram only
     */
    UmlRelation[] relations() default {};
}
