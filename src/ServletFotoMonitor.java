public class ServletFotoMonitor {

	private ConnectorManager connector;

	public ServletFotoMonitor(ConnectorManager connectorManager) {
		this.connector = connectorManager;
	}

	public long verifyRequestTime() {
		long t0 = System.currentTimeMillis();

		this.connector.connect();

		return System.currentTimeMillis() - t0;
	}
}
