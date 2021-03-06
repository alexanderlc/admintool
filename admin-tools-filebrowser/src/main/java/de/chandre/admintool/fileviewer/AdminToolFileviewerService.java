package de.chandre.admintool.fileviewer;

import java.io.File;
import java.io.IOException;

import de.chandre.admintool.filebrowser.GenericFilebrowserException;

/**
 * 
 * @author Andre
 * @since 1.0.1
 *
 */
public interface AdminToolFileviewerService {

	/**
	 * checks if file is allowed for viewing. throws exception if not.
	 * 
	 * @param file the file to check
	 * @param write check against readOnly 
	 * @throws GenericFilebrowserException
	 */
	void isFileAllowed(File file, boolean write) throws GenericFilebrowserException;

	/**
	 * checks if the file extension is in configured allowed list of extensions
	 * @param file the file to check
	 * @return
	 */
	boolean isExtensionAllowedAndReadable(File file);

	/**
	 * reads the file content
	 * 
	 * @param file the file to read
	 * @param encoding
	 * @return
	 * @throws IOException
	 */
	String readFileToString(File file, String encoding) throws IOException;

	/**
	 * returns the extension of the file
	 * @param file the file to read
	 * @return
	 */
	String getExtension(File file);
	
	/**
	 * checks if the file could be edited
	 * @param file the file to check
	 * @return
	 */
	boolean isChangeable(File file);

	/**
	 * will override the given file with new fileContent
	 * 
	 * @param file the file to write
	 * @param encoding
	 * @param fileContent the new content
	 * @throws IOException
	 */
	void writeStringToFile(File file, String encoding, String fileContent) throws GenericFilebrowserException;

	

}
