package org.apache.hadoop.hbase.regionserver.storefiletracker;

import org.apache.hadoop.hbase.metrics.BaseSourceImpl;

public class MetricsStoreFileTrackerSourceImpl extends BaseSourceImpl implements MetricsStoreFileTrackerSource {

	public MetricsStoreFileTrackerSourceImpl(String metricsName, String metricsDescription, String metricsContext,
			String metricsJmxContext) {
		super(metricsName, metricsDescription, metricsContext, metricsJmxContext);
		// TODO Auto-generated constructor stub
	}

}
