package web.file;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import config.Page;
import config.ErrorDo;

public class FileUpload{

	public static List<FileItem> getItem(HttpServletRequest request){
		
		// 用于存放临时文件的目录
		File tempPath = new File(Page.getPath()+"imgs"+File.separatorChar+"upload_temp");
	    
	    DiskFileItemFactory factory = new DiskFileItemFactory();
	    // maximum size that will be stored in memory
	    // 设置最多只允许在内存中存储的数据,单位:字节
	    factory.setSizeThreshold(4096);
	    // the location for saving data that is larger than getSizeThreshold()
	    factory.setRepository(tempPath);
	
	    ServletFileUpload upload = new ServletFileUpload(factory);
	    // maximum size before a FileUploadException will be thrown
	    // 设置允许用户上传文件大小,单位:字节
	    upload.setSizeMax(1000000);
	    
	    
	    List<FileItem> fileItems=null;

		try {
			fileItems =upload.parseRequest(request);
		} catch (FileUploadException e) {
			ErrorDo.log(e.toString());
		}
		return fileItems;
	}
}
