package actions.tools;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.struts.upload.FormFile;

import config.Page;

public class Filer {
	public static String saveFile(FormFile formFile)throws Exception{

		String uploadPath = Page.getPath()+"imgs"+File.separatorChar;
		
		String filename=formFile.getFileName();
		String imagePathName=null;
    	String preStr="";
    	File file=null;
    	do{
    		filename=preStr+filename;
    		imagePathName="shop_image"+File.separatorChar + filename;
        	String filepath=uploadPath +imagePathName;
        	file=new File(filepath);
        	preStr="t_"+(int)(Math.random()*1000)+"_";
    	}while(file.exists());

        //将上传文件流保存到磁盘
    	if(Page.Debug)System.out.println("save:"+file.toString());
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(formFile.getFileData());
        fos.flush();
        fos.close();
		return imagePathName;
	}
}
