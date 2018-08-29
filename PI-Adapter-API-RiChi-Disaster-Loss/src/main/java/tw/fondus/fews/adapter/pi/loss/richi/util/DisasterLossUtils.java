package tw.fondus.fews.adapter.pi.loss.richi.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import nl.wldelft.util.FileUtils;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import strman.Strman;
import tw.fondus.commons.fews.pi.config.xml.mapstacks.MapStacks;
import tw.fondus.commons.fews.pi.config.xml.util.XMLUtils;
import tw.fondus.commons.util.file.FileType;
import tw.fondus.commons.util.http.HttpClient;
import tw.fondus.commons.util.http.HttpUtils;
import tw.fondus.commons.util.string.StringUtils;
import tw.fondus.commons.util.time.TimeUtils;

/**
 * The utils of Disaster Loss Adapter.
 * 
 * @author Chao
 *
 */
public class DisasterLossUtils {
	public static final String URL = "localhost";
	public static final String EVENT = "event";
	public static final String KEY = "file";
	
	/**
	 * 
	 * 
	 * @param path
	 * @param inputDir
	 * @throws IOException
	 */
	/**
	 * Rename file extension when if not a asc file extension.
	 * 
	 * @param path
	 * @param inputDir
	 * @return
	 * @throws IOException
	 */
	public static Path renameToASC( Path path, File inputDir ) throws IOException{
		File file = path.toFile();
		if ( !FileUtils.getFileExt( file ).equals( FileType.ASC.getType() ) ){
			String fileName = FileUtils.getNameWithoutExt( file );
			
			Path newPath = Paths.get( Strman.append( inputDir.getPath(), StringUtils.PATH, fileName, StringUtils.DOT, FileType.ASC.getType() ) );
			FileUtils.move( file.getPath(), newPath.toFile().getPath() );
			
			return newPath;
		} else {
			return path;
		}
	}
	
	/**
	 * Get data date long value with mapstacks file.
	 * 
	 * @param mapStacksPath
	 * @return
	 * @throws Exception
	 */
	public static long getDataDateLong( Path mapStacksPath ) throws Exception {
		MapStacks mapStacks = XMLUtils.fromXML( mapStacksPath.toFile(), MapStacks.class );

		return TimeUtils.toDate(
				Strman.append( mapStacks.getMapStacks().get( 0 ).getStartDate().getDate(), StringUtils.SPACE_WHITE,
						mapStacks.getMapStacks().get( 0 ).getStartDate().getTime() ),
				TimeUtils.YMDHMS, TimeUtils.GMT0 ).getTime();
	}
	
	/**
	 * Build OkHttpClient with timeout setting.
	 * 
	 * @param timeout
	 * @return
	 */
	public static OkHttpClient buildClientWithTimeout( long timeout ){
		return new OkHttpClient().newBuilder()
				.connectTimeout( timeout, TimeUnit.SECONDS )
				.readTimeout( timeout, TimeUnit.SECONDS )
				.writeTimeout( timeout, TimeUnit.SECONDS )
				.build();
	}

	/**
	 * Post API of RiChi Disaster Loss.
	 * 
	 * @param client
	 * @param ascPath
	 * @return
	 * @throws IOException
	 */
	public static String postDisasterLossAPI( HttpClient client, Path ascPath ) throws IOException{
		return postDisasterLossAPI( client, ascPath, EVENT );
	}
	
	/**
	 * Post API of RiChi Disaster Loss.
	 * 
	 * @param client
	 * @param ascPath
	 * @param event
	 * @return
	 * @throws IOException
	 */
	public static String postDisasterLossAPI( HttpClient client, Path ascPath, String event ) throws IOException{
		return postDisasterLossAPI( client, ascPath, event, URL );
	}
	
	/**
	 * Post API of RiChi Disaster Loss.
	 * 
	 * @param client
	 * @param ascPath
	 * @param event
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String postDisasterLossAPI( HttpClient client, Path ascPath, String event, String url ) throws IOException{
		RequestBody requestBody = HttpUtils.createFormDataBody( KEY, ascPath.toFile().getName(), ascPath.toFile() );
		return client.postForm( Strman.append( url, event ), requestBody );
	}
}
