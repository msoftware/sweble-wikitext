/**
 * Copyright 2011 The Open Source Research Group,
 *                University of Erlangen-Nürnberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sweble.wikitext.engine.ext;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.sweble.wikitext.engine.ExpansionFrame;
import org.sweble.wikitext.engine.ParserFunctionBase;
import org.sweble.wikitext.lazy.preprocessor.Template;

import de.fau.cs.osr.ptk.common.ast.AstNode;
import de.fau.cs.osr.ptk.common.ast.Text;

public class ParserFunctionFullPagenamee
		extends
			ParserFunctionBase
{
	private static final long serialVersionUID = 1L;
	
	public ParserFunctionFullPagenamee()
	{
		super("FULLPAGENAMEE");
	}
	
	@Override
	public AstNode invoke(
			Template template,
			ExpansionFrame preprocessorFrame,
			List<? extends AstNode> args)
	{
		String link = preprocessorFrame.getRootFrame().getTitle().getLinkString();
		try
		{
			return new Text(URLEncoder.encode(link, "UTF-8"));
		}
		catch (UnsupportedEncodingException e)
		{
			return template;
		}
	}
}