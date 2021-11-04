import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class ee {
	static long download(String url, String fileName) throws IOException {
	    try (InputStream in = URI.create(url).toURL().openStream()) {
	        return Files.copy(in, Paths.get(fileName));
	    }
	}
	public static void main(String[] args) throws IOException {
		JOptionPane.showMessageDialog(null, <your_descriptions>, <your_title>, JOptionPane.INFORMATION_MESSAGE);
		download(<URL>, <your_path>);
	}
}
