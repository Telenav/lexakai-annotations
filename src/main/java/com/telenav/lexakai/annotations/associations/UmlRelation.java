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

package com.telenav.lexakai.annotations.associations;

import com.telenav.lexakai.annotations.diagrams.AllDiagrams;
import com.telenav.lexakai.annotations.diagrams.UmlDiagramIdentifier;
import com.telenav.lexakai.annotations.repeaters.UmlRelationRepeater;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to indicate that the annotated type, field or method has a relation with the type specified
 * by {@link #referent()}. The relation can be labeled by providing a value for {@link #label()}. The cardinality of the
 * referee (the annotated type or enclosing type) may be specified with {@link #refereeCardinality()} and the
 * cardinality of the referent can be specified with {@link #referentCardinality()}. The relation is displayed in all
 * UML diagrams, unless a diagram is specified with {@link #diagram()}.
 *
 * @author jonathanl (shibo)
 * @see <a href="https://telenav.github.io/lexakai/">Lexakai documentation</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(UmlRelationRepeater.class)
@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
public @interface UmlRelation
{
    /**
     * @return Any diagram that this annotation is specific to, or all diagrams if omitted
     */
    Class<? extends UmlDiagramIdentifier> diagram() default AllDiagrams.class;

    /**
     * @return The relation association label
     */
    String label();

    /**
     * @return The cardinality of the "from" end of the relation
     */
    String refereeCardinality() default "";

    /**
     * @return An optional explicit type to refer to, if one cannot be deduced from element this annotation is applied
     * to. For fields and methods, this value is generally not necessary as the member type will be used.
     */
    Class<?> referent() default Void.class;

    /**
     * @return The cardinality of the "to" end of the relation
     */
    String referentCardinality() default "";
}
