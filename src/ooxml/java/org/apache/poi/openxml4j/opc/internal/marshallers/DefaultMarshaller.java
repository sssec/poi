/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.openxml4j.opc.internal.marshallers;

import java.io.OutputStream;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.internal.PartMarshaller;

/**
 * Default marshaller that specified that the part is responsible to marshall its content.
 *
 * @author Julien Chable
 * @version 1.0
 * @see PartMarshaller
 */
public final class DefaultMarshaller implements PartMarshaller {

	/**
	 * Save the given part in the output stream by using the save() method of the part.
	 *
	 * @param part The {@link PackagePart} to store.
	 * @param out Output stream to save this part.
	 * @return true if the content has been successfully stored, false otherwise.
	 *         More information about errors may be logged via {@link org.apache.poi.util.POILogger}
	 * @throws OpenXML4JException
	 *             If any error occur.
	 */
	public boolean marshall(PackagePart part, OutputStream out)
			throws OpenXML4JException {
		return part.save(out);
	}
}
