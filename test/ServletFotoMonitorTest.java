import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ServletFotoMonitorTest {
	private ServletFotoMonitor monitor;

	private ConnectorManagerMock connectorManager;

	@Before
	public void setUp() {
		this.connectorManager = new ConnectorManagerMock();
		monitor = new ServletFotoMonitor(connectorManager);
	}

	@Test
	public void shouldReturnResponseTime() {
		long time = monitor.verifyRequestTime() / 1000;
		assertEquals("The time should return 3 seconds, as response time.", 3, time);
	}

	@Test
	public void shouldPerformServletFotoRequest() {
		assertTrue(monitor.doRequest("http://www.google.com", new byte[1024]));
	}
}
