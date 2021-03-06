package tw.fondus.fews.adapter.pi.runoff.nchc.argument;

import com.beust.jcommander.Parameter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tw.fondus.fews.adapter.pi.argument.PiBasicArguments;
import tw.fondus.fews.adapter.pi.argument.PiIOArguments;

/**
 * Model executable-adapter arguments for running NCHC RR model.
 * 
 * @author Brad Chen
 *
 */
@Data
@SuperBuilder
@ToString( callSuper = true )
@EqualsAndHashCode( callSuper = true )
public class RunArguments extends PiIOArguments {
	@Parameter(names = { "--pdir", "-pd" }, required = true, description = "The model parameters directory, relative to the current working directory.")
	private String parametersPath;
	
	@Parameter(names = { "--edir", "-ed" }, required = true, description = "The model executable directory path, relative to the current working directory.")
	private String executablePath;
	
	@Parameter(names = { "--executable", "-e" }, required = true, description = "The model executable.")
	private String executable;

	/**
	 * Create the argument instance.
	 *
	 * @return argument instance
	 * @since 3.0.0
	 */
	public static RunArguments instance(){
		return RunArguments.builder().build();
	}
}
