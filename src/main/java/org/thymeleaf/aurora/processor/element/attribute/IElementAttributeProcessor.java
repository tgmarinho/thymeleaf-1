/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.aurora.processor.element.attribute;

import org.thymeleaf.aurora.engine.Attributes;
import org.thymeleaf.aurora.engine.ElementDefinition;
import org.thymeleaf.aurora.processor.AttributeName;
import org.thymeleaf.aurora.processor.IProcessor;
import org.thymeleaf.aurora.processor.ElementName;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface IElementAttributeProcessor extends IProcessor {

    public ElementName getElementName();
    public AttributeName getAttributeNames();
    public String getAttributeValue();

    public ElementAttributeProcessorResult process(
            final ElementDefinition elementDefinition, final String elementName, final Attributes attributes,
            final String attributeName, final String attributeValue, final int line, final int col);

}