package tw.fondus.fews.adapter.pi.example.argument;

import com.beust.jcommander.Parameter;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tw.fondus.fews.adapter.pi.argument.PiIOArguments;

/**
 * The Model executable-adapter arguments for running Example model.
 * 
 * @author Brad Chen
 *
 */
@Data
@EqualsAndHashCode( callSuper = false )
public class ExecutableArguments extends PiIOArguments {
	@Parameter( names = { "--executable", "-e" }, required = true, description = "The model executable.")
	private String executable;
}