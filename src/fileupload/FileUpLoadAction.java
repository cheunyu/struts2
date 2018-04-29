package fileupload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author:cheunyu
 * @date:2018/4/29 22:01
 */
public class FileUpLoadAction extends ActionSupport {

    private File myFile;
    private String myFileContentType;
    private String myFileFileName;
    private String destPath;

    public File getMyFile() {
        return myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }

    public String getMyFileContentType() {
        return myFileContentType;
    }

    public void setMyFileContentType(String myFileContentType) {
        this.myFileContentType = myFileContentType;
    }

    public String getMyFileFileName() {
        return myFileFileName;
    }

    public void setMyFileFileName(String myFileFileName) {
        this.myFileFileName = myFileFileName;
    }

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }

    @Override
    public String execute() throws Exception {
        destPath = "d:/temp/";
            System.out.println("Src File name: " + myFile);
            System.out.println("Dst File name: " + myFileFileName);
            File destFile = new File(destPath, myFileFileName);
            FileUtils.copyFile(myFile, destFile);

        return this.SUCCESS;
    }
}
