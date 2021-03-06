package tw.fondus.fews.adapter.pi.senslink.v3.argument;

import com.beust.jcommander.Parameter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Model adapter arguments for data exchange with SensLink 3.0.
 * 
 * @author Brad Chen
 *
 */
@Data
@SuperBuilder
@ToString( callSuper = true )
@EqualsAndHashCode( callSuper = true )
public class RunArguments extends ExportArguments {
	@Parameter(names = { "--timeindex", "-ti" }, required = true, description = "The time index of the TimeSeriesArray index position")
	private int index;
	
	@Parameter(names = { "--duration", "-d" }, required = true, description = "The minus duration relative to the current time.")
	private int duration;

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
