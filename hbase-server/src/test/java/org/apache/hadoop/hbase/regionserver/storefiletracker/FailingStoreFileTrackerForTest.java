/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hbase.regionserver.storefiletracker;

import java.io.IOException;
import java.util.List;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.regionserver.StoreContext;
import org.apache.hadoop.hbase.regionserver.StoreFileInfo;
import org.apache.hadoop.hbase.regionserver.TestStoreFileRefresherChore.FailingHRegionFileSystem;

public class FailingStoreFileTrackerForTest extends DefaultStoreFileTracker {

  FailingStoreFileTrackerForTest(Configuration conf, boolean isPrimaryReplica, StoreContext ctx) {
    super(conf, isPrimaryReplica, ctx);
  }

  @Override
  protected List<StoreFileInfo> doLoadStoreFiles(boolean readOnly) throws IOException {
    if (ctx.getRegionFileSystem() instanceof FailingHRegionFileSystem) {
      if (((FailingHRegionFileSystem) ctx.getRegionFileSystem()).fail) {
        throw new IOException("simulating FS failure");
      }
    }
    return super.doLoadStoreFiles(readOnly);
  }
}
