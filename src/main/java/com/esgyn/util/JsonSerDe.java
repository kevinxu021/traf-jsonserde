/*======================================================================*
 * Copyright (c) 2011, OpenX Technologies, Inc. All rights reserved.    *
 *                                                                      *
 * Licensed under the New BSD License (the "License"); you may not use  *
 * this file except in compliance with the License. Unless required     *
 * by applicable law or agreed to in writing, software distributed      *
 * under the License is distributed on an "AS IS" BASIS, WITHOUT        *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.     *
 * See the License for the specific language governing permissions and  *
 * limitations under the License. See accompanying LICENSE file.        *
 *======================================================================*/

package com.esgyn.util;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.serde2.AbstractSerDe;
import org.apache.hadoop.hive.serde2.SerDeException;
import org.apache.hadoop.hive.serde2.SerDeStats;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.io.Writable;

/**
 * @author kaihua.xu
 *
 */
public class JsonSerDe extends AbstractSerDe {

	public static final Log LOG = LogFactory.getLog(JsonSerDe.class);

	@Override
	public void initialize(Configuration conf, Properties tbl) throws SerDeException {
	}

	@Override
	public Class<? extends Writable> getSerializedClass() {
		return null;
	}

	@Override
	public Writable serialize(Object obj, ObjectInspector objInspector) throws SerDeException {
		return null;
	}

	@Override
	public SerDeStats getSerDeStats() {
		return null;
	}

	@Override
	public Object deserialize(Writable blob) throws SerDeException {
		return null;
	}

	@Override
	public ObjectInspector getObjectInspector() throws SerDeException {
		return null;
	}

}
