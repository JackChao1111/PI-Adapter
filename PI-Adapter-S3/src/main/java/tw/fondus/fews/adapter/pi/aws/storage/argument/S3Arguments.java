package tw.fondus.fews.adapter.pi.aws.storage.argument;

import com.beust.jcommander.Parameter;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import tw.fondus.fews.adapter.pi.argument.PiIOArguments;

/**
 * Model adapter arguments for data exchange with S3 REST API.
 *
 * @author Brad Chen
 *
 */
@Data
@SuperBuilder
@ToString( callSuper = true )
@EqualsAndHashCode( callSuper = true )
public class S3Arguments extends PiIOArguments {
	@Parameter( names = { "--host", "-host" }, required = true, description = "The S3 host URL." )
	private String host;

	@Parameter( names = { "--bucket" }, required = true, description = "The storage bucket." )
	private String bucket;

	@Parameter( names = { "--object" }, required = true, description = "The storage object." )
	private String object;

	@Parameter( names = { "--username", "-us" }, required = true, description = "The account username." )
	private String username;

	@Parameter( names = { "--password", "-pw" }, required = true, description = "The account password." )
	private String password;

	@Builder.Default
	@Parameter( names = { "--bucket-create" }, description = "Should create storage bucket or not." )
	private boolean create = false;

	/**
	 * Create the argument instance.
	 *
	 * @return argument instance
	 */
	public static S3Arguments instance(){
		return S3Arguments.builder().build();
	}
}