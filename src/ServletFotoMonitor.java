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

	public boolean doRequest(String url, byte[] post) {
		this.connector.setUrl(url);
		this.connector.setPost(post);
		return connector.connect() == 200;
	}
}
