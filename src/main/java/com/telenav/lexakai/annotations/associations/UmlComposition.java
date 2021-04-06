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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jonathanl (shibo)
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface UmlComposition
{
    /**
     * @return Any diagram that this annotation is specific to, or all diagrams if omitted
     */
    Class<? extends UmlDiagramIdentifier> diagram() default AllDiagrams.class;

    /**
     * @return The association label
     */
    String label() default "";

    /**
     * @return The cardinality of the "from" end of the relation
     */
    String refereeCardinality() default "";

    /**
     * @return An optional explicit type to refer to, if one cannot be deduced from the annotated field
     */
    Class<?> referent() default Void.class;

    /**
     * @return The cardinality of the "to" end of the relation
     */
    String referentCardinality() default "";
}
