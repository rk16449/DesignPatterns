package main.strategy;
import java.io.File;
import java.util.ArrayList;

public class CompressionContext {
	CompressionStrategy strategy;

	// this can be set at runtime by the application preferences
	public void setCompressionStrategy(CompressionStrategy strategy) {
		this.strategy = strategy;
	}

	// use the strategy
	public void createArchive(ArrayList<File> files) {
		strategy.compressFiles(files);
	}
}
