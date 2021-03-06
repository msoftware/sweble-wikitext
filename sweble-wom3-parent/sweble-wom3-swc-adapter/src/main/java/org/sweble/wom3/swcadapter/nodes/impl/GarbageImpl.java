/**
 * Copyright 2011 The Open Source Research Group,
 *                University of Erlangen-Nürnberg
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */
package org.sweble.wom3.swcadapter.nodes.impl;

import org.sweble.wom3.impl.AttributeDescriptor;
import org.sweble.wom3.impl.DocumentImpl;
import org.sweble.wom3.swcadapter.nodes.SwcGarbage;

public class GarbageImpl
		extends
			BackboneSwcContainer
		implements
			SwcGarbage
{
	private static final long serialVersionUID = 1L;

	// =========================================================================

	public GarbageImpl(DocumentImpl owner)
	{
		super(owner);
	}

	// =========================================================================

	@Override
	public String getSwcName()
	{
		return "garbage";
	}

	@Override
	protected AttributeDescriptor getAttributeDescriptor(
			String namespaceUri,
			String localName,
			String qualifiedName)
	{
		return getAttrDescStrict(namespaceUri, localName, qualifiedName);
	}
}
