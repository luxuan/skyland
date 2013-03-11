package web.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import config.Page;

public class NewFileUpload  extends HttpServlet {
	 
    //用于存放上传文件的目录
	private String uploadPath = Page.getPath()+"imgs"+File.separatorChar+"shop_images";
	
	// 用于存放临时文件的目录
	private File tempPath = new File("F:"+File.separatorChar+"upload");
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	        throws ServletException, IOException {
		System.out.println("uploadPath:"+uploadPath);
	    res.setContentType("text/html; charset=UTF-8");
	    PrintWriter out = res.getWriter();

	    System.out.println(req.getContentType());
	    
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
	    // 物料代码
	    String itemNo = "";
	    try {
	        List fileItems = upload.parseRequest(req);
	        // assume we know there are two files. The first file is a small
	        // text file, the second is unknown and is written to a file on
	        // the server
	        Iterator iter = fileItems.iterator();
	        while (iter.hasNext()) {
	            FileItem item = (FileItem) iter.next();
	            String name = item.getName();
	            if(name!=null){
		            try {
		                // 保存上传的文件到指定的目录
		            	String filename=uploadPath +File.separatorChar + name;
		                item.write(new File(filename));
		                System.out.println("write:"+filename);
		            } catch (Exception e) {
		                out.println(e);
		            }
	            }
	        }

	    } catch (FileUploadException e) {
	        out.println(e);
	    }
	}

}
