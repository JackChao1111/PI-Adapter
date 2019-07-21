package tw.fondus.fews.adapter.pi.runoff.nchc.msfrm;

import tw.fondus.fews.adapter.pi.runoff.nchc.argument.RunArguments;

/**
 * Unit test of Model executable-adapter for running NCHC MSFRM model.
 * 
 * @author Brad Chen
 *
 */
public class MSFRMExecutableAdapterTest {

//	@Test
	public void test() {
		String[] args = new String[]{
				"-b",
				"src/test/resources/MSFRM",
				"-i",
				"INPUT_DATA_RAIN_EV.TXT,INPUT_EST_FLOW_MSFRM.TXT",
				"-o",
				"OUTPUT_EST_FLOW_MSFRM.TXT",
				"-e",
				"pro_est_flow_msfrm.exe",
				"-ed",
				"Work/",
				"-pd",
				"Parameters/"
				};
		
		RunArguments arguments = new RunArguments();
		new MSFRMExecutable().execute(args, arguments);
	}
	
}
