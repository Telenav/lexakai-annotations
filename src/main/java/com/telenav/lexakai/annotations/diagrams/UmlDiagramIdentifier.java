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

package com.telenav.lexakai.annotations.diagrams;

import com.telenav.lexakai.annotations.UmlClassDiagram;

/**
 * This interface is used as a base interface for diagram identifiers used by {@link UmlClassDiagram#diagram()}. Diagram
 * identifiers are normally placed in a package called *project.lexakai.diagrams* so they are easy to find and they
 * should start with the word "Diagram". For example:
 *
 * <pre>
 * public class DiagramMyApplication implements UmlDiagramIdentifier
 * {
 * }
 *
 * [...]
 *
 * @UmlClassDiagram(diagram = DiagramMyApplication.class)
 * public class MyApplication
 * {
 *     [...]
 * }
 * </pre>
 *
 * @author jonathanl (shibo)
 */
public interface UmlDiagramIdentifier
{
}
