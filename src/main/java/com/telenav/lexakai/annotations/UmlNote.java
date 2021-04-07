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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adds a callout note to the annotated class, interface or method. The text for the note is provided with {@link
 * #text()} and may include simple HTML tags per the PlantUML specification. The {@link #align()} method provides any
 * alignment for the callout. By default, notes are right-aligned.
 *
 * @author jonathanl (shibo)
 * @see <a href="https://telenav.github.io/lexakai/">Lexakai documentation</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface UmlNote
{
    /**
     * Specifies alignment of this UML note. Alignment refers to the note's placement relative to the type or method.
     *
     * @author jonathanl (shibo)
     */
    enum Align
    {
        TOP,
        LEFT,
        BOTTOM,
        RIGHT
    }

    Align align() default Align.RIGHT;

    String text();
}
