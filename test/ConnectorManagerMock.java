public class ConnectorManagerMock extends ConnectorManager {

	public int connect() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 200;
	}

}
