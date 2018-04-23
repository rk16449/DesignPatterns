package main.strategy;
import java.io.File;
import java.util.ArrayList;

public class Strategy {
	public void main(String[] args){
		CompressionContext ctx = new CompressionContext();
		
		// Set in settings or in a file etc
		ctx.setCompressionStrategy(new PngCompression());
		
		ArrayList<File> fileList  = new ArrayList<File>();
		
		ctx.createArchive(fileList);
	}
}
