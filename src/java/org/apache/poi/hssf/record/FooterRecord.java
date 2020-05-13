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

package org.apache.poi.hssf.record;

import org.apache.poi.util.Removal;

/**
 * Specifies the footer for a sheet
 */
public final class FooterRecord extends HeaderFooterBase {
	public static final short sid = 0x0015;

	public FooterRecord(String text) {
		super(text);
	}

	public FooterRecord(FooterRecord other) {
		super(other);
	}

	public FooterRecord(RecordInputStream in) {
		super(in);
	}

	public short getSid() {
		return sid;
	}

	/**
	 * @deprecated use {@link #copy()} instead
	 */
	@Override
	@SuppressWarnings({"squid:S2975", "MethodDoesntCallSuperMethod"})
	@Deprecated
	@Removal(version = "5.0.0")
	public FooterRecord clone() {
		return copy();
	}

	@Override
	public FooterRecord copy() {
		return new FooterRecord(this);
	}

	@Override
	public HSSFRecordTypes getGenericRecordType() {
		return HSSFRecordTypes.FOOTER;
	}
}
